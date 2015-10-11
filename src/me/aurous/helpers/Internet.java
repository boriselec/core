package me.aurous.helpers;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

import me.aurous.exceptions.ExceptionWidget;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class Internet {

	public static Connection connect(final String url) {
		return Jsoup.connect(url);
	}

	public static Document document(final String url) {
		final Connection conn = connect(url);
		try {
			return conn.get();
		} catch (final IOException e) {
			ExceptionWidget widget = new ExceptionWidget(e);
			widget.showWidget();
		}
		return null;
	}

	public static Image image(final String url) {

		try {
			return ImageIO.read(new URL(url));
		} catch (final IOException e) {
			ExceptionWidget widget = new ExceptionWidget(e);
			widget.showWidget();
		}
		return null;
	}

	public static String text(final String url) {

		final StringBuilder builder = new StringBuilder();
		URLConnection conn = null;
		try {
			conn = new URL(url).openConnection();
		} catch (final IOException e) {
			ExceptionWidget widget = new ExceptionWidget(e);
			widget.showWidget();
		}
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
		} catch (final IOException e) {
			ExceptionWidget widget = new ExceptionWidget(e);
			widget.showWidget();
		}
		String input;
		try {
			while ((input = reader.readLine()) != null) {
				builder.append(input);
			}
		} catch (final IOException e) {
			ExceptionWidget widget = new ExceptionWidget(e);
			widget.showWidget();
		}
		return builder.toString();
	}

	public static void postFile(final String playListPath) {

	}

}