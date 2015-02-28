package board;

import java.util.Comparator;

public class MessageComparator implements Comparator<Message> {



		@Override
		public int compare(Message first, Message last) {
			
			if(first.getSize() == last.getSize()){ return 0;}
			
			return ( first.getSize() > last.getSize()) ? -1 : 1;
		}
}
