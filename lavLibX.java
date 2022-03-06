import java.util.Scanner;
import java.util.Random;
public class lavLibX
{
    public static void main(String args[]) {
        
        String heroName;
        int hHealth;
        int hAttack;
        String answer;
        boolean bRoll = false;

        Scanner sc=new Scanner(System.in); //create new scanner
        Random rand = new Random();
        int randomNum = rand.nextInt((12 - 1) + 1) + 1;

        System.out.println("Type your name and press enter: ");
        heroName = sc.nextLine();
        System.out.println("\n\n\nWelcome, " + heroName + ".");
        
        /*System.out.println("\nWelcome, " + heroName + ". \nType 'roll' and press enter to roll the dice and set your first stat.");


        answer = sc.nextLine();
        if("roll".equals(answer)) {
            hHealth = rand.nextInt((12 - 6) + 1) + 1;
            System.out.println("Your maximum health is " + hHealth + ". Roll again to find out your attack. Type 'roll': ");
        }
        answer = sc.nextLine();
        if ("roll".equals(answer)) {
            hAttack = rand.nextInt((12 - 1) + 1) + 1;
            System.out.print("Your maximum attack value is " + hAttack + ".");

            if (hAttack < 4) {
          System.out.println("Not everyone is born a fighter. You may wish to avoid combat, and use other skills to overcome challenges.");
            }

            else if (hAttack > 8) {
            System.out.println("Be careful...Remember, actions have consequences. You may wish to avoid combat except with mortal enemies.");
            }
        }*/
        
        
        System.out.println("\n\n\n\nYour story begins in a kingdom far far away. \n\n\n\nThe kingdom has been under threat of war for quite some time now, as famine has ravaged much of the land. \n\nCrops have suffered, people have gone hungry, and many blame the leadership of their kingdom...King Joseph.\n\n The King's health has worsened over the past several months, and as he has no sons to take his place, he has two choices: to marry his daughter, Princess Sofia, to a suitable man, or surrender control to the next in line - his malicious brother, the Duke. \n\n\n To continue the story, press the 'enter' key to view the next item.");
                 
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("You, " + heroName + ", have been working at the castle as a page since you were a child.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("Sofia, the princess, grew alongside you. Though you were of different classes, a friendship emerged...");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("you were as close as could be. You, two young girls trying to live outside the lines of what was expected of you.");
                         
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nYou were expected to fulfill subservience to those of the upper classes, barred from improving your or your family's situation by any meaningful amount.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nSofia, though she enjoyed the benefits of wealth and security, felt just as stifled.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nBut when the two of you were together, it was as if all of those limitations dissolved. Whenever you could, you would spend every possible moment together.");
          
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nAfter dark, when you were permitted reprieve from the errands and labour that befitted a page, Sofia knew to meet you in the southernmost tower, where others seldom went.");
          
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nIt was time and space devoted only to you. Talking for hours, looking out at the world at each other's sides. In the day, there were limitations.");
          
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nBut after the sun had set and the moon had risen in its place, the entirety of the world shifted. The sky stretched out before you, no longer burdened with a stark horizon.");
          
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nPeppered with stars, streaked with cloud, or fully blackened with storm, those moments were...limitless.");
          
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\n\n\nFor years you walked there, tired from your day's labour but energized by the thought of seeing her, and hoped that she would come.");
          
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nSome nights, you knew that her father or her matron kept a closer eye, and so there you would sit, feeling more than anything the space which she left in her wake.");  
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("But rather than strike pain in your heart, every second you spent apart only made your feelings grow stronger.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\n\n\nOn the eve of Midsummer, when the days were the longest they could ever be and the scent of new life permeated the land, you trekked to the southern tower with the lightness of a songbird.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nThis had been your ritual for several years now, and you were soon to bud into adulthood. Though you walked lightly, your heart thudded in your chest.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nOften, Sofia would read to you. Poems of love, odes to beauty, philosophies of the universe.");
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nAs time went on, you understood better the golden feeling of unbound love which was so celebrated in those words. Each step taken closer to your rendezvous lit your heart aflame, and each time she was there with you the flames were not extinguished but fanned hotter.\n");
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nSo now we are here - on this night, this eve of Midsummer. you step into the rounded chamber atop the tower and feel your heart stutter.");
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nSofia sits, a book cradled in her hands. But something has changed - the glittering smile which normally adorns her lovely face is replaced with a mournful defeat.");
        
        int loveStr = 5;
        
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.print("\nSlowly, you walk to her, and take a seat. It has never felt strange to be so close to her, despite the coarseness of your garb and  the luxury of hers. But tonight, it feels for the first time that something may have changed.");
                         
        try{System.in.read();}
            catch(Exception e){}
        
        System.out.println("\nSofia takes your hand, your fingers weaving together as if they were always meant to be. You pause, and say: \n(1) The stars are beautiful tonight. Shall we look at them together, as we always do? \n(2) What is wrong? \n(3) You could show a little more enthusiasm. \n\n");
        
        int ansNum;
        int ok = 1;
        int good = 2;
        int bad = 3;
       
        char ansChar;
        boolean yesNo = false;
        char yes = 'y';
        char no = 'n';
        
        System.out.println("Type 1, 2, or 3 and press Enter.");
        ansNum = sc.nextInt();
        
     /*   while ((ansNum != okNum) && (ansNum != goodNum) && (ansNum != badNum)) {
            System.out.println("Type 1, 2, or 3 and press Enter.");
            ansNum = sc.nextInt();
            System.out.println("You chose option " + ansNum);
        }*/
           
        if (ansNum == ok) {
            System.out.println("\n\n" + heroName + ": The stars are beautiful tonight. Shall we look at them together, as we always do?");
            loveStr = loveStr + 0;
                             
                try{System.in.read();}
                    catch(Exception e){}

                System.out.println("\nSofia takes a deep breath, and sighs. \nSofia: " + heroName + ", I'm afraid I cannot appreciate them tonight. There is something weighing heavy on my mind...could I read you something?");
            
                System.out.println("Enter y/n");
                ansChar = sc.next().charAt(0);
                    if (ansChar == 'y') {
                        yesNo = true;
                    }
            
                    if (yesNo) {
                        System.out.println("Sofia: I fear that change is coming...in fact, I know that it is. \n She opens the book, to a page bookmarked by a pressed flower - one which you had given her at the close of summer last.");
                        
                        try{System.in.read();}
                        catch(Exception e){}
        
                        System.out.print("\nSofia: Where are my kindred? \nWhere is the giver of treasure?");
                        
                        try{System.in.read();}
                        catch(Exception e){}
        
                        System.out.print("\nSofia: Where are the benches to bear us? \nJoys of the hall to bring us together?");
                        
                        try{System.in.read();}
                        catch(Exception e){}
        
                        System.out.print("\nSofia: All gone, the mailed warrior! \nLost for good, the pride of princes!");
                        
                        try{System.in.read();}
                        catch(Exception e){}
        
                        System.out.print("\nSofia: How the space of years has spread - \ngrowing gloomy beneath the night-helm, \nas if it never was!");
                        
                        try{System.in.read();}
                        catch(Exception e){}
        
                        System.out.print("\nShe sets her book once again in her lap and turns to you, her eyes alight with emotion.");

                        try{System.in.read();}
                        catch(Exception e){}
        
                        System.out.println("\nDo you: \n(1) embrace her. \n(2) laugh. \n(3) say: 'What was that all about? Seems dramatic.'");  
                        ansNum = sc.nextInt();
                            if (ansNum == ok) {System.out.println("ok");}
                            else if (ansNum == good) {System.out.println("good");}
                            else if (ansNum ==bad) {System.out.println("bad");}
                    }
                    //FIXMEEEEEEEEEE add the NO option
        }
        
         else if (ansNum == good) {
            System.out.println("\n\n" + heroName + ": What is wrong?");
            loveStr = loveStr + 1;
        }
         else if (ansNum == bad) {
            System.out.println("\n\n" + heroName + ": You could show a little more enthusiasm.");
            loveStr = loveStr - 1;
        }
            
        try{System.in.read();}
            catch(Exception e){}
        
       // System.out.println("\nSofia 
                         

        
        
    }
}

