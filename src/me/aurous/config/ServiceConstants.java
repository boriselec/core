package me.aurous.config;

public final class ServiceConstants {

	/**
	 * Soundcloud API settings
	 *
	 * @see <a href="https://developers.soundcloud.com/docs">Soundcloud API
	 *      docs</a>
	 */
	public static final class Soundcloud {
		public static final String CLIENT_ID = "";
		public static final Integer MAX_RESULTS = 1000;
		public static final String API_HOST = "api.soundcloud.com";
		public static final String API_SEARCH = "tracks.json";
		public static final String API_SCHEME = "http";
		public static final Integer PER_PAGE = 50; // max is 50 as per the API
		// limits

	}

	/**
	 * Vimeo API settings
	 *
	 * @see <a href="http://developer.vimeo.com/api/start">Vimeo API docs</a>
	 */
	public static final class Vimeo {
		public static final String API_HOST = "api.vimeo.com";
		public static final String API_SEARCH = "videos";
		public static final String API_TOKEN = "";
		public static final String API_SCHEME = "https";
		public static final Integer PER_PAGE = 50; // max is 50 as per the API
		// limits

	}

	/**
	 * Backend API settings for video extractions
	 */
	public static final class Backend {
		public static final String API_HOST = "youtube-dl-api.appspot.com";
		public static final String API_SCHEME = "http";
	}

	/**
	 * Youtube API settings
	 *
	 * @see <a
	 *      href="https://developers.google.com/youtube/v3/docs/search/list">Youtube
	 *      v3 api (search section)</a>
	 */
	public static final class Youtube {
		public static final String API_HOST = "www.googleapis.com";
		public static final String API_SCHEME = "https";
		public static final Integer MAX_RESULTS = 1000; // limit total number of
		// results
		public static final String SAFE_SEARCH = "none";
		public static final String TYPE = "video";
		public static final String KIND_VIDEO = "youtube#video";
		public static final String VIDEO_URL = "https://www.youtube.com/watch?v=%s";
		public static final Integer PER_PAGE = 50; // max is 50 as per the API
		// limits
		public static final String API_SEARCH = "youtube/v3/search";
		public static final String API_TOKEN = "";
	}

	/**
	 * Mp3Skull specific settings
	 */
	public static final class Mp3skull {
		public static final String API_HOST = "mp3skull.is";
		public static final String API_SCHEME = "https";
		public static final String API_SEARCH = "search_db.php";
	}

	/**
	 * PleerEngine specific settings
	 */
	public static final class Pleer {
		public static final String API_HOST = "pleer.com";
		public static final String API_SCHEME = "http";
		public static final String API_SEARCH = "/en/search";
	}

	/**
	 * Mp3WithMe specific settings
	 */
	public static final class Mp3WithMe {
		public static final String API_HOST = "mp3with.me";
		public static final String API_SCHEME = "http";
		public static final String API_SEARCH = "search/";
	}

}