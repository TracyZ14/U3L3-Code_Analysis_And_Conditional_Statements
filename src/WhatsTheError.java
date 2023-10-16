/*
// Version I
public class WhatsTheError
{
    private int score;
    public WhatsTheError (int score)
    {
        this.score = score;
    }
    public String grade()
    {
        String grade = "";
        if (score >= 90)
        {
            grade = "A";
        }
        else if (score >= 80)
        {
            grade = "B";
        }
        else if (score >= 70)
        {
            grade = "C";
        }
        else if (score >= 60)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        return grade;
    }
}
*/

/*
// Version II
public class WhatsTheError
{
    private int score;
    public WhatsTheError (int score)
    {
        this.score = score;
    }
    public String grade()
    {
        if (score >= 90)
        {
            return "A";
        }
        if (score >= 80)
        {
            return "B";
        }
        if (score >= 70)
        {
            return "C";
        }
        if (score >= 60)
        {
            return "D";
        }
        if (score < 60)
        {
            return "F";
        }
    }
}
*/

/*
// Version III
public class WhatsTheError
{
    private int score;
    public WhatsTheError (int score)
    {
        this.score = score;
    }
    public String grade()
    {
        if (score >= 90)
        {
            return "A";
        }
        if (score >= 80)
        {
            return "B";
        }
        if (score >= 70)
        {
            return "C";
        }
        if (score >= 60)
        {
            return "D";
        }
        return "F";
    }
}
*/