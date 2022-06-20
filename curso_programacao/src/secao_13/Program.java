package secao_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import secao_13.enums.Comment;
import secao_13.enums.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow, that´s aewsome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I´m going to visit this wonderful country!", 12);

		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);

	}

}
