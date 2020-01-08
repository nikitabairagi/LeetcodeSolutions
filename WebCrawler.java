/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        HashSet<String> set  = new HashSet<>();
        
        queue.add(startUrl);
        set.add(startUrl);
        result.add(startUrl);
        String currUrlHostName = getHost(startUrl);
        
        while(!queue.isEmpty()){
            String currUrl = queue.poll();
           
            List<String> urlList = htmlParser.getUrls(currUrl);
            for(String url : urlList){
                
                String hostname = getHost(url);
                
                if(hostname.equals(currUrlHostName) && !set.contains(url) ){
                    queue.add(url);
                    set.add(url);
                    result.add(url);
                }
            } 
        }
        
        return result;
    }
    
    public String getHost(String url){
        try{
            java.net.URL u = new java.net.URL(url);
            return u.getHost();
        }catch(Exception MalformedURLException){
            return "error";
        }
    }
}
