/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: HolyGrail.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/13 at 08:40 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

import java.util.Scanner;

/**
 * The HOLEY GRAIIL
 * @author 24wilber
 * @version 9.15.2021
 */
public class HolyGrail {
    /**
     * Main
     * @param args String to input stuff
     */
    public static void main(String[] args) {
        String Name;
        String Quest;
        String Color;
        String[] FirstText = {
            "* A chat with the bridge keeper *\n",
            "Who would cross the Bridge of Death must answer me these\n",
            "questions three, ere the other side he see.\n",
            "King Arthur says, \"You have to know these things when you're a king, you know.\"\n",
        };
        Scanner inputStuffFromTheConsoleSoForExampleThisScannerWillCollectDataFromTheUserInputFromTheConsoleLikeTheNameOfThePersonWhoIsWritingsStuffAndTheSupposedQuestAndTheirFavoriteColorAlthoughIDontKnowThatTheyWillActuallyTypeWhatTheyActuallyThinkIntoThisScannerSlashInputFromTheConsoleOrIfTheGradingSoftwareWillActuallyDoSomethingThatIsATrueThingSoYouNeverKnowWhatWillHappenSoYeaIGuessIDontKnowAndReallyIAmJustHereToComplainAboutHowPeopleStillUseTimesNewRoman__IMeanItIsAnOkayFontButItIsNotTheBest_ItSaysNothing___AndThatsIt_NOTHING_IHateIt__ = new Scanner(System.in);
        for (String s : FirstText) {
            System.out.print(s);
        }
        //MARK - Questions
        System.out.print("Question 1: What is your name? ");
        Name = inputStuffFromTheConsoleSoForExampleThisScannerWillCollectDataFromTheUserInputFromTheConsoleLikeTheNameOfThePersonWhoIsWritingsStuffAndTheSupposedQuestAndTheirFavoriteColorAlthoughIDontKnowThatTheyWillActuallyTypeWhatTheyActuallyThinkIntoThisScannerSlashInputFromTheConsoleOrIfTheGradingSoftwareWillActuallyDoSomethingThatIsATrueThingSoYouNeverKnowWhatWillHappenSoYeaIGuessIDontKnowAndReallyIAmJustHereToComplainAboutHowPeopleStillUseTimesNewRoman__IMeanItIsAnOkayFontButItIsNotTheBest_ItSaysNothing___AndThatsIt_NOTHING_IHateIt__.nextLine();
        System.out.print("Question 2: What is your quest? ");
        Quest = inputStuffFromTheConsoleSoForExampleThisScannerWillCollectDataFromTheUserInputFromTheConsoleLikeTheNameOfThePersonWhoIsWritingsStuffAndTheSupposedQuestAndTheirFavoriteColorAlthoughIDontKnowThatTheyWillActuallyTypeWhatTheyActuallyThinkIntoThisScannerSlashInputFromTheConsoleOrIfTheGradingSoftwareWillActuallyDoSomethingThatIsATrueThingSoYouNeverKnowWhatWillHappenSoYeaIGuessIDontKnowAndReallyIAmJustHereToComplainAboutHowPeopleStillUseTimesNewRoman__IMeanItIsAnOkayFontButItIsNotTheBest_ItSaysNothing___AndThatsIt_NOTHING_IHateIt__.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        Color = inputStuffFromTheConsoleSoForExampleThisScannerWillCollectDataFromTheUserInputFromTheConsoleLikeTheNameOfThePersonWhoIsWritingsStuffAndTheSupposedQuestAndTheirFavoriteColorAlthoughIDontKnowThatTheyWillActuallyTypeWhatTheyActuallyThinkIntoThisScannerSlashInputFromTheConsoleOrIfTheGradingSoftwareWillActuallyDoSomethingThatIsATrueThingSoYouNeverKnowWhatWillHappenSoYeaIGuessIDontKnowAndReallyIAmJustHereToComplainAboutHowPeopleStillUseTimesNewRoman__IMeanItIsAnOkayFontButItIsNotTheBest_ItSaysNothing___AndThatsIt_NOTHING_IHateIt__.nextLine();

        System.out.println("Your name is: "+Name);
        System.out.println("Your quest is: "+Quest);
        System.out.println("Your favorite color is: "+Color);
        System.out.println("* end of program *");
        inputStuffFromTheConsoleSoForExampleThisScannerWillCollectDataFromTheUserInputFromTheConsoleLikeTheNameOfThePersonWhoIsWritingsStuffAndTheSupposedQuestAndTheirFavoriteColorAlthoughIDontKnowThatTheyWillActuallyTypeWhatTheyActuallyThinkIntoThisScannerSlashInputFromTheConsoleOrIfTheGradingSoftwareWillActuallyDoSomethingThatIsATrueThingSoYouNeverKnowWhatWillHappenSoYeaIGuessIDontKnowAndReallyIAmJustHereToComplainAboutHowPeopleStillUseTimesNewRoman__IMeanItIsAnOkayFontButItIsNotTheBest_ItSaysNothing___AndThatsIt_NOTHING_IHateIt__.close();
    }
}