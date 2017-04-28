package common.test;

import java.util.ArrayList;

import common.parser.ReadCsv;
import common.parser.Remover;
import common.parser.Tokenizer;
import common.parser.WriteFile;
import dist.index.TweetParser;

public class TestReadFile {

	public static void main(String[] args) {
		//String dir1 = "F:/LSH/dataset/testdata.manual.2009.06.14.csv";
		//String dir2 = "F:/LSH/dataset/millionsTweets.csv";
		String directory = args[0];
		String filePath = args[1];
		String outputTweetsName = "tweetsByte.txt";
		String outputDicName = "dictionary.txt";
		char delimiter = ',';
		ReadCsv reader = new ReadCsv();
		ArrayList<String> tweets = new ArrayList<String>();
		/*
		 * Tokenizer spliter = new Tokenizer(); Remover remover = new Remover();
		 */
		tweets = reader.readCsvFileTweetVector(directory, delimiter);

		/*for (int i = 0; i < tweets.size(); i++) {
			System.out.println("tweet_" + i + ": " + tweets.get(i));

			String[] words = spliter.splitTweetToWords(tweets.get(i));
			ArrayList<String> clearWords = remover
					.removeMeaninglessWords(words);
			for (int j = 0; j < clearWords.size(); j++) {
				System.out
						.println("index:" + j + "|" + clearWords.get(j) + "|");
			}

		}*/
		
		//12312131231213123
		TweetParser tweetP = new TweetParser();
		tweetP.parseTweet(tweets, filePath, outputDicName, outputTweetsName);
		
		
		
		//int dimension = tweetsByte.get(0).length;
		
		/*for(int i=0; i<tweetsByte.size(); i++){
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<tweetsByte.get(i).length; j++){
				sb.append(tweetsByte.get(i)[j]);
			}
			
			System.out.println("Index_"+i+":|"+sb+"|");
		}*/
		//WriteFile wf = new WriteFile();
		//wf.writeTxtFile(filePath, outputTweetsName, tweetsByte);
		
		System.out.println("Done");

	}

}
