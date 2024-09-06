import java.util.List;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        Action action=new Action();
        // Kannada Songs
        action.addMusic(new Music("Karunadu Thanaye", "Gandhada Gudi", "Rajkumar", "Kannada", 1973));
        action.addMusic(new Music("Anisuthide", "Mungaru Male", "Sonu Nigam", "Kannada", 2006));
        action.addMusic(new Music("Jothe Jotheyali", "Geetha", "S. P. Balasubrahmanyam", "Kannada", 1981));
        action.addMusic(new Music("Chalisuva Cheluve", "Suprabhatha", "Rajkumar", "Kannada", 1988));
        action.addMusic(new Music("Neene Neene", "Akash", "Sonu Nigam", "Kannada", 2005));
        action.addMusic(new Music("Bombe Helutaite", "Raaja Nanna Raja", "Rajkumar", "Kannada", 1976));
        action.addMusic(new Music("Belakina Kavithe", "Hrudaya Haadithu", "S. Janaki", "Kannada", 1989));
        action.addMusic(new Music("Ninna Danigaagi", "Shanti Nivaasa", "Sonu Nigam", "Kannada", 2007));
        action.addMusic(new Music("Nooru Janmaku", "America America", "K. S. Chithra", "Kannada", 1996));
        action.addMusic(new Music("Gaali Maathu", "Chalisuva Modagalu", "S. P. Balasubrahmanyam", "Kannada", 1982));

        action.addMusic(new Music("Neene Neene", "Akash", "Sonu Nigam", "Kannada", 2005));
        action.addMusic(new Music("Ninna Nodalenthu", "Milana", "Sonu Nigam", "Kannada", 2007));
        action.addMusic(new Music("Male Nintu Hoda Mele", "Milana", "Sonu Nigam", "Kannada", 2007));
        action.addMusic(new Music("Kanasalu Neene Manasalu Neene", "Cheluvina Chittara", "Sonu Nigam", "Kannada", 2007));
        action.addMusic(new Music("Onde Usiranthe", "Raaj The Showman", "Hemanth Kumar", "Kannada", 2009));
        action.addMusic(new Music("Nagu Endhidhe", "Bangarada Manushya", "P. B. Sreenivas", "Kannada", 1972));
        action.addMusic(new Music("Love Me or Hate Me", "Crazy Star", "Vijay Prakash", "Kannada", 2014));
        action.addMusic(new Music("Odu Santhoshakke", "Geetha", "Rajkumar", "Kannada", 1981));
        action.addMusic(new Music("Yeko Yeno", "Super", "Vijay Prakash", "Kannada", 2010));
        action.addMusic(new Music("Jotheyali", "Geetha", "S. P. Balasubrahmanyam", "Kannada", 1981));

        // Telugu Songs
        action.addMusic(new Music("Evare", "Premam", "Vijay Yesudas", "Telugu", 2016));
        action.addMusic(new Music("Butta Bomma", "Ala Vaikunthapurramuloo", "Armaan Malik", "Telugu", 2020));
        action.addMusic(new Music("Samajavaragamana", "Ala Vaikunthapurramuloo", "Sid Sriram", "Telugu", 2020));
        action.addMusic(new Music("Inkem Inkem", "Geetha Govindam", "Sid Sriram", "Telugu", 2018));
        action.addMusic(new Music("Pachani Chiluka", "Mutyala Muggu", "S. P. Balasubrahmanyam", "Telugu", 1975));
        action.addMusic(new Music("Mellaga Tellarindoi", "Rudraveena", "K. J. Yesudas", "Telugu", 1988));
        action.addMusic(new Music("Nee Kallathoti", "Student No. 1", "K. K.", "Telugu", 2001));

        action.addMusic(new Music("Ramulo Ramula", "Ala Vaikunthapurramuloo", "Anurag Kulkarni", "Telugu", 2020));
        action.addMusic(new Music("Seethakalam", "Son of Satyamurthy", "Yazin Nizar", "Telugu", 2015));
        action.addMusic(new Music("Darshana", "Arjun Reddy", "Shaasha Tirupati", "Telugu", 2017));
        action.addMusic(new Music("Vachinde", "Fidaa", "Madhu Priya", "Telugu", 2017));
        action.addMusic(new Music("Maguva Maguva", "Vakeel Saab", "Sid Sriram", "Telugu", 2021));
        action.addMusic(new Music("Maate Vinadhuga", "Taxiwaala", "Sid Sriram", "Telugu", 2018));
        action.addMusic(new Music("Yemaindo", "Ala Modalaindi", "Karthik", "Telugu", 2011));
        action.addMusic(new Music("Nuvvostanante", "Varsham", "Shreya Ghoshal", "Telugu", 2004));

        // Tamil Songs
        action.addMusic(new Music("Munbe Vaa", "Sillunu Oru Kaadhal", "Shreya Ghoshal", "Tamil", 2006));
        action.addMusic(new Music("Kannana Kanne", "Viswasam", "Sid Sriram", "Tamil", 2019));
        action.addMusic(new Music("Vennilave Vennilave", "Minsara Kanavu", "Hariharan", "Tamil", 1997));

        action.addMusic(new Music("Aalaporan Thamizhan", "Mersal", "A. R. Rahman", "Tamil", 2017));
        action.addMusic(new Music("Rowdy Baby", "Maari 2", "Dhanush", "Tamil", 2018));



        //============================================================================================================================================

        //To print all the songs in list
         //List<Music> allSongs=action.getAllSongs();

        // for(Music music:allSongs){
        //     System.out.println(music);
        // }
        //using stream api

        //allSongs.stream().forEach(m->System.out.println(m));

        //===========================================================================================================
        //Find particular product
         //Music one_detail=action.getOneDetail("Anisuthide");
        // System.out.println(one_detail);
        

        //===========================================================================================================
        //Find particular text
        //List<Music> allText=action.allText("kannada");

        // for(Music text:allText){
        //     System.out.println(text);
        //  }

        //using stream api
        //allText.stream().forEach(m->System.out.println(m));
        
        //===========================================================================================================
        //Find by ex:language any parameter

        //List<Music> allLang=action.getLanguageSongs("kannada");
        //  for(Music mu:allLang){
        //      System.out.println(mu);
        //  }
        //Using stream to print all the lsit values
        //allLang.stream().forEach(m->System.out.println(m));




        //===========================================================================================================

        //Find songs relearsed after 2010

        //List<Music> allyear=action.getSongsOfYear(2010);
        // for(Music year:allyear){
        //     System.out.println(year);
        // }
        //Using stream to print all list values
        //allyear.stream().forEach(m->System.out.println(m));

    }
}