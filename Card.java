   import javax.swing.*;


public class Card
{
   //front image 
   //back image 
   //value of the card   
   private ImageIcon front;
   private ImageIcon back;
   private int rank;


   //constructor 
   public Card(ImageIcon file, int rank)
   {
      back = new ImageIcon("back_black_card.jpg");
      front = file;
      this.rank = rank;
   }


   //get image value
   public ImageIcon getBack()
   {
      return back;
   }
   
   public ImageIcon getFront()
   {
      return front;
   }
   
   //get card value  
   public int getRank()
   {
      return rank;
   }

}