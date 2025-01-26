
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageHelper
{
   public static byte[][][] LoadImage(String FileName) throws Exception
   {
      BufferedImage img=ImageIO.read(new File(FileName));
      if(img.getType()!=BufferedImage.TYPE_3BYTE_BGR)
      {
         return null;
      }
      int Width=img.getWidth();
      int Height=img.getHeight();

      // Pobranie danych rastrowych
      int[] buff=new int[Width*Height*3];
      img.getRaster().getPixels(0,0,Width,Height,buff);

      // Przetworzenie na tablice kolorów
      byte[][][] clr=new byte[Height][Width][3];
      for(int h=0,p=0;h<Height;++h)
      {
         for(int w=0;w<Width;++w)
         {
            clr[h][w][0]=(byte)buff[p++];
            clr[h][w][1]=(byte)buff[p++];
            clr[h][w][2]=(byte)buff[p++];
            //++p;
         }
      }
      return clr;
   }

   public static void SaveImage(String FileName,byte[][][] clr) throws Exception
   {
      int Height=clr.length;
      int Width=(Height>0?clr[0].length:0);
      int[] buff=new int[Width*Height*3];

      // Przetworzenie na dane rastrowe
      for(int h=0,p=0;h<Height;++h)
      {
         for(int w=0;w<Width;++w)
         {
            buff[p++]=clr[h][w][0];
            buff[p++]=clr[h][w][1];
            buff[p++]=clr[h][w][2];
            //buff[p++]=255;
         }
      }

      BufferedImage img=new BufferedImage(Width, Height, BufferedImage.TYPE_3BYTE_BGR);
      // Zapisane danych rastrowych
      img.getRaster().setPixels(0,0,Width,Height,buff);

      // Zapis pliku
      ImageIO.write(img,"png",new File(FileName));
   }
}
