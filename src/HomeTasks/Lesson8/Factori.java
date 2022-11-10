package HomeTasks.Lesson8;

public class Factori {

    private FactoriBody factoriBody = new FactoriBody();
    private FactoriHead factoriHead = new FactoriHead();
    class FactoriBody {
        PartBody bigBody = PartBody.BIG_BODY;
        PartBody middleBody = PartBody.MIDDLE_BODY;
        PartBody smallBody = PartBody.SMALL_BODY;

    }
    class FactoriHead {
        PartHead bigHead = PartHead.BIG_HEAD;
        PartHead middleHead = PartHead.MIDDLE_HEAD;
        PartHead smallHead = PartHead.SMALL_HEAD;
    }

    public FactoriBody getFactoriBody() {
        return factoriBody;
    }

    public FactoriHead getFactoriHead() {
        return factoriHead;
    }
}