package org.com.tour.util.nlp;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.Span;

import java.io.FileInputStream;
// import opennlp.tools.sentdetect.SentenceDetector;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@Component
public class SentenceDetectorImpl {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        try {
//            new SentenceDetectorImpl().sentenceDetect("test");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }		
//	}
	
    /**
     * This method is used to detect sentences in a paragraph/string
     * @throws InvalidFormatException
     * @throws IOException
     */
	@Transactional
    public String[] sentenceDetect(String paragraph) throws InvalidFormatException, IOException {
//        String paragraph = "\"Joe Smith was born in California."
//        		+ "		      \"In 2017, he went to Paris, France in the summer."
//        		+ "		      \"His flight left at 3:00pm on July 10th, 2017. "
//        		+ "		      \"After eating some escargot for the first time, Joe said, "
//        		+ "		      \"He sent a postcard to his sister Jane Smith. "
//        		+ "		      \"After hearing about Joe's trip, Jane decided she might go to France one day."; 
        
    	System.out.println("paragraph String array to String :    " + paragraph);     
                
        // refer to model file "en-sent,bin", available at link http://opennlp.sourceforge.net/models-1.5/
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream("en-sent.bin");
        // InputStream is = new FileInputStream("en-sent.bin");
        SentenceModel model = new SentenceModel(is);
         
        // feed the model to SentenceDetectorME class 
        SentenceDetectorME sdetector = new SentenceDetectorME(model);
         
        // detect sentences in the paragraph
        String sentences[] = sdetector.sentDetect(paragraph);
                        
        // print the sentences detected, to console
        for(int i=0;i<sentences.length;i++){
            System.out.println(sentences[i]);
        }        
        is.close();
        
        return sentences; 
    }
	
}
