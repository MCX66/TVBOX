public static boolean isVideoLinkEnhanced(String url) {
    String regex = ".*\\.(mp4|avi|mov|wmv|flv|webm|mkv|m4v|3gp|ogv|rm|rmvb|m3u8)(\\?.*)?$";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    return pattern.matcher(url).matches();
}
