package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FriendsForeverGame {
    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<String> questions = new ArrayList<>(Arrays.asList("How do you implement agile in your team",
                "Describe your daily activity", "tell me about your current project", "what is software testing",
                "What is Software Requirements Specification?", "Software Development Life Cycle (SDLC) - What is SDLC?",
                "Software Testing Life Cycle (STLC) - What is STLC?", "What is the difference between STLC and SDLC?", "What is requirement?",
                "Where is the requirement coming from?", "When the testing starts?", "How to tell if the requirement is good or bad?",
                "Why we test?", "What is tester’s main responsibility?", "Is 100% testing possible?", "What is testing hierarchy?",
                "What is positive testing ?Happy Path testing?", "What is 508 Compliance testing?", " What is risk-based testing?",
                "How long did it take to build this regression suite?", "How many environments you have?", "Which part of regression test should be automated?",
                "Tell us one challenge while running regression suite? ", " How do you ensure that your regression tests are effective?", "What is Functional testing? ",
                " What is non-functional testing?", "What is unit testing? Have you ever done unit testing? ", " What is component testing?", "What is black box testing?What are the different black box testing techniques? ",
                " What is Equivalence partitioning testing?", "What is Boundary value testing? ", "Why does the boundary value analysis provide good test cases? ",
                "  Why we use decision tables?", "In white box testing what do you verify? ", " What is Gray Box Testing?", "What is the difference between static and dynamic testing? ",
                "What is Integration Testing? ", "What is Scalability Testing? ", "What is Storage Testing? ", "What is Stress Testing? ", "What is maintenance testing? ", "What is Test Harness? ", "What is test coverage? ",
                " What is a V-Model?", " What is Acceptance testing?", "What is the difference between UAT (User Acceptance Testing) and System testing? ", "What is Agile? ", "Why do we need Agile? Waterfall and Agile? ",
                " Scrum is an Agile framework, right? Name few other Agile frameworks.", "How do you describe a scrum team? ", "What is a negative test case? ", "What is Burn Down Chart? ",
                " What is Verification and Validation?", "What is Definition of Ready? ", "What is User Story? ", "What is parking lot? ", "What is sprint workflow? ",
                " What is an Epic?", "What is Acceptance criteria?", "What types of Test cases? ", "Test Case? ", " How many Test cases (in your regression suite) do you usually complete in a week?",
                " What are the steps you take to automate?", "What percent age of position is automation vs manual? ", "When do you choose automated testing over manual testing? ",
                " When do you do automation in your sprint?", "What is Test Plan? ", "What is a peer review? ", "How can you tell when enough test cases have been created to adequately test a system or module? ",
                " Who approves test cases?", "Who writes test plans and test cases? ", "What is the purpose of test design technique? ", "Difference between Test case and Test script? ",
                " What should be included in a test strategy?", "What will you do when script fails? ", "Test Scenario? ", "What are the functional testing types? ",
                "What is the difference between regression testing and retesting?", "Explain the difference between bug severity and bug priority. ", "What is the difference between system testing and integration testing?",
                " Alpha and Beta Testing? " + " When is a test considered to be successful?", "What is defect? ", " What is Defect Life Cycle (DLC)?", "What to do when you find a defect? ",
                " If developer says not a defect, what to do?", "Can you test a program and find 100% of the errors? ", "What is the difference between debugging and testing? ",
                " How should testing be conducted?", " When should testing be stopped?", "What is considered to be a good test? ",
                "Have you performed tests on the front-end and the back-end?", " What is difference between Front End Testing and Back End testing?", "What is the most difficult problem you’ve found during testing? ",
                " What is Automation Testing?", "What tests can be automated? ", " When will you NOT automate?", "What is Velocity? ", "What do you know about impediments in Scrum? Give some examples of impediments. ",
                " What is the difference and similarity between Agile and Scrum?", "Do you know about Agile Manifesto & its Principles? Explain in brief. ",
                " are there any drawback of the Agile model? If yes, explain.", " Define Zero Sprint and Spike in Agile.", "What do you know about a story point in Scrum? ", " why does Scrum encourage the use of automated testing for projects?",
                "How is agile testing methodology different from other testing methodologies? "));


        ArrayList<String> players = new ArrayList<>(Arrays.asList("Ayse","Galyna", "Inci", " Esma", " Jeren"));
        System.out.println(questions.get(rnd.nextInt(105)) + "===>" + players.get(rnd.nextInt(4)));

    }
}
