package nlp.core;

import org.bitbucket.eunjeon.seunjeon.Analyzer;
import utils.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junhomax on 2017-11-08.
 */
public class MorphemeAnalyzer {
    private static MorphemeAnalyzer instance = new MorphemeAnalyzer();
    private MorphemeAnalyzer() {
    }

    public MorphemeAnalyzer getInstance() {
        return instance;
    }

    public boolean init() {
        try {
            // invoke once.
            Analyzer.parse("");
            Analyzer.parseEojeol("");
        } catch ( Exception e ) {
            return false;
        }

        return true;
    }

    public List< Pair< String, String > > parse( String sentence ) {
        List< Pair< String, String > > ret = new ArrayList< Pair< String, String > >();


        return ret;
    }


    private boolean addUserWordList( List< String > newWords ) {
        try {
            Analyzer.setUserDict( newWords.iterator() );
        } catch ( Exception e ) {
            return false;
        }
        return true;
    }
}
