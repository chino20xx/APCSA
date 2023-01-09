import java.util.Random;
class Main {
  public static void main(String[] args) {
       // 1. Declare 4 arrays and initialize them to the given values.
       // Countries: China, Egypt, France, Germany, India, Japan, Kenya, Mexico, United Kingdom, United States
       // Capitals: Beijing, Cairo, Paris, Berlin, New Delhi, Tokyo, Nairobi, Mexico City, London, Washington D.C.
       // Languages: Chinese, Arabic, French, German, Hindi, Japanese, Swahili, Spanish, English, English
    String[] countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
    String[] capitals = {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
    String[] languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
       
       // 2. Pick a random number up to the length of one of the arrays and save in the variable index
Random randomNum = new Random();
int index = randomNum.nextInt(10);
    
       // 3. Print out the info in each array using the random index  
System.out.println("Country: " + countries[index]);
  System.out.println("Capital: " + capitals[index]);
  System.out.println("Language: " + languages[index]);

  }
}