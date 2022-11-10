package HomeTasks.Lesson8;

public class Robot {
    private String name;
    private PartBody partBody;
    private PartHead partHead;

    public Robot(String name, PartBody partBody, PartHead partHead) {
        this.name = name;
        this.partBody = partBody;
        this.partHead = partHead;
    }

    @Override
    public String toString() {
        return
                "name Robot -- " +  name  +
                "  partBody =  " + partBody.nameBody +
                "  partHead =  " + partHead.nameHead;

    }


}


