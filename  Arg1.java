class Arg1{
    static String [] listOfemails = {null,null,null,null};
     static int index =0 ;
    public static void emailDetails(String emails){
        if(listOfemails != null){
            if(index < listOfemails.length){
                listOfemails[index]=emails;
                index++;
                System.out.println("Added successfully");
            }
                else { 
                    System.out.println("Email is full");
                }
                
            }
            else{
                System.out.println("Email is null");
            }
        }

    }
