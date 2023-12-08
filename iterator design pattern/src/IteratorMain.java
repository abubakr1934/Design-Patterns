public class IteratorMain {
    public static void main(String[] args) {
        Container channelRepository=new ChannelRepository();
        Iterator i= channelRepository.getIterator();
        while(i.hasNext())
        {
            String cname=(String)i.next();
            System.out.println("name  of channel is "+cname);
        }
    }
}
