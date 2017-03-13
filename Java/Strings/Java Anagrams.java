    static boolean isAnagram(String str1, String str2) {
        
        boolean result = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        //Different length strings cannot be anagrams
        if(str1.length() != str2.length()) {
            result = false;
        }
        else {
            //Convert both strings to char array and compare them after sorting
            char[] arr1 = new char[str1.length()];
            char[] arr2 = new char[str2.length()];
            for(int i = 0; i < str1.length(); i++) {
                arr1[i] = str1.charAt(i);
                arr2[i] = str2.charAt(i);
            }    
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)) {
                result = true;
            }
            else {
                result = false;
            }
        }
        return result;
    }