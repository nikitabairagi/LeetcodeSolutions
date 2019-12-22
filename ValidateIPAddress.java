class Solution {
    public String validIPAddress(String IP) {
        
        
        String[] strIPV4 = IP.split("\\.",-1);
        String[] strIPV6 = IP.split(":",-1);
        
        if(strIPV4.length == 4){
            for(int i=0 ;i<4; i++){
                int n = 0;
                try{
                   n = Integer.parseInt(strIPV4[i]);
                }catch(NumberFormatException e){
                    return "Neither";
                }
               
                if(n > 255 || n < 0 || (strIPV4[i].charAt(0) == '0' && strIPV4[i].length() > 1) || strIPV4[i].charAt(0) == '-'){
                    return "Neither";
                }
            }
            
            return "IPv4";

        }else if(strIPV6.length == 8){
            for(int i=0; i<8; i++){
             
                if(!strIPV6[i].matches("-?[0-9a-fA-F]+") || strIPV6[i].length() > 4 || strIPV6[i].length() == 0 || strIPV6[i].charAt(0) == '-'){
                    return "Neither";
                }
            }
            
            return "IPv6";
        }
        
        return "Neither";
        
    }
}
