package advanced;

import java.util.Random;
import java.util.Scanner;

public class QuestionService {
    Questions questions[] = new Questions[5];
    String answers[] = new String[5];
    public QuestionService(){
        for(int i=1; i< questions.length+1; i++) {
            int j=0;
            questions[i-1] = new Questions(i, "Question No " + i, "Opt1", "Opt2" ,  "Opt3", "Opt4", "Opt" + getRandomNumber());
        }
    }
    int getRandomNumber()
    {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
    public  void  showQuestions() {
        int i = 0;
        int score = 0;
        for (Questions q : questions) {
            System.out.println(q.getId() +" "+q.getQuestion());
            System.out.println("a) "+q.getOpt1()+ "    b) "+q.getOpt2());
            System.out.println("c) "+q.getOpt3()+ "    d) "+q.getOpt4());
            System.out.println(q.getAnswer());
            System.out.println("Type your answer, and press enter. Answer...");
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();
            answers[i] = ans;
            if(ans.equals(q.getAnswer())) {
                System.out.println("Good Job, Correct Answer");
                score = score + 1;
            }
            else
                System.out.println("Wrong Answer, The correct answer is: "+q.getAnswer());
            i++;
        }
        System.out.println("You secure " +score +" out of "+questions.length);
    }
}
