public class ChannelRepository implements Container{
    static String Channelnames[] = {"Sony Pal" , "SAB TV" ,"History TV" , "Discovery TV"};
    @Override
    public Iterator getIterator() {
        return new ChanelIterator();
    }
    class ChanelIterator implements Iterator{
        int index=0;

        @Override
        public boolean hasNext() {
            if(index<Channelnames.length)
            {
                return true;
            }
            return false;

        }

        @Override
        public Object next() {
            if(hasNext())
                return Channelnames[index++];
            return null;
        }
    }
}
