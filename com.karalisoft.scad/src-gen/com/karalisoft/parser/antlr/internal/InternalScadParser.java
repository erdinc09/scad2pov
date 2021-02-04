package com.karalisoft.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.karalisoft.services.ScadGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScadParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "'include'", "'<'", "'.'", "'>'", "';'", "'module'", "'('", "')'", "'{'", "'}'", "'function'", "'translate'", "'['", "','", "']'", "'rotate'", "'scale'", "'sphere'", "'$fn'", "'='", "'$fa'", "'$fs'", "'r'", "'d'", "'cylinder'", "'h'", "'r1'", "'r2'", "'d1'", "'d2'", "'center'", "'true'", "'false'", "'cube'", "'size'", "'union'", "'intersection'", "'difference'", "'+'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalScadParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScadParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScadParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScad.g"; }



     	private ScadGrammarAccess grammarAccess;

        public InternalScadParser(TokenStream input, ScadGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ScadGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalScad.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalScad.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalScad.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScad.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_blocks_0_1 = null;

        EObject lv_blocks_0_2 = null;

        EObject lv_blocks_0_3 = null;

        EObject lv_blocks_0_4 = null;

        EObject lv_blocks_0_5 = null;



        	enterRule();

        try {
            // InternalScad.g:77:2: ( ( ( (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude ) ) )* )
            // InternalScad.g:78:2: ( ( (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude ) ) )*
            {
            // InternalScad.g:78:2: ( ( (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=11 && LA2_0<=12)||LA2_0==17||(LA2_0>=22 && LA2_0<=23)||(LA2_0>=27 && LA2_0<=29)||LA2_0==36||LA2_0==45||(LA2_0>=47 && LA2_0<=49)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScad.g:79:3: ( (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude ) )
            	    {
            	    // InternalScad.g:79:3: ( (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude ) )
            	    // InternalScad.g:80:4: (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude )
            	    {
            	    // InternalScad.g:80:4: (lv_blocks_0_1= ruleShape | lv_blocks_0_2= ruleModule | lv_blocks_0_3= ruleFunction | lv_blocks_0_4= ruleModuleOrFunctionCall | lv_blocks_0_5= ruleUseOrInclude )
            	    int alt1=5;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	    case 27:
            	    case 28:
            	    case 29:
            	    case 36:
            	    case 45:
            	    case 47:
            	    case 48:
            	    case 49:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 11:
            	    case 12:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalScad.g:81:5: lv_blocks_0_1= ruleShape
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getBlocksShapeParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_blocks_0_1=ruleShape();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"blocks",
            	              						lv_blocks_0_1,
            	              						"com.karalisoft.Scad.Shape");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:97:5: lv_blocks_0_2= ruleModule
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getBlocksModuleParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_blocks_0_2=ruleModule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"blocks",
            	              						lv_blocks_0_2,
            	              						"com.karalisoft.Scad.Module");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:113:5: lv_blocks_0_3= ruleFunction
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getBlocksFunctionParserRuleCall_0_2());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_blocks_0_3=ruleFunction();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"blocks",
            	              						lv_blocks_0_3,
            	              						"com.karalisoft.Scad.Function");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalScad.g:129:5: lv_blocks_0_4= ruleModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getBlocksModuleOrFunctionCallParserRuleCall_0_3());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_blocks_0_4=ruleModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"blocks",
            	              						lv_blocks_0_4,
            	              						"com.karalisoft.Scad.ModuleOrFunctionCall");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalScad.g:145:5: lv_blocks_0_5= ruleUseOrInclude
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getModelAccess().getBlocksUseOrIncludeParserRuleCall_0_4());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_blocks_0_5=ruleUseOrInclude();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getModelRule());
            	              					}
            	              					add(
            	              						current,
            	              						"blocks",
            	              						lv_blocks_0_5,
            	              						"com.karalisoft.Scad.UseOrInclude");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseOrInclude"
    // InternalScad.g:166:1: entryRuleUseOrInclude returns [EObject current=null] : iv_ruleUseOrInclude= ruleUseOrInclude EOF ;
    public final EObject entryRuleUseOrInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseOrInclude = null;


        try {
            // InternalScad.g:166:53: (iv_ruleUseOrInclude= ruleUseOrInclude EOF )
            // InternalScad.g:167:2: iv_ruleUseOrInclude= ruleUseOrInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseOrIncludeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUseOrInclude=ruleUseOrInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseOrInclude; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseOrInclude"


    // $ANTLR start "ruleUseOrInclude"
    // InternalScad.g:173:1: ruleUseOrInclude returns [EObject current=null] : ( () (otherlv_1= 'use' | otherlv_2= 'include' ) otherlv_3= '<' this_ID_4= RULE_ID otherlv_5= '.' this_ID_6= RULE_ID otherlv_7= '>' ( ( ';' )=>otherlv_8= ';' )* ) ;
    public final EObject ruleUseOrInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalScad.g:179:2: ( ( () (otherlv_1= 'use' | otherlv_2= 'include' ) otherlv_3= '<' this_ID_4= RULE_ID otherlv_5= '.' this_ID_6= RULE_ID otherlv_7= '>' ( ( ';' )=>otherlv_8= ';' )* ) )
            // InternalScad.g:180:2: ( () (otherlv_1= 'use' | otherlv_2= 'include' ) otherlv_3= '<' this_ID_4= RULE_ID otherlv_5= '.' this_ID_6= RULE_ID otherlv_7= '>' ( ( ';' )=>otherlv_8= ';' )* )
            {
            // InternalScad.g:180:2: ( () (otherlv_1= 'use' | otherlv_2= 'include' ) otherlv_3= '<' this_ID_4= RULE_ID otherlv_5= '.' this_ID_6= RULE_ID otherlv_7= '>' ( ( ';' )=>otherlv_8= ';' )* )
            // InternalScad.g:181:3: () (otherlv_1= 'use' | otherlv_2= 'include' ) otherlv_3= '<' this_ID_4= RULE_ID otherlv_5= '.' this_ID_6= RULE_ID otherlv_7= '>' ( ( ';' )=>otherlv_8= ';' )*
            {
            // InternalScad.g:181:3: ()
            // InternalScad.g:182:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUseOrIncludeAccess().getUseOrIncludeAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:188:3: (otherlv_1= 'use' | otherlv_2= 'include' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalScad.g:189:4: otherlv_1= 'use'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getUseOrIncludeAccess().getUseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalScad.g:194:4: otherlv_2= 'include'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUseOrIncludeAccess().getIncludeKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getUseOrIncludeAccess().getLessThanSignKeyword_2());
              		
            }
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_4, grammarAccess.getUseOrIncludeAccess().getIDTerminalRuleCall_3());
              		
            }
            otherlv_5=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUseOrIncludeAccess().getFullStopKeyword_4());
              		
            }
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_6, grammarAccess.getUseOrIncludeAccess().getIDTerminalRuleCall_5());
              		
            }
            otherlv_7=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getUseOrIncludeAccess().getGreaterThanSignKeyword_6());
              		
            }
            // InternalScad.g:219:3: ( ( ';' )=>otherlv_8= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) && (synpred1_InternalScad())) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScad.g:220:4: ( ';' )=>otherlv_8= ';'
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getUseOrIncludeAccess().getSemicolonKeyword_7());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseOrInclude"


    // $ANTLR start "entryRuleModule"
    // InternalScad.g:230:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalScad.g:230:47: (iv_ruleModule= ruleModule EOF )
            // InternalScad.g:231:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalScad.g:237:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}' ) ( ( ';' )=>otherlv_8= ';' )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_blocks_6_1 = null;

        EObject lv_blocks_6_2 = null;

        EObject lv_blocks_6_3 = null;

        EObject lv_blocks_6_4 = null;

        EObject lv_blocks_6_5 = null;



        	enterRule();

        try {
            // InternalScad.g:243:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}' ) ( ( ';' )=>otherlv_8= ';' )* ) )
            // InternalScad.g:244:2: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}' ) ( ( ';' )=>otherlv_8= ';' )* )
            {
            // InternalScad.g:244:2: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}' ) ( ( ';' )=>otherlv_8= ';' )* )
            // InternalScad.g:245:3: () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}' ) ( ( ';' )=>otherlv_8= ';' )*
            {
            // InternalScad.g:245:3: ()
            // InternalScad.g:246:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModuleAccess().getModuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
              		
            }
            // InternalScad.g:256:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalScad.g:257:4: (lv_name_2_0= RULE_ID )
            {
            // InternalScad.g:257:4: (lv_name_2_0= RULE_ID )
            // InternalScad.g:258:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalScad.g:282:3: (otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}' )
            // InternalScad.g:283:4: otherlv_5= '{' ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_7= '}'
            {
            otherlv_5=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_5_0());
              			
            }
            // InternalScad.g:287:4: ( ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==17||(LA6_0>=22 && LA6_0<=23)||(LA6_0>=27 && LA6_0<=29)||LA6_0==36||LA6_0==45||(LA6_0>=47 && LA6_0<=49)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScad.g:288:5: ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) )
            	    {
            	    // InternalScad.g:288:5: ( (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall ) )
            	    // InternalScad.g:289:6: (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall )
            	    {
            	    // InternalScad.g:289:6: (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall )
            	    int alt5=5;
            	    alt5 = dfa5.predict(input);
            	    switch (alt5) {
            	        case 1 :
            	            // InternalScad.g:290:7: lv_blocks_6_1= ruleModule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getModuleAccess().getBlocksModuleParserRuleCall_5_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_blocks_6_1=ruleModule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getModuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"blocks",
            	              								lv_blocks_6_1,
            	              								"com.karalisoft.Scad.Module");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:306:7: lv_blocks_6_2= ruleShape
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getModuleAccess().getBlocksShapeParserRuleCall_5_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_blocks_6_2=ruleShape();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getModuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"blocks",
            	              								lv_blocks_6_2,
            	              								"com.karalisoft.Scad.Shape");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:322:7: lv_blocks_6_3= ruleFunction
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getModuleAccess().getBlocksFunctionParserRuleCall_5_1_0_2());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_blocks_6_3=ruleFunction();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getModuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"blocks",
            	              								lv_blocks_6_3,
            	              								"com.karalisoft.Scad.Function");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalScad.g:338:7: lv_blocks_6_4= ruleModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getModuleAccess().getBlocksModuleOrFunctionCallParserRuleCall_5_1_0_3());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_blocks_6_4=ruleModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getModuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"blocks",
            	              								lv_blocks_6_4,
            	              								"com.karalisoft.Scad.ModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalScad.g:354:7: lv_blocks_6_5= ruleTransformedModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getModuleAccess().getBlocksTransformedModuleOrFunctionCallParserRuleCall_5_1_0_4());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_blocks_6_5=ruleTransformedModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getModuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"blocks",
            	              								lv_blocks_6_5,
            	              								"com.karalisoft.Scad.TransformedModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5_2());
              			
            }

            }

            // InternalScad.g:377:3: ( ( ';' )=>otherlv_8= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) && (synpred2_InternalScad())) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScad.g:378:4: ( ';' )=>otherlv_8= ';'
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getModuleAccess().getSemicolonKeyword_6());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleFunction"
    // InternalScad.g:388:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalScad.g:388:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalScad.g:389:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalScad.g:395:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ( ( ';' )=>otherlv_5= ';' )* ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalScad.g:401:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ( ( ';' )=>otherlv_5= ';' )* ) )
            // InternalScad.g:402:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ( ( ';' )=>otherlv_5= ';' )* )
            {
            // InternalScad.g:402:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ( ( ';' )=>otherlv_5= ';' )* )
            // InternalScad.g:403:3: () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ( ( ';' )=>otherlv_5= ';' )*
            {
            // InternalScad.g:403:3: ()
            // InternalScad.g:404:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionAccess().getFunctionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
              		
            }
            // InternalScad.g:414:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalScad.g:415:4: (lv_name_2_0= RULE_ID )
            {
            // InternalScad.g:415:4: (lv_name_2_0= RULE_ID )
            // InternalScad.g:416:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalScad.g:440:3: ( ( ';' )=>otherlv_5= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) && (synpred3_InternalScad())) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalScad.g:441:4: ( ';' )=>otherlv_5= ';'
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getSemicolonKeyword_5());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleModuleOrFunctionCall"
    // InternalScad.g:451:1: entryRuleModuleOrFunctionCall returns [EObject current=null] : iv_ruleModuleOrFunctionCall= ruleModuleOrFunctionCall EOF ;
    public final EObject entryRuleModuleOrFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleOrFunctionCall = null;


        try {
            // InternalScad.g:451:61: (iv_ruleModuleOrFunctionCall= ruleModuleOrFunctionCall EOF )
            // InternalScad.g:452:2: iv_ruleModuleOrFunctionCall= ruleModuleOrFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleOrFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleOrFunctionCall=ruleModuleOrFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleOrFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleOrFunctionCall"


    // $ANTLR start "ruleModuleOrFunctionCall"
    // InternalScad.g:458:1: ruleModuleOrFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= ';' ) ;
    public final EObject ruleModuleOrFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalScad.g:464:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= ';' ) )
            // InternalScad.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= ';' )
            {
            // InternalScad.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= ';' )
            // InternalScad.g:466:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= ';'
            {
            // InternalScad.g:466:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalScad.g:467:4: (lv_name_0_0= RULE_ID )
            {
            // InternalScad.g:467:4: (lv_name_0_0= RULE_ID )
            // InternalScad.g:468:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getModuleOrFunctionCallAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModuleOrFunctionCallRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModuleOrFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModuleOrFunctionCallAccess().getRightParenthesisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModuleOrFunctionCallAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleOrFunctionCall"


    // $ANTLR start "entryRuleTranslate"
    // InternalScad.g:500:1: entryRuleTranslate returns [EObject current=null] : iv_ruleTranslate= ruleTranslate EOF ;
    public final EObject entryRuleTranslate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslate = null;


        try {
            // InternalScad.g:500:50: (iv_ruleTranslate= ruleTranslate EOF )
            // InternalScad.g:501:2: iv_ruleTranslate= ruleTranslate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTranslateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTranslate=ruleTranslate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTranslate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTranslate"


    // $ANTLR start "ruleTranslate"
    // InternalScad.g:507:1: ruleTranslate returns [EObject current=null] : ( () (otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) ) ;
    public final EObject ruleTranslate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;

        AntlrDatatypeRuleToken lv_z_8_0 = null;



        	enterRule();

        try {
            // InternalScad.g:513:2: ( ( () (otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) ) )
            // InternalScad.g:514:2: ( () (otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) )
            {
            // InternalScad.g:514:2: ( () (otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) )
            // InternalScad.g:515:3: () (otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' )
            {
            // InternalScad.g:515:3: ()
            // InternalScad.g:516:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTranslateAccess().getTranslateAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:522:3: (otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' )
            // InternalScad.g:523:4: otherlv_1= 'translate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getTranslateAccess().getTranslateKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getTranslateAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            otherlv_3=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getTranslateAccess().getLeftSquareBracketKeyword_1_2());
              			
            }
            // InternalScad.g:535:4: ( (lv_x_4_0= ruleDouble ) )
            // InternalScad.g:536:5: (lv_x_4_0= ruleDouble )
            {
            // InternalScad.g:536:5: (lv_x_4_0= ruleDouble )
            // InternalScad.g:537:6: lv_x_4_0= ruleDouble
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getTranslateAccess().getXDoubleParserRuleCall_1_3_0());
              					
            }
            pushFollow(FOLLOW_16);
            lv_x_4_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getTranslateRule());
              						}
              						set(
              							current,
              							"x",
              							lv_x_4_0,
              							"com.karalisoft.Scad.Double");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getTranslateAccess().getCommaKeyword_1_4());
              			
            }
            // InternalScad.g:558:4: ( (lv_y_6_0= ruleDouble ) )
            // InternalScad.g:559:5: (lv_y_6_0= ruleDouble )
            {
            // InternalScad.g:559:5: (lv_y_6_0= ruleDouble )
            // InternalScad.g:560:6: lv_y_6_0= ruleDouble
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getTranslateAccess().getYDoubleParserRuleCall_1_5_0());
              					
            }
            pushFollow(FOLLOW_16);
            lv_y_6_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getTranslateRule());
              						}
              						set(
              							current,
              							"y",
              							lv_y_6_0,
              							"com.karalisoft.Scad.Double");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getTranslateAccess().getCommaKeyword_1_6());
              			
            }
            // InternalScad.g:581:4: ( (lv_z_8_0= ruleDouble ) )
            // InternalScad.g:582:5: (lv_z_8_0= ruleDouble )
            {
            // InternalScad.g:582:5: (lv_z_8_0= ruleDouble )
            // InternalScad.g:583:6: lv_z_8_0= ruleDouble
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getTranslateAccess().getZDoubleParserRuleCall_1_7_0());
              					
            }
            pushFollow(FOLLOW_17);
            lv_z_8_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getTranslateRule());
              						}
              						set(
              							current,
              							"z",
              							lv_z_8_0,
              							"com.karalisoft.Scad.Double");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getTranslateAccess().getRightSquareBracketKeyword_1_8());
              			
            }
            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getTranslateAccess().getRightParenthesisKeyword_1_9());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTranslate"


    // $ANTLR start "entryRuleRotate"
    // InternalScad.g:613:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalScad.g:613:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalScad.g:614:2: iv_ruleRotate= ruleRotate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRotateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRotate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalScad.g:620:1: ruleRotate returns [EObject current=null] : ( () (otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;

        AntlrDatatypeRuleToken lv_z_8_0 = null;



        	enterRule();

        try {
            // InternalScad.g:626:2: ( ( () (otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) ) )
            // InternalScad.g:627:2: ( () (otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) )
            {
            // InternalScad.g:627:2: ( () (otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' ) )
            // InternalScad.g:628:3: () (otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' )
            {
            // InternalScad.g:628:3: ()
            // InternalScad.g:629:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRotateAccess().getRotateAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:635:3: (otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')' )
            // InternalScad.g:636:4: otherlv_1= 'rotate' otherlv_2= '(' otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' otherlv_10= ')'
            {
            otherlv_1=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getRotateKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            otherlv_3=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getLeftSquareBracketKeyword_1_2());
              			
            }
            // InternalScad.g:648:4: ( (lv_x_4_0= ruleDouble ) )
            // InternalScad.g:649:5: (lv_x_4_0= ruleDouble )
            {
            // InternalScad.g:649:5: (lv_x_4_0= ruleDouble )
            // InternalScad.g:650:6: lv_x_4_0= ruleDouble
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getRotateAccess().getXDoubleParserRuleCall_1_3_0());
              					
            }
            pushFollow(FOLLOW_16);
            lv_x_4_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getRotateRule());
              						}
              						set(
              							current,
              							"x",
              							lv_x_4_0,
              							"com.karalisoft.Scad.Double");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getCommaKeyword_1_4());
              			
            }
            // InternalScad.g:671:4: ( (lv_y_6_0= ruleDouble ) )
            // InternalScad.g:672:5: (lv_y_6_0= ruleDouble )
            {
            // InternalScad.g:672:5: (lv_y_6_0= ruleDouble )
            // InternalScad.g:673:6: lv_y_6_0= ruleDouble
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getRotateAccess().getYDoubleParserRuleCall_1_5_0());
              					
            }
            pushFollow(FOLLOW_16);
            lv_y_6_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getRotateRule());
              						}
              						set(
              							current,
              							"y",
              							lv_y_6_0,
              							"com.karalisoft.Scad.Double");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getRotateAccess().getCommaKeyword_1_6());
              			
            }
            // InternalScad.g:694:4: ( (lv_z_8_0= ruleDouble ) )
            // InternalScad.g:695:5: (lv_z_8_0= ruleDouble )
            {
            // InternalScad.g:695:5: (lv_z_8_0= ruleDouble )
            // InternalScad.g:696:6: lv_z_8_0= ruleDouble
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getRotateAccess().getZDoubleParserRuleCall_1_7_0());
              					
            }
            pushFollow(FOLLOW_17);
            lv_z_8_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getRotateRule());
              						}
              						set(
              							current,
              							"z",
              							lv_z_8_0,
              							"com.karalisoft.Scad.Double");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getRotateAccess().getRightSquareBracketKeyword_1_8());
              			
            }
            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getRotateAccess().getRightParenthesisKeyword_1_9());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleScale"
    // InternalScad.g:726:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // InternalScad.g:726:46: (iv_ruleScale= ruleScale EOF )
            // InternalScad.g:727:2: iv_ruleScale= ruleScale EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScaleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScale=ruleScale();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScale; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalScad.g:733:1: ruleScale returns [EObject current=null] : ( () (otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')' ) ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;

        AntlrDatatypeRuleToken lv_z_8_0 = null;

        AntlrDatatypeRuleToken lv_scale_10_0 = null;



        	enterRule();

        try {
            // InternalScad.g:739:2: ( ( () (otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')' ) ) )
            // InternalScad.g:740:2: ( () (otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')' ) )
            {
            // InternalScad.g:740:2: ( () (otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')' ) )
            // InternalScad.g:741:3: () (otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')' )
            {
            // InternalScad.g:741:3: ()
            // InternalScad.g:742:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScaleAccess().getScaleAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:748:3: (otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')' )
            // InternalScad.g:749:4: otherlv_1= 'scale' otherlv_2= '(' ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) ) otherlv_11= ')'
            {
            otherlv_1=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getScaleAccess().getScaleKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            // InternalScad.g:757:4: ( (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' ) | ( (lv_scale_10_0= ruleDouble ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT||(LA9_0>=50 && LA9_0<=51)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalScad.g:758:5: (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' )
                    {
                    // InternalScad.g:758:5: (otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']' )
                    // InternalScad.g:759:6: otherlv_3= '[' ( (lv_x_4_0= ruleDouble ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_z_8_0= ruleDouble ) ) otherlv_9= ']'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getLeftSquareBracketKeyword_1_2_0_0());
                      					
                    }
                    // InternalScad.g:763:6: ( (lv_x_4_0= ruleDouble ) )
                    // InternalScad.g:764:7: (lv_x_4_0= ruleDouble )
                    {
                    // InternalScad.g:764:7: (lv_x_4_0= ruleDouble )
                    // InternalScad.g:765:8: lv_x_4_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getScaleAccess().getXDoubleParserRuleCall_1_2_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_16);
                    lv_x_4_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getScaleRule());
                      								}
                      								set(
                      									current,
                      									"x",
                      									lv_x_4_0,
                      									"com.karalisoft.Scad.Double");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getCommaKeyword_1_2_0_2());
                      					
                    }
                    // InternalScad.g:786:6: ( (lv_y_6_0= ruleDouble ) )
                    // InternalScad.g:787:7: (lv_y_6_0= ruleDouble )
                    {
                    // InternalScad.g:787:7: (lv_y_6_0= ruleDouble )
                    // InternalScad.g:788:8: lv_y_6_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getScaleAccess().getYDoubleParserRuleCall_1_2_0_3_0());
                      							
                    }
                    pushFollow(FOLLOW_16);
                    lv_y_6_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getScaleRule());
                      								}
                      								set(
                      									current,
                      									"y",
                      									lv_y_6_0,
                      									"com.karalisoft.Scad.Double");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getCommaKeyword_1_2_0_4());
                      					
                    }
                    // InternalScad.g:809:6: ( (lv_z_8_0= ruleDouble ) )
                    // InternalScad.g:810:7: (lv_z_8_0= ruleDouble )
                    {
                    // InternalScad.g:810:7: (lv_z_8_0= ruleDouble )
                    // InternalScad.g:811:8: lv_z_8_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getScaleAccess().getZDoubleParserRuleCall_1_2_0_5_0());
                      							
                    }
                    pushFollow(FOLLOW_17);
                    lv_z_8_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getScaleRule());
                      								}
                      								set(
                      									current,
                      									"z",
                      									lv_z_8_0,
                      									"com.karalisoft.Scad.Double");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getScaleAccess().getRightSquareBracketKeyword_1_2_0_6());
                      					
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScad.g:834:5: ( (lv_scale_10_0= ruleDouble ) )
                    {
                    // InternalScad.g:834:5: ( (lv_scale_10_0= ruleDouble ) )
                    // InternalScad.g:835:6: (lv_scale_10_0= ruleDouble )
                    {
                    // InternalScad.g:835:6: (lv_scale_10_0= ruleDouble )
                    // InternalScad.g:836:7: lv_scale_10_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getScaleAccess().getScaleDoubleParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_10);
                    lv_scale_10_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getScaleRule());
                      							}
                      							set(
                      								current,
                      								"scale",
                      								lv_scale_10_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getRightParenthesisKeyword_1_3());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleShape"
    // InternalScad.g:863:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalScad.g:863:46: (iv_ruleShape= ruleShape EOF )
            // InternalScad.g:864:2: iv_ruleShape= ruleShape EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShapeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShape=ruleShape();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShape; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalScad.g:870:1: ruleShape returns [EObject current=null] : ( () ( ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) ) ) ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        EObject lv_impl_1_1 = null;

        EObject lv_impl_1_2 = null;

        EObject lv_impl_1_3 = null;

        EObject lv_impl_1_4 = null;

        EObject lv_impl_1_5 = null;

        EObject lv_impl_1_6 = null;

        EObject lv_impl_1_7 = null;



        	enterRule();

        try {
            // InternalScad.g:876:2: ( ( () ( ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) ) ) ) )
            // InternalScad.g:877:2: ( () ( ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) ) ) )
            {
            // InternalScad.g:877:2: ( () ( ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) ) ) )
            // InternalScad.g:878:3: () ( ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) ) )
            {
            // InternalScad.g:878:3: ()
            // InternalScad.g:879:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getShapeAccess().getShapeAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:885:3: ( ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) ) )
            // InternalScad.g:886:4: ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) )
            {
            // InternalScad.g:886:4: ( (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube ) )
            // InternalScad.g:887:5: (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube )
            {
            // InternalScad.g:887:5: (lv_impl_1_1= ruleTransformedShape | lv_impl_1_2= ruleUnion | lv_impl_1_3= ruleIntersection | lv_impl_1_4= ruleDifference | lv_impl_1_5= ruleSphere | lv_impl_1_6= ruleCylinder | lv_impl_1_7= ruleCube )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 23:
            case 27:
            case 28:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 48:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            case 36:
                {
                alt10=6;
                }
                break;
            case 45:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalScad.g:888:6: lv_impl_1_1= ruleTransformedShape
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplTransformedShapeParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_1=ruleTransformedShape();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_1,
                      							"com.karalisoft.Scad.TransformedShape");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalScad.g:904:6: lv_impl_1_2= ruleUnion
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplUnionParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_2=ruleUnion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_2,
                      							"com.karalisoft.Scad.Union");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalScad.g:920:6: lv_impl_1_3= ruleIntersection
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplIntersectionParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_3=ruleIntersection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_3,
                      							"com.karalisoft.Scad.Intersection");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalScad.g:936:6: lv_impl_1_4= ruleDifference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplDifferenceParserRuleCall_1_0_3());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_4=ruleDifference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_4,
                      							"com.karalisoft.Scad.Difference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalScad.g:952:6: lv_impl_1_5= ruleSphere
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplSphereParserRuleCall_1_0_4());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_5=ruleSphere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_5,
                      							"com.karalisoft.Scad.Sphere");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalScad.g:968:6: lv_impl_1_6= ruleCylinder
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplCylinderParserRuleCall_1_0_5());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_6=ruleCylinder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_6,
                      							"com.karalisoft.Scad.Cylinder");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 7 :
                    // InternalScad.g:984:6: lv_impl_1_7= ruleCube
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShapeAccess().getImplCubeParserRuleCall_1_0_6());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_impl_1_7=ruleCube();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShapeRule());
                      						}
                      						set(
                      							current,
                      							"impl",
                      							lv_impl_1_7,
                      							"com.karalisoft.Scad.Cube");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleTransformedShape"
    // InternalScad.g:1006:1: entryRuleTransformedShape returns [EObject current=null] : iv_ruleTransformedShape= ruleTransformedShape EOF ;
    public final EObject entryRuleTransformedShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformedShape = null;


        try {
            // InternalScad.g:1006:57: (iv_ruleTransformedShape= ruleTransformedShape EOF )
            // InternalScad.g:1007:2: iv_ruleTransformedShape= ruleTransformedShape EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformedShapeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransformedShape=ruleTransformedShape();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformedShape; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformedShape"


    // $ANTLR start "ruleTransformedShape"
    // InternalScad.g:1013:1: ruleTransformedShape returns [EObject current=null] : ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleShape ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* ) ;
    public final EObject ruleTransformedShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_translations_1_1 = null;

        EObject lv_translations_1_2 = null;

        EObject lv_translations_1_3 = null;

        EObject lv_impl_3_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1019:2: ( ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleShape ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* ) )
            // InternalScad.g:1020:2: ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleShape ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* )
            {
            // InternalScad.g:1020:2: ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleShape ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* )
            // InternalScad.g:1021:3: () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleShape ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )*
            {
            // InternalScad.g:1021:3: ()
            // InternalScad.g:1022:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTransformedShapeAccess().getTransformedShapeAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1028:3: ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23||(LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalScad.g:1029:4: ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) )
            	    {
            	    // InternalScad.g:1029:4: ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) )
            	    // InternalScad.g:1030:5: (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale )
            	    {
            	    // InternalScad.g:1030:5: (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalScad.g:1031:6: lv_translations_1_1= ruleTranslate
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTransformedShapeAccess().getTranslationsTranslateParserRuleCall_1_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_translations_1_1=ruleTranslate();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTransformedShapeRule());
            	              						}
            	              						add(
            	              							current,
            	              							"translations",
            	              							lv_translations_1_1,
            	              							"com.karalisoft.Scad.Translate");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:1047:6: lv_translations_1_2= ruleRotate
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTransformedShapeAccess().getTranslationsRotateParserRuleCall_1_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_translations_1_2=ruleRotate();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTransformedShapeRule());
            	              						}
            	              						add(
            	              							current,
            	              							"translations",
            	              							lv_translations_1_2,
            	              							"com.karalisoft.Scad.Rotate");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:1063:6: lv_translations_1_3= ruleScale
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTransformedShapeAccess().getTranslationsScaleParserRuleCall_1_0_2());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_translations_1_3=ruleScale();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTransformedShapeRule());
            	              						}
            	              						add(
            	              							current,
            	              							"translations",
            	              							lv_translations_1_3,
            	              							"com.karalisoft.Scad.Scale");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTransformedShapeAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalScad.g:1085:3: ( (lv_impl_3_0= ruleShape ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23||(LA13_0>=27 && LA13_0<=29)||LA13_0==36||LA13_0==45||(LA13_0>=47 && LA13_0<=49)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalScad.g:1086:4: (lv_impl_3_0= ruleShape )
            	    {
            	    // InternalScad.g:1086:4: (lv_impl_3_0= ruleShape )
            	    // InternalScad.g:1087:5: lv_impl_3_0= ruleShape
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransformedShapeAccess().getImplShapeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_impl_3_0=ruleShape();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransformedShapeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"impl",
            	      						lv_impl_3_0,
            	      						"com.karalisoft.Scad.Shape");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTransformedShapeAccess().getRightCurlyBracketKeyword_4());
              		
            }
            // InternalScad.g:1108:3: ( ( ';' )=>otherlv_5= ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) && (synpred4_InternalScad())) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalScad.g:1109:4: ( ';' )=>otherlv_5= ';'
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getTransformedShapeAccess().getSemicolonKeyword_5());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformedShape"


    // $ANTLR start "entryRuleTransformedModuleOrFunctionCall"
    // InternalScad.g:1119:1: entryRuleTransformedModuleOrFunctionCall returns [EObject current=null] : iv_ruleTransformedModuleOrFunctionCall= ruleTransformedModuleOrFunctionCall EOF ;
    public final EObject entryRuleTransformedModuleOrFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformedModuleOrFunctionCall = null;


        try {
            // InternalScad.g:1119:72: (iv_ruleTransformedModuleOrFunctionCall= ruleTransformedModuleOrFunctionCall EOF )
            // InternalScad.g:1120:2: iv_ruleTransformedModuleOrFunctionCall= ruleTransformedModuleOrFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformedModuleOrFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransformedModuleOrFunctionCall=ruleTransformedModuleOrFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformedModuleOrFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformedModuleOrFunctionCall"


    // $ANTLR start "ruleTransformedModuleOrFunctionCall"
    // InternalScad.g:1126:1: ruleTransformedModuleOrFunctionCall returns [EObject current=null] : ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleModuleOrFunctionCall ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* ) ;
    public final EObject ruleTransformedModuleOrFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_translations_1_1 = null;

        EObject lv_translations_1_2 = null;

        EObject lv_translations_1_3 = null;

        EObject lv_impl_3_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1132:2: ( ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleModuleOrFunctionCall ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* ) )
            // InternalScad.g:1133:2: ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleModuleOrFunctionCall ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* )
            {
            // InternalScad.g:1133:2: ( () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleModuleOrFunctionCall ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )* )
            // InternalScad.g:1134:3: () ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+ otherlv_2= '{' ( (lv_impl_3_0= ruleModuleOrFunctionCall ) )+ otherlv_4= '}' ( ( ';' )=>otherlv_5= ';' )*
            {
            // InternalScad.g:1134:3: ()
            // InternalScad.g:1135:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTransformedModuleOrFunctionCallAccess().getTransformedModuleOrFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1141:3: ( ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23||(LA16_0>=27 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalScad.g:1142:4: ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) )
            	    {
            	    // InternalScad.g:1142:4: ( (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale ) )
            	    // InternalScad.g:1143:5: (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale )
            	    {
            	    // InternalScad.g:1143:5: (lv_translations_1_1= ruleTranslate | lv_translations_1_2= ruleRotate | lv_translations_1_3= ruleScale )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalScad.g:1144:6: lv_translations_1_1= ruleTranslate
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTransformedModuleOrFunctionCallAccess().getTranslationsTranslateParserRuleCall_1_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_translations_1_1=ruleTranslate();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTransformedModuleOrFunctionCallRule());
            	              						}
            	              						add(
            	              							current,
            	              							"translations",
            	              							lv_translations_1_1,
            	              							"com.karalisoft.Scad.Translate");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:1160:6: lv_translations_1_2= ruleRotate
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTransformedModuleOrFunctionCallAccess().getTranslationsRotateParserRuleCall_1_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_translations_1_2=ruleRotate();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTransformedModuleOrFunctionCallRule());
            	              						}
            	              						add(
            	              							current,
            	              							"translations",
            	              							lv_translations_1_2,
            	              							"com.karalisoft.Scad.Rotate");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:1176:6: lv_translations_1_3= ruleScale
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getTransformedModuleOrFunctionCallAccess().getTranslationsScaleParserRuleCall_1_0_2());
            	              					
            	            }
            	            pushFollow(FOLLOW_19);
            	            lv_translations_1_3=ruleScale();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getTransformedModuleOrFunctionCallRule());
            	              						}
            	              						add(
            	              							current,
            	              							"translations",
            	              							lv_translations_1_3,
            	              							"com.karalisoft.Scad.Scale");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTransformedModuleOrFunctionCallAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalScad.g:1198:3: ( (lv_impl_3_0= ruleModuleOrFunctionCall ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalScad.g:1199:4: (lv_impl_3_0= ruleModuleOrFunctionCall )
            	    {
            	    // InternalScad.g:1199:4: (lv_impl_3_0= ruleModuleOrFunctionCall )
            	    // InternalScad.g:1200:5: lv_impl_3_0= ruleModuleOrFunctionCall
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransformedModuleOrFunctionCallAccess().getImplModuleOrFunctionCallParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_impl_3_0=ruleModuleOrFunctionCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransformedModuleOrFunctionCallRule());
            	      					}
            	      					add(
            	      						current,
            	      						"impl",
            	      						lv_impl_3_0,
            	      						"com.karalisoft.Scad.ModuleOrFunctionCall");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTransformedModuleOrFunctionCallAccess().getRightCurlyBracketKeyword_4());
              		
            }
            // InternalScad.g:1221:3: ( ( ';' )=>otherlv_5= ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) && (synpred5_InternalScad())) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalScad.g:1222:4: ( ';' )=>otherlv_5= ';'
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getTransformedModuleOrFunctionCallAccess().getSemicolonKeyword_5());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformedModuleOrFunctionCall"


    // $ANTLR start "entryRuleSphere"
    // InternalScad.g:1232:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalScad.g:1232:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalScad.g:1233:2: iv_ruleSphere= ruleSphere EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSphereRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSphere; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalScad.g:1239:1: ruleSphere returns [EObject current=null] : ( () (otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_sphereParams_3_0 = null;

        EObject lv_sphereParams_5_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1245:2: ( ( () (otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) ) )
            // InternalScad.g:1246:2: ( () (otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) )
            {
            // InternalScad.g:1246:2: ( () (otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) )
            // InternalScad.g:1247:3: () (otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ )
            {
            // InternalScad.g:1247:3: ()
            // InternalScad.g:1248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSphereAccess().getSphereAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1254:3: (otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ )
            // InternalScad.g:1255:4: otherlv_1= 'sphere' otherlv_2= '(' ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+
            {
            otherlv_1=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getSphereKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            // InternalScad.g:1263:4: ( ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30||(LA20_0>=32 && LA20_0<=35)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalScad.g:1264:5: ( (lv_sphereParams_3_0= ruleSphereParams ) ) (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )*
                    {
                    // InternalScad.g:1264:5: ( (lv_sphereParams_3_0= ruleSphereParams ) )
                    // InternalScad.g:1265:6: (lv_sphereParams_3_0= ruleSphereParams )
                    {
                    // InternalScad.g:1265:6: (lv_sphereParams_3_0= ruleSphereParams )
                    // InternalScad.g:1266:7: lv_sphereParams_3_0= ruleSphereParams
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSphereAccess().getSphereParamsSphereParamsParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_sphereParams_3_0=ruleSphereParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSphereRule());
                      							}
                      							add(
                      								current,
                      								"sphereParams",
                      								lv_sphereParams_3_0,
                      								"com.karalisoft.Scad.SphereParams");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalScad.g:1283:5: (otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalScad.g:1284:6: otherlv_4= ',' ( (lv_sphereParams_5_0= ruleSphereParams ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getSphereAccess().getCommaKeyword_1_2_1_0());
                    	      					
                    	    }
                    	    // InternalScad.g:1288:6: ( (lv_sphereParams_5_0= ruleSphereParams ) )
                    	    // InternalScad.g:1289:7: (lv_sphereParams_5_0= ruleSphereParams )
                    	    {
                    	    // InternalScad.g:1289:7: (lv_sphereParams_5_0= ruleSphereParams )
                    	    // InternalScad.g:1290:8: lv_sphereParams_5_0= ruleSphereParams
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSphereAccess().getSphereParamsSphereParamsParserRuleCall_1_2_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_sphereParams_5_0=ruleSphereParams();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getSphereRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"sphereParams",
                    	      									lv_sphereParams_5_0,
                    	      									"com.karalisoft.Scad.SphereParams");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getSphereAccess().getRightParenthesisKeyword_1_3());
              			
            }
            // InternalScad.g:1313:4: ( ( ';' )=>otherlv_7= ';' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) && (synpred6_InternalScad())) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalScad.g:1314:5: ( ';' )=>otherlv_7= ';'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getSphereAccess().getSemicolonKeyword_1_4());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleSphereParams"
    // InternalScad.g:1325:1: entryRuleSphereParams returns [EObject current=null] : iv_ruleSphereParams= ruleSphereParams EOF ;
    public final EObject entryRuleSphereParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphereParams = null;


        try {
            // InternalScad.g:1325:53: (iv_ruleSphereParams= ruleSphereParams EOF )
            // InternalScad.g:1326:2: iv_ruleSphereParams= ruleSphereParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSphereParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSphereParams=ruleSphereParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSphereParams; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphereParams"


    // $ANTLR start "ruleSphereParams"
    // InternalScad.g:1332:1: ruleSphereParams returns [EObject current=null] : ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) ) | (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) ) ) ) ;
    public final EObject ruleSphereParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_fn_3_0 = null;

        AntlrDatatypeRuleToken lv_fa_6_0 = null;

        AntlrDatatypeRuleToken lv_fs_9_0 = null;

        AntlrDatatypeRuleToken lv_r_12_0 = null;

        AntlrDatatypeRuleToken lv_d_15_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1338:2: ( ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) ) | (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) ) ) ) )
            // InternalScad.g:1339:2: ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) ) | (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) ) ) )
            {
            // InternalScad.g:1339:2: ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) ) | (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) ) ) )
            // InternalScad.g:1340:3: () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) ) | (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) ) )
            {
            // InternalScad.g:1340:3: ()
            // InternalScad.g:1341:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSphereParamsAccess().getSphereParamsAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1347:3: ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) ) | (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 32:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            case 34:
                {
                alt22=4;
                }
                break;
            case 35:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalScad.g:1348:4: (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1348:4: (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) )
                    // InternalScad.g:1349:5: otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getSphereParamsAccess().getFnKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getSphereParamsAccess().getEqualsSignKeyword_1_0_1());
                      				
                    }
                    // InternalScad.g:1357:5: ( (lv_fn_3_0= ruleDouble ) )
                    // InternalScad.g:1358:6: (lv_fn_3_0= ruleDouble )
                    {
                    // InternalScad.g:1358:6: (lv_fn_3_0= ruleDouble )
                    // InternalScad.g:1359:7: lv_fn_3_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSphereParamsAccess().getFnDoubleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_fn_3_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSphereParamsRule());
                      							}
                      							set(
                      								current,
                      								"fn",
                      								lv_fn_3_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScad.g:1378:4: (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1378:4: (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) )
                    // InternalScad.g:1379:5: otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getSphereParamsAccess().getFaKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSphereParamsAccess().getEqualsSignKeyword_1_1_1());
                      				
                    }
                    // InternalScad.g:1387:5: ( (lv_fa_6_0= ruleDouble ) )
                    // InternalScad.g:1388:6: (lv_fa_6_0= ruleDouble )
                    {
                    // InternalScad.g:1388:6: (lv_fa_6_0= ruleDouble )
                    // InternalScad.g:1389:7: lv_fa_6_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSphereParamsAccess().getFaDoubleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_fa_6_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSphereParamsRule());
                      							}
                      							set(
                      								current,
                      								"fa",
                      								lv_fa_6_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalScad.g:1408:4: (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1408:4: (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) )
                    // InternalScad.g:1409:5: otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSphereParamsAccess().getFsKeyword_1_2_0());
                      				
                    }
                    otherlv_8=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getSphereParamsAccess().getEqualsSignKeyword_1_2_1());
                      				
                    }
                    // InternalScad.g:1417:5: ( (lv_fs_9_0= ruleDouble ) )
                    // InternalScad.g:1418:6: (lv_fs_9_0= ruleDouble )
                    {
                    // InternalScad.g:1418:6: (lv_fs_9_0= ruleDouble )
                    // InternalScad.g:1419:7: lv_fs_9_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSphereParamsAccess().getFsDoubleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_fs_9_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSphereParamsRule());
                      							}
                      							set(
                      								current,
                      								"fs",
                      								lv_fs_9_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalScad.g:1438:4: (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1438:4: (otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) ) )
                    // InternalScad.g:1439:5: otherlv_10= 'r' otherlv_11= '=' ( (lv_r_12_0= ruleDouble ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getSphereParamsAccess().getRKeyword_1_3_0());
                      				
                    }
                    otherlv_11=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getSphereParamsAccess().getEqualsSignKeyword_1_3_1());
                      				
                    }
                    // InternalScad.g:1447:5: ( (lv_r_12_0= ruleDouble ) )
                    // InternalScad.g:1448:6: (lv_r_12_0= ruleDouble )
                    {
                    // InternalScad.g:1448:6: (lv_r_12_0= ruleDouble )
                    // InternalScad.g:1449:7: lv_r_12_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSphereParamsAccess().getRDoubleParserRuleCall_1_3_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_r_12_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSphereParamsRule());
                      							}
                      							set(
                      								current,
                      								"r",
                      								lv_r_12_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalScad.g:1468:4: (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1468:4: (otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) ) )
                    // InternalScad.g:1469:5: otherlv_13= 'd' otherlv_14= '=' ( (lv_d_15_0= ruleDouble ) )
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getSphereParamsAccess().getDKeyword_1_4_0());
                      				
                    }
                    otherlv_14=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getSphereParamsAccess().getEqualsSignKeyword_1_4_1());
                      				
                    }
                    // InternalScad.g:1477:5: ( (lv_d_15_0= ruleDouble ) )
                    // InternalScad.g:1478:6: (lv_d_15_0= ruleDouble )
                    {
                    // InternalScad.g:1478:6: (lv_d_15_0= ruleDouble )
                    // InternalScad.g:1479:7: lv_d_15_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSphereParamsAccess().getDDoubleParserRuleCall_1_4_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_d_15_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSphereParamsRule());
                      							}
                      							set(
                      								current,
                      								"d",
                      								lv_d_15_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphereParams"


    // $ANTLR start "entryRuleCylinder"
    // InternalScad.g:1502:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalScad.g:1502:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalScad.g:1503:2: iv_ruleCylinder= ruleCylinder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCylinderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCylinder; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalScad.g:1509:1: ruleCylinder returns [EObject current=null] : ( () (otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_cylinderParams_3_0 = null;

        EObject lv_cylinderParams_5_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1515:2: ( ( () (otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) ) )
            // InternalScad.g:1516:2: ( () (otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) )
            {
            // InternalScad.g:1516:2: ( () (otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) )
            // InternalScad.g:1517:3: () (otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ )
            {
            // InternalScad.g:1517:3: ()
            // InternalScad.g:1518:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCylinderAccess().getCylinderAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1524:3: (otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ )
            // InternalScad.g:1525:4: otherlv_1= 'cylinder' otherlv_2= '(' ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+
            {
            otherlv_1=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getCylinderKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            // InternalScad.g:1533:4: ( ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30||(LA24_0>=32 && LA24_0<=35)||(LA24_0>=37 && LA24_0<=44)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalScad.g:1534:5: ( (lv_cylinderParams_3_0= ruleCylinderParams ) ) (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )*
                    {
                    // InternalScad.g:1534:5: ( (lv_cylinderParams_3_0= ruleCylinderParams ) )
                    // InternalScad.g:1535:6: (lv_cylinderParams_3_0= ruleCylinderParams )
                    {
                    // InternalScad.g:1535:6: (lv_cylinderParams_3_0= ruleCylinderParams )
                    // InternalScad.g:1536:7: lv_cylinderParams_3_0= ruleCylinderParams
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderAccess().getCylinderParamsCylinderParamsParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_cylinderParams_3_0=ruleCylinderParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderRule());
                      							}
                      							add(
                      								current,
                      								"cylinderParams",
                      								lv_cylinderParams_3_0,
                      								"com.karalisoft.Scad.CylinderParams");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalScad.g:1553:5: (otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalScad.g:1554:6: otherlv_4= ',' ( (lv_cylinderParams_5_0= ruleCylinderParams ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getCommaKeyword_1_2_1_0());
                    	      					
                    	    }
                    	    // InternalScad.g:1558:6: ( (lv_cylinderParams_5_0= ruleCylinderParams ) )
                    	    // InternalScad.g:1559:7: (lv_cylinderParams_5_0= ruleCylinderParams )
                    	    {
                    	    // InternalScad.g:1559:7: (lv_cylinderParams_5_0= ruleCylinderParams )
                    	    // InternalScad.g:1560:8: lv_cylinderParams_5_0= ruleCylinderParams
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCylinderAccess().getCylinderParamsCylinderParamsParserRuleCall_1_2_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_cylinderParams_5_0=ruleCylinderParams();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getCylinderRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"cylinderParams",
                    	      									lv_cylinderParams_5_0,
                    	      									"com.karalisoft.Scad.CylinderParams");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getCylinderAccess().getRightParenthesisKeyword_1_3());
              			
            }
            // InternalScad.g:1583:4: ( ( ';' )=>otherlv_7= ';' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) && (synpred7_InternalScad())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalScad.g:1584:5: ( ';' )=>otherlv_7= ';'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getCylinderAccess().getSemicolonKeyword_1_4());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleCylinderParams"
    // InternalScad.g:1595:1: entryRuleCylinderParams returns [EObject current=null] : iv_ruleCylinderParams= ruleCylinderParams EOF ;
    public final EObject entryRuleCylinderParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinderParams = null;


        try {
            // InternalScad.g:1595:55: (iv_ruleCylinderParams= ruleCylinderParams EOF )
            // InternalScad.g:1596:2: iv_ruleCylinderParams= ruleCylinderParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCylinderParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCylinderParams=ruleCylinderParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCylinderParams; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinderParams"


    // $ANTLR start "ruleCylinderParams"
    // InternalScad.g:1602:1: ruleCylinderParams returns [EObject current=null] : ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) ) | (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) ) | (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) ) | (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) ) | (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) ) | (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) ) | (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) ) | ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) ) ) ) ;
    public final EObject ruleCylinderParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_center_33_1=null;
        Token lv_center_33_2=null;
        AntlrDatatypeRuleToken lv_fn_3_0 = null;

        AntlrDatatypeRuleToken lv_fa_6_0 = null;

        AntlrDatatypeRuleToken lv_fs_9_0 = null;

        AntlrDatatypeRuleToken lv_h_12_0 = null;

        AntlrDatatypeRuleToken lv_r_15_0 = null;

        AntlrDatatypeRuleToken lv_r1_18_0 = null;

        AntlrDatatypeRuleToken lv_r2_21_0 = null;

        AntlrDatatypeRuleToken lv_d_24_0 = null;

        AntlrDatatypeRuleToken lv_d1_27_0 = null;

        AntlrDatatypeRuleToken lv_d2_30_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1608:2: ( ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) ) | (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) ) | (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) ) | (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) ) | (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) ) | (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) ) | (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) ) | ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) ) ) ) )
            // InternalScad.g:1609:2: ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) ) | (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) ) | (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) ) | (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) ) | (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) ) | (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) ) | (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) ) | ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) ) ) )
            {
            // InternalScad.g:1609:2: ( () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) ) | (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) ) | (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) ) | (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) ) | (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) ) | (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) ) | (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) ) | ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) ) ) )
            // InternalScad.g:1610:3: () ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) ) | (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) ) | (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) ) | (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) ) | (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) ) | (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) ) | (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) ) | ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) ) )
            {
            // InternalScad.g:1610:3: ()
            // InternalScad.g:1611:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCylinderParamsAccess().getCylinderParamsAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1617:3: ( (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) ) | (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) ) | (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) ) | (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) ) | (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) ) | (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) ) | (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) ) | (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) ) | (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) ) | (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) ) | ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) ) )
            int alt28=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt28=1;
                }
                break;
            case 32:
                {
                alt28=2;
                }
                break;
            case 33:
                {
                alt28=3;
                }
                break;
            case 37:
                {
                alt28=4;
                }
                break;
            case 34:
                {
                alt28=5;
                }
                break;
            case 38:
                {
                alt28=6;
                }
                break;
            case 39:
                {
                alt28=7;
                }
                break;
            case 35:
                {
                alt28=8;
                }
                break;
            case 40:
                {
                alt28=9;
                }
                break;
            case 41:
                {
                alt28=10;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt28=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalScad.g:1618:4: (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1618:4: (otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) ) )
                    // InternalScad.g:1619:5: otherlv_1= '$fn' otherlv_2= '=' ( (lv_fn_3_0= ruleDouble ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getCylinderParamsAccess().getFnKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_0_1());
                      				
                    }
                    // InternalScad.g:1627:5: ( (lv_fn_3_0= ruleDouble ) )
                    // InternalScad.g:1628:6: (lv_fn_3_0= ruleDouble )
                    {
                    // InternalScad.g:1628:6: (lv_fn_3_0= ruleDouble )
                    // InternalScad.g:1629:7: lv_fn_3_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getFnDoubleParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_fn_3_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"fn",
                      								lv_fn_3_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScad.g:1648:4: (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1648:4: (otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) ) )
                    // InternalScad.g:1649:5: otherlv_4= '$fa' otherlv_5= '=' ( (lv_fa_6_0= ruleDouble ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getCylinderParamsAccess().getFaKeyword_1_1_0());
                      				
                    }
                    otherlv_5=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_1_1());
                      				
                    }
                    // InternalScad.g:1657:5: ( (lv_fa_6_0= ruleDouble ) )
                    // InternalScad.g:1658:6: (lv_fa_6_0= ruleDouble )
                    {
                    // InternalScad.g:1658:6: (lv_fa_6_0= ruleDouble )
                    // InternalScad.g:1659:7: lv_fa_6_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getFaDoubleParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_fa_6_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"fa",
                      								lv_fa_6_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalScad.g:1678:4: (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1678:4: (otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) ) )
                    // InternalScad.g:1679:5: otherlv_7= '$fs' otherlv_8= '=' ( (lv_fs_9_0= ruleDouble ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getCylinderParamsAccess().getFsKeyword_1_2_0());
                      				
                    }
                    otherlv_8=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_2_1());
                      				
                    }
                    // InternalScad.g:1687:5: ( (lv_fs_9_0= ruleDouble ) )
                    // InternalScad.g:1688:6: (lv_fs_9_0= ruleDouble )
                    {
                    // InternalScad.g:1688:6: (lv_fs_9_0= ruleDouble )
                    // InternalScad.g:1689:7: lv_fs_9_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getFsDoubleParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_fs_9_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"fs",
                      								lv_fs_9_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalScad.g:1708:4: (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1708:4: (otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) ) )
                    // InternalScad.g:1709:5: otherlv_10= 'h' otherlv_11= '=' ( (lv_h_12_0= ruleDouble ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getCylinderParamsAccess().getHKeyword_1_3_0());
                      				
                    }
                    otherlv_11=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_3_1());
                      				
                    }
                    // InternalScad.g:1717:5: ( (lv_h_12_0= ruleDouble ) )
                    // InternalScad.g:1718:6: (lv_h_12_0= ruleDouble )
                    {
                    // InternalScad.g:1718:6: (lv_h_12_0= ruleDouble )
                    // InternalScad.g:1719:7: lv_h_12_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getHDoubleParserRuleCall_1_3_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_h_12_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"h",
                      								lv_h_12_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalScad.g:1738:4: (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1738:4: (otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) ) )
                    // InternalScad.g:1739:5: otherlv_13= 'r' otherlv_14= '=' ( (lv_r_15_0= ruleDouble ) )
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getCylinderParamsAccess().getRKeyword_1_4_0());
                      				
                    }
                    otherlv_14=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_4_1());
                      				
                    }
                    // InternalScad.g:1747:5: ( (lv_r_15_0= ruleDouble ) )
                    // InternalScad.g:1748:6: (lv_r_15_0= ruleDouble )
                    {
                    // InternalScad.g:1748:6: (lv_r_15_0= ruleDouble )
                    // InternalScad.g:1749:7: lv_r_15_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getRDoubleParserRuleCall_1_4_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_r_15_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"r",
                      								lv_r_15_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalScad.g:1768:4: (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1768:4: (otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) ) )
                    // InternalScad.g:1769:5: otherlv_16= 'r1' otherlv_17= '=' ( (lv_r1_18_0= ruleDouble ) )
                    {
                    otherlv_16=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_16, grammarAccess.getCylinderParamsAccess().getR1Keyword_1_5_0());
                      				
                    }
                    otherlv_17=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_5_1());
                      				
                    }
                    // InternalScad.g:1777:5: ( (lv_r1_18_0= ruleDouble ) )
                    // InternalScad.g:1778:6: (lv_r1_18_0= ruleDouble )
                    {
                    // InternalScad.g:1778:6: (lv_r1_18_0= ruleDouble )
                    // InternalScad.g:1779:7: lv_r1_18_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getR1DoubleParserRuleCall_1_5_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_r1_18_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"r1",
                      								lv_r1_18_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalScad.g:1798:4: (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1798:4: (otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) ) )
                    // InternalScad.g:1799:5: otherlv_19= 'r2' otherlv_20= '=' ( (lv_r2_21_0= ruleDouble ) )
                    {
                    otherlv_19=(Token)match(input,39,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_19, grammarAccess.getCylinderParamsAccess().getR2Keyword_1_6_0());
                      				
                    }
                    otherlv_20=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_20, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_6_1());
                      				
                    }
                    // InternalScad.g:1807:5: ( (lv_r2_21_0= ruleDouble ) )
                    // InternalScad.g:1808:6: (lv_r2_21_0= ruleDouble )
                    {
                    // InternalScad.g:1808:6: (lv_r2_21_0= ruleDouble )
                    // InternalScad.g:1809:7: lv_r2_21_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getR2DoubleParserRuleCall_1_6_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_r2_21_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"r2",
                      								lv_r2_21_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalScad.g:1828:4: (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1828:4: (otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) ) )
                    // InternalScad.g:1829:5: otherlv_22= 'd' otherlv_23= '=' ( (lv_d_24_0= ruleDouble ) )
                    {
                    otherlv_22=(Token)match(input,35,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_22, grammarAccess.getCylinderParamsAccess().getDKeyword_1_7_0());
                      				
                    }
                    otherlv_23=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_23, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_7_1());
                      				
                    }
                    // InternalScad.g:1837:5: ( (lv_d_24_0= ruleDouble ) )
                    // InternalScad.g:1838:6: (lv_d_24_0= ruleDouble )
                    {
                    // InternalScad.g:1838:6: (lv_d_24_0= ruleDouble )
                    // InternalScad.g:1839:7: lv_d_24_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getDDoubleParserRuleCall_1_7_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_d_24_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"d",
                      								lv_d_24_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalScad.g:1858:4: (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1858:4: (otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) ) )
                    // InternalScad.g:1859:5: otherlv_25= 'd1' otherlv_26= '=' ( (lv_d1_27_0= ruleDouble ) )
                    {
                    otherlv_25=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_25, grammarAccess.getCylinderParamsAccess().getD1Keyword_1_8_0());
                      				
                    }
                    otherlv_26=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_26, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_8_1());
                      				
                    }
                    // InternalScad.g:1867:5: ( (lv_d1_27_0= ruleDouble ) )
                    // InternalScad.g:1868:6: (lv_d1_27_0= ruleDouble )
                    {
                    // InternalScad.g:1868:6: (lv_d1_27_0= ruleDouble )
                    // InternalScad.g:1869:7: lv_d1_27_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getD1DoubleParserRuleCall_1_8_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_d1_27_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"d1",
                      								lv_d1_27_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalScad.g:1888:4: (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) )
                    {
                    // InternalScad.g:1888:4: (otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) ) )
                    // InternalScad.g:1889:5: otherlv_28= 'd2' otherlv_29= '=' ( (lv_d2_30_0= ruleDouble ) )
                    {
                    otherlv_28=(Token)match(input,41,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_28, grammarAccess.getCylinderParamsAccess().getD2Keyword_1_9_0());
                      				
                    }
                    otherlv_29=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_29, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_9_1());
                      				
                    }
                    // InternalScad.g:1897:5: ( (lv_d2_30_0= ruleDouble ) )
                    // InternalScad.g:1898:6: (lv_d2_30_0= ruleDouble )
                    {
                    // InternalScad.g:1898:6: (lv_d2_30_0= ruleDouble )
                    // InternalScad.g:1899:7: lv_d2_30_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCylinderParamsAccess().getD2DoubleParserRuleCall_1_9_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_d2_30_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCylinderParamsRule());
                      							}
                      							set(
                      								current,
                      								"d2",
                      								lv_d2_30_0,
                      								"com.karalisoft.Scad.Double");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalScad.g:1918:4: ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) )
                    {
                    // InternalScad.g:1918:4: ( (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) ) )
                    // InternalScad.g:1919:5: (otherlv_31= 'center' otherlv_32= '=' )? ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) )
                    {
                    // InternalScad.g:1919:5: (otherlv_31= 'center' otherlv_32= '=' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==42) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalScad.g:1920:6: otherlv_31= 'center' otherlv_32= '='
                            {
                            otherlv_31=(Token)match(input,42,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_31, grammarAccess.getCylinderParamsAccess().getCenterKeyword_1_10_0_0());
                              					
                            }
                            otherlv_32=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_32, grammarAccess.getCylinderParamsAccess().getEqualsSignKeyword_1_10_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalScad.g:1929:5: ( ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) ) )
                    // InternalScad.g:1930:6: ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) )
                    {
                    // InternalScad.g:1930:6: ( (lv_center_33_1= 'true' | lv_center_33_2= 'false' ) )
                    // InternalScad.g:1931:7: (lv_center_33_1= 'true' | lv_center_33_2= 'false' )
                    {
                    // InternalScad.g:1931:7: (lv_center_33_1= 'true' | lv_center_33_2= 'false' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==43) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==44) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalScad.g:1932:8: lv_center_33_1= 'true'
                            {
                            lv_center_33_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_center_33_1, grammarAccess.getCylinderParamsAccess().getCenterTrueKeyword_1_10_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCylinderParamsRule());
                              								}
                              								setWithLastConsumed(current, "center", lv_center_33_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalScad.g:1943:8: lv_center_33_2= 'false'
                            {
                            lv_center_33_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_center_33_2, grammarAccess.getCylinderParamsAccess().getCenterFalseKeyword_1_10_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCylinderParamsRule());
                              								}
                              								setWithLastConsumed(current, "center", lv_center_33_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinderParams"


    // $ANTLR start "entryRuleCube"
    // InternalScad.g:1962:1: entryRuleCube returns [EObject current=null] : iv_ruleCube= ruleCube EOF ;
    public final EObject entryRuleCube() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCube = null;


        try {
            // InternalScad.g:1962:45: (iv_ruleCube= ruleCube EOF )
            // InternalScad.g:1963:2: iv_ruleCube= ruleCube EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCubeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCube=ruleCube();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCube; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCube"


    // $ANTLR start "ruleCube"
    // InternalScad.g:1969:1: ruleCube returns [EObject current=null] : ( () (otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) ) ;
    public final EObject ruleCube() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_cubeParams_3_0 = null;

        EObject lv_cubeParams_5_0 = null;



        	enterRule();

        try {
            // InternalScad.g:1975:2: ( ( () (otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) ) )
            // InternalScad.g:1976:2: ( () (otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) )
            {
            // InternalScad.g:1976:2: ( () (otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ ) )
            // InternalScad.g:1977:3: () (otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ )
            {
            // InternalScad.g:1977:3: ()
            // InternalScad.g:1978:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCubeAccess().getCubeAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:1984:3: (otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+ )
            // InternalScad.g:1985:4: otherlv_1= 'cube' otherlv_2= '(' ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )? otherlv_6= ')' ( ( ';' )=>otherlv_7= ';' )+
            {
            otherlv_1=(Token)match(input,45,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getCubeAccess().getCubeKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getCubeAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            // InternalScad.g:1993:4: ( ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==24||(LA30_0>=42 && LA30_0<=44)||LA30_0==46||(LA30_0>=50 && LA30_0<=51)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalScad.g:1994:5: ( (lv_cubeParams_3_0= ruleCubeParams ) ) (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )*
                    {
                    // InternalScad.g:1994:5: ( (lv_cubeParams_3_0= ruleCubeParams ) )
                    // InternalScad.g:1995:6: (lv_cubeParams_3_0= ruleCubeParams )
                    {
                    // InternalScad.g:1995:6: (lv_cubeParams_3_0= ruleCubeParams )
                    // InternalScad.g:1996:7: lv_cubeParams_3_0= ruleCubeParams
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCubeAccess().getCubeParamsCubeParamsParserRuleCall_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_24);
                    lv_cubeParams_3_0=ruleCubeParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCubeRule());
                      							}
                      							add(
                      								current,
                      								"cubeParams",
                      								lv_cubeParams_3_0,
                      								"com.karalisoft.Scad.CubeParams");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalScad.g:2013:5: (otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==25) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalScad.g:2014:6: otherlv_4= ',' ( (lv_cubeParams_5_0= ruleCubeParams ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getCubeAccess().getCommaKeyword_1_2_1_0());
                    	      					
                    	    }
                    	    // InternalScad.g:2018:6: ( (lv_cubeParams_5_0= ruleCubeParams ) )
                    	    // InternalScad.g:2019:7: (lv_cubeParams_5_0= ruleCubeParams )
                    	    {
                    	    // InternalScad.g:2019:7: (lv_cubeParams_5_0= ruleCubeParams )
                    	    // InternalScad.g:2020:8: lv_cubeParams_5_0= ruleCubeParams
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCubeAccess().getCubeParamsCubeParamsParserRuleCall_1_2_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_cubeParams_5_0=ruleCubeParams();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getCubeRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"cubeParams",
                    	      									lv_cubeParams_5_0,
                    	      									"com.karalisoft.Scad.CubeParams");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getCubeAccess().getRightParenthesisKeyword_1_3());
              			
            }
            // InternalScad.g:2043:4: ( ( ';' )=>otherlv_7= ';' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) && (synpred8_InternalScad())) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalScad.g:2044:5: ( ';' )=>otherlv_7= ';'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getCubeAccess().getSemicolonKeyword_1_4());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCube"


    // $ANTLR start "entryRuleCubeParams"
    // InternalScad.g:2055:1: entryRuleCubeParams returns [EObject current=null] : iv_ruleCubeParams= ruleCubeParams EOF ;
    public final EObject entryRuleCubeParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCubeParams = null;


        try {
            // InternalScad.g:2055:51: (iv_ruleCubeParams= ruleCubeParams EOF )
            // InternalScad.g:2056:2: iv_ruleCubeParams= ruleCubeParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCubeParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCubeParams=ruleCubeParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCubeParams; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCubeParams"


    // $ANTLR start "ruleCubeParams"
    // InternalScad.g:2062:1: ruleCubeParams returns [EObject current=null] : ( () ( ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) ) | ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) ) ) ) ;
    public final EObject ruleCubeParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_center_13_1=null;
        Token lv_center_13_2=null;
        AntlrDatatypeRuleToken lv_size_3_0 = null;

        AntlrDatatypeRuleToken lv_x_5_0 = null;

        AntlrDatatypeRuleToken lv_y_7_0 = null;

        AntlrDatatypeRuleToken lv_z_9_0 = null;



        	enterRule();

        try {
            // InternalScad.g:2068:2: ( ( () ( ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) ) | ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) ) ) ) )
            // InternalScad.g:2069:2: ( () ( ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) ) | ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) ) ) )
            {
            // InternalScad.g:2069:2: ( () ( ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) ) | ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) ) ) )
            // InternalScad.g:2070:3: () ( ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) ) | ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) ) )
            {
            // InternalScad.g:2070:3: ()
            // InternalScad.g:2071:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCubeParamsAccess().getCubeParamsAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:2077:3: ( ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) ) | ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==24||LA36_0==46||(LA36_0>=50 && LA36_0<=51)) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=42 && LA36_0<=44)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalScad.g:2078:4: ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) )
                    {
                    // InternalScad.g:2078:4: ( (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) ) )
                    // InternalScad.g:2079:5: (otherlv_1= 'size' otherlv_2= '=' )? ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) )
                    {
                    // InternalScad.g:2079:5: (otherlv_1= 'size' otherlv_2= '=' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==46) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalScad.g:2080:6: otherlv_1= 'size' otherlv_2= '='
                            {
                            otherlv_1=(Token)match(input,46,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getCubeParamsAccess().getSizeKeyword_1_0_0_0());
                              					
                            }
                            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getCubeParamsAccess().getEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalScad.g:2089:5: ( ( (lv_size_3_0= ruleDouble ) ) | (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT||(LA33_0>=50 && LA33_0<=51)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==24) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalScad.g:2090:6: ( (lv_size_3_0= ruleDouble ) )
                            {
                            // InternalScad.g:2090:6: ( (lv_size_3_0= ruleDouble ) )
                            // InternalScad.g:2091:7: (lv_size_3_0= ruleDouble )
                            {
                            // InternalScad.g:2091:7: (lv_size_3_0= ruleDouble )
                            // InternalScad.g:2092:8: lv_size_3_0= ruleDouble
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getCubeParamsAccess().getSizeDoubleParserRuleCall_1_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_size_3_0=ruleDouble();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getCubeParamsRule());
                              								}
                              								set(
                              									current,
                              									"size",
                              									lv_size_3_0,
                              									"com.karalisoft.Scad.Double");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalScad.g:2110:6: (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' )
                            {
                            // InternalScad.g:2110:6: (otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']' )
                            // InternalScad.g:2111:7: otherlv_4= '[' ( (lv_x_5_0= ruleDouble ) ) otherlv_6= ',' ( (lv_y_7_0= ruleDouble ) ) otherlv_8= ',' ( (lv_z_9_0= ruleDouble ) ) otherlv_10= ']'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getCubeParamsAccess().getLeftSquareBracketKeyword_1_0_1_1_0());
                              						
                            }
                            // InternalScad.g:2115:7: ( (lv_x_5_0= ruleDouble ) )
                            // InternalScad.g:2116:8: (lv_x_5_0= ruleDouble )
                            {
                            // InternalScad.g:2116:8: (lv_x_5_0= ruleDouble )
                            // InternalScad.g:2117:9: lv_x_5_0= ruleDouble
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getCubeParamsAccess().getXDoubleParserRuleCall_1_0_1_1_1_0());
                              								
                            }
                            pushFollow(FOLLOW_16);
                            lv_x_5_0=ruleDouble();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getCubeParamsRule());
                              									}
                              									set(
                              										current,
                              										"x",
                              										lv_x_5_0,
                              										"com.karalisoft.Scad.Double");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_6, grammarAccess.getCubeParamsAccess().getCommaKeyword_1_0_1_1_2());
                              						
                            }
                            // InternalScad.g:2138:7: ( (lv_y_7_0= ruleDouble ) )
                            // InternalScad.g:2139:8: (lv_y_7_0= ruleDouble )
                            {
                            // InternalScad.g:2139:8: (lv_y_7_0= ruleDouble )
                            // InternalScad.g:2140:9: lv_y_7_0= ruleDouble
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getCubeParamsAccess().getYDoubleParserRuleCall_1_0_1_1_3_0());
                              								
                            }
                            pushFollow(FOLLOW_16);
                            lv_y_7_0=ruleDouble();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getCubeParamsRule());
                              									}
                              									set(
                              										current,
                              										"y",
                              										lv_y_7_0,
                              										"com.karalisoft.Scad.Double");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getCubeParamsAccess().getCommaKeyword_1_0_1_1_4());
                              						
                            }
                            // InternalScad.g:2161:7: ( (lv_z_9_0= ruleDouble ) )
                            // InternalScad.g:2162:8: (lv_z_9_0= ruleDouble )
                            {
                            // InternalScad.g:2162:8: (lv_z_9_0= ruleDouble )
                            // InternalScad.g:2163:9: lv_z_9_0= ruleDouble
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getCubeParamsAccess().getZDoubleParserRuleCall_1_0_1_1_5_0());
                              								
                            }
                            pushFollow(FOLLOW_17);
                            lv_z_9_0=ruleDouble();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getCubeParamsRule());
                              									}
                              									set(
                              										current,
                              										"z",
                              										lv_z_9_0,
                              										"com.karalisoft.Scad.Double");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_10, grammarAccess.getCubeParamsAccess().getRightSquareBracketKeyword_1_0_1_1_6());
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScad.g:2188:4: ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) )
                    {
                    // InternalScad.g:2188:4: ( (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) ) )
                    // InternalScad.g:2189:5: (otherlv_11= 'center' otherlv_12= '=' )? ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) )
                    {
                    // InternalScad.g:2189:5: (otherlv_11= 'center' otherlv_12= '=' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==42) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalScad.g:2190:6: otherlv_11= 'center' otherlv_12= '='
                            {
                            otherlv_11=(Token)match(input,42,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getCubeParamsAccess().getCenterKeyword_1_1_0_0());
                              					
                            }
                            otherlv_12=(Token)match(input,31,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getCubeParamsAccess().getEqualsSignKeyword_1_1_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalScad.g:2199:5: ( ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) ) )
                    // InternalScad.g:2200:6: ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) )
                    {
                    // InternalScad.g:2200:6: ( (lv_center_13_1= 'true' | lv_center_13_2= 'false' ) )
                    // InternalScad.g:2201:7: (lv_center_13_1= 'true' | lv_center_13_2= 'false' )
                    {
                    // InternalScad.g:2201:7: (lv_center_13_1= 'true' | lv_center_13_2= 'false' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==43) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==44) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalScad.g:2202:8: lv_center_13_1= 'true'
                            {
                            lv_center_13_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_center_13_1, grammarAccess.getCubeParamsAccess().getCenterTrueKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCubeParamsRule());
                              								}
                              								setWithLastConsumed(current, "center", lv_center_13_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalScad.g:2213:8: lv_center_13_2= 'false'
                            {
                            lv_center_13_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_center_13_2, grammarAccess.getCubeParamsAccess().getCenterFalseKeyword_1_1_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCubeParamsRule());
                              								}
                              								setWithLastConsumed(current, "center", lv_center_13_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCubeParams"


    // $ANTLR start "entryRuleUnion"
    // InternalScad.g:2232:1: entryRuleUnion returns [EObject current=null] : iv_ruleUnion= ruleUnion EOF ;
    public final EObject entryRuleUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnion = null;


        try {
            // InternalScad.g:2232:46: (iv_ruleUnion= ruleUnion EOF )
            // InternalScad.g:2233:2: iv_ruleUnion= ruleUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnion=ruleUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnion"


    // $ANTLR start "ruleUnion"
    // InternalScad.g:2239:1: ruleUnion returns [EObject current=null] : ( () (otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) ) ;
    public final EObject ruleUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_shapes_5_1 = null;

        EObject lv_shapes_5_2 = null;

        EObject lv_shapes_5_3 = null;



        	enterRule();

        try {
            // InternalScad.g:2245:2: ( ( () (otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) ) )
            // InternalScad.g:2246:2: ( () (otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) )
            {
            // InternalScad.g:2246:2: ( () (otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) )
            // InternalScad.g:2247:3: () (otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* )
            {
            // InternalScad.g:2247:3: ()
            // InternalScad.g:2248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnionAccess().getUnionAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:2254:3: (otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* )
            // InternalScad.g:2255:4: otherlv_1= 'union' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )*
            {
            otherlv_1=(Token)match(input,47,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getUnionAccess().getUnionKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            otherlv_3=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getUnionAccess().getRightParenthesisKeyword_1_2());
              			
            }
            otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getUnionAccess().getLeftCurlyBracketKeyword_1_3());
              			
            }
            // InternalScad.g:2271:4: ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==23||(LA38_0>=27 && LA38_0<=29)||LA38_0==36||LA38_0==45||(LA38_0>=47 && LA38_0<=49)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalScad.g:2272:5: ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) )
            	    {
            	    // InternalScad.g:2272:5: ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) )
            	    // InternalScad.g:2273:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )
            	    {
            	    // InternalScad.g:2273:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )
            	    int alt37=3;
            	    alt37 = dfa37.predict(input);
            	    switch (alt37) {
            	        case 1 :
            	            // InternalScad.g:2274:7: lv_shapes_5_1= ruleShape
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getUnionAccess().getShapesShapeParserRuleCall_1_4_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_1=ruleShape();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getUnionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_1,
            	              								"com.karalisoft.Scad.Shape");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:2290:7: lv_shapes_5_2= ruleModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getUnionAccess().getShapesModuleOrFunctionCallParserRuleCall_1_4_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_2=ruleModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getUnionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_2,
            	              								"com.karalisoft.Scad.ModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:2306:7: lv_shapes_5_3= ruleTransformedModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getUnionAccess().getShapesTransformedModuleOrFunctionCallParserRuleCall_1_4_0_2());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_3=ruleTransformedModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getUnionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_3,
            	              								"com.karalisoft.Scad.TransformedModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getUnionAccess().getRightCurlyBracketKeyword_1_5());
              			
            }
            // InternalScad.g:2328:4: ( ( ';' )=>otherlv_7= ';' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==16) && (synpred9_InternalScad())) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalScad.g:2329:5: ( ';' )=>otherlv_7= ';'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getUnionAccess().getSemicolonKeyword_1_6());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnion"


    // $ANTLR start "entryRuleIntersection"
    // InternalScad.g:2340:1: entryRuleIntersection returns [EObject current=null] : iv_ruleIntersection= ruleIntersection EOF ;
    public final EObject entryRuleIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersection = null;


        try {
            // InternalScad.g:2340:53: (iv_ruleIntersection= ruleIntersection EOF )
            // InternalScad.g:2341:2: iv_ruleIntersection= ruleIntersection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntersectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntersection=ruleIntersection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntersection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntersection"


    // $ANTLR start "ruleIntersection"
    // InternalScad.g:2347:1: ruleIntersection returns [EObject current=null] : ( () (otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) ) ;
    public final EObject ruleIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_shapes_5_1 = null;

        EObject lv_shapes_5_2 = null;

        EObject lv_shapes_5_3 = null;



        	enterRule();

        try {
            // InternalScad.g:2353:2: ( ( () (otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) ) )
            // InternalScad.g:2354:2: ( () (otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) )
            {
            // InternalScad.g:2354:2: ( () (otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) )
            // InternalScad.g:2355:3: () (otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* )
            {
            // InternalScad.g:2355:3: ()
            // InternalScad.g:2356:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntersectionAccess().getIntersectionAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:2362:3: (otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* )
            // InternalScad.g:2363:4: otherlv_1= 'intersection' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )*
            {
            otherlv_1=(Token)match(input,48,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getIntersectionAccess().getIntersectionKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getIntersectionAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            otherlv_3=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getIntersectionAccess().getRightParenthesisKeyword_1_2());
              			
            }
            otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_1_3());
              			
            }
            // InternalScad.g:2379:4: ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==23||(LA41_0>=27 && LA41_0<=29)||LA41_0==36||LA41_0==45||(LA41_0>=47 && LA41_0<=49)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalScad.g:2380:5: ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) )
            	    {
            	    // InternalScad.g:2380:5: ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) )
            	    // InternalScad.g:2381:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )
            	    {
            	    // InternalScad.g:2381:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )
            	    int alt40=3;
            	    alt40 = dfa40.predict(input);
            	    switch (alt40) {
            	        case 1 :
            	            // InternalScad.g:2382:7: lv_shapes_5_1= ruleShape
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getIntersectionAccess().getShapesShapeParserRuleCall_1_4_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_1=ruleShape();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_1,
            	              								"com.karalisoft.Scad.Shape");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:2398:7: lv_shapes_5_2= ruleModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getIntersectionAccess().getShapesModuleOrFunctionCallParserRuleCall_1_4_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_2=ruleModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_2,
            	              								"com.karalisoft.Scad.ModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:2414:7: lv_shapes_5_3= ruleTransformedModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getIntersectionAccess().getShapesTransformedModuleOrFunctionCallParserRuleCall_1_4_0_2());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_3=ruleTransformedModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_3,
            	              								"com.karalisoft.Scad.TransformedModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_1_5());
              			
            }
            // InternalScad.g:2436:4: ( ( ';' )=>otherlv_7= ';' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) && (synpred10_InternalScad())) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalScad.g:2437:5: ( ';' )=>otherlv_7= ';'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getIntersectionAccess().getSemicolonKeyword_1_6());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntersection"


    // $ANTLR start "entryRuleDifference"
    // InternalScad.g:2448:1: entryRuleDifference returns [EObject current=null] : iv_ruleDifference= ruleDifference EOF ;
    public final EObject entryRuleDifference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifference = null;


        try {
            // InternalScad.g:2448:51: (iv_ruleDifference= ruleDifference EOF )
            // InternalScad.g:2449:2: iv_ruleDifference= ruleDifference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDifferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDifference=ruleDifference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDifference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDifference"


    // $ANTLR start "ruleDifference"
    // InternalScad.g:2455:1: ruleDifference returns [EObject current=null] : ( () (otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) ) ;
    public final EObject ruleDifference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_shapes_5_1 = null;

        EObject lv_shapes_5_2 = null;

        EObject lv_shapes_5_3 = null;



        	enterRule();

        try {
            // InternalScad.g:2461:2: ( ( () (otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) ) )
            // InternalScad.g:2462:2: ( () (otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) )
            {
            // InternalScad.g:2462:2: ( () (otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* ) )
            // InternalScad.g:2463:3: () (otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* )
            {
            // InternalScad.g:2463:3: ()
            // InternalScad.g:2464:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDifferenceAccess().getDifferenceAction_0(),
              					current);
              			
            }

            }

            // InternalScad.g:2470:3: (otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )* )
            // InternalScad.g:2471:4: otherlv_1= 'difference' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )* otherlv_6= '}' ( ( ';' )=>otherlv_7= ';' )*
            {
            otherlv_1=(Token)match(input,49,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getDifferenceAccess().getDifferenceKeyword_1_0());
              			
            }
            otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getDifferenceAccess().getLeftParenthesisKeyword_1_1());
              			
            }
            otherlv_3=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getDifferenceAccess().getRightParenthesisKeyword_1_2());
              			
            }
            otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDifferenceAccess().getLeftCurlyBracketKeyword_1_3());
              			
            }
            // InternalScad.g:2487:4: ( ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==23||(LA44_0>=27 && LA44_0<=29)||LA44_0==36||LA44_0==45||(LA44_0>=47 && LA44_0<=49)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalScad.g:2488:5: ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) )
            	    {
            	    // InternalScad.g:2488:5: ( (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall ) )
            	    // InternalScad.g:2489:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )
            	    {
            	    // InternalScad.g:2489:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )
            	    int alt43=3;
            	    alt43 = dfa43.predict(input);
            	    switch (alt43) {
            	        case 1 :
            	            // InternalScad.g:2490:7: lv_shapes_5_1= ruleShape
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getDifferenceAccess().getShapesShapeParserRuleCall_1_4_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_1=ruleShape();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getDifferenceRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_1,
            	              								"com.karalisoft.Scad.Shape");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalScad.g:2506:7: lv_shapes_5_2= ruleModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getDifferenceAccess().getShapesModuleOrFunctionCallParserRuleCall_1_4_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_2=ruleModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getDifferenceRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_2,
            	              								"com.karalisoft.Scad.ModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalScad.g:2522:7: lv_shapes_5_3= ruleTransformedModuleOrFunctionCall
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getDifferenceAccess().getShapesTransformedModuleOrFunctionCallParserRuleCall_1_4_0_2());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_shapes_5_3=ruleTransformedModuleOrFunctionCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getDifferenceRule());
            	              							}
            	              							add(
            	              								current,
            	              								"shapes",
            	              								lv_shapes_5_3,
            	              								"com.karalisoft.Scad.TransformedModuleOrFunctionCall");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getDifferenceAccess().getRightCurlyBracketKeyword_1_5());
              			
            }
            // InternalScad.g:2544:4: ( ( ';' )=>otherlv_7= ';' )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==16) && (synpred11_InternalScad())) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalScad.g:2545:5: ( ';' )=>otherlv_7= ';'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getDifferenceAccess().getSemicolonKeyword_1_6());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDifference"


    // $ANTLR start "entryRuleDouble"
    // InternalScad.g:2556:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalScad.g:2556:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalScad.g:2557:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalScad.g:2563:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalScad.g:2569:2: ( ( (kw= '+' | kw= '-' )? (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ) )
            // InternalScad.g:2570:2: ( (kw= '+' | kw= '-' )? (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            {
            // InternalScad.g:2570:2: ( (kw= '+' | kw= '-' )? (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // InternalScad.g:2571:3: (kw= '+' | kw= '-' )? (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // InternalScad.g:2571:3: (kw= '+' | kw= '-' )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            else if ( (LA46_0==51) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // InternalScad.g:2572:4: kw= '+'
                    {
                    kw=(Token)match(input,50,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDoubleAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalScad.g:2578:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalScad.g:2584:3: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // InternalScad.g:2585:4: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_INT_2);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_0());
              			
            }
            // InternalScad.g:2592:4: (kw= '.' this_INT_4= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalScad.g:2593:5: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,14,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_1_0());
                      				
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_INT_4);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_INT_4, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1_1());
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"

    // $ANTLR start synpred1_InternalScad
    public final void synpred1_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:220:4: ( ';' )
        // InternalScad.g:220:5: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalScad

    // $ANTLR start synpred2_InternalScad
    public final void synpred2_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:378:4: ( ';' )
        // InternalScad.g:378:5: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalScad

    // $ANTLR start synpred3_InternalScad
    public final void synpred3_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:441:4: ( ';' )
        // InternalScad.g:441:5: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalScad

    // $ANTLR start synpred4_InternalScad
    public final void synpred4_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:1109:4: ( ';' )
        // InternalScad.g:1109:5: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalScad

    // $ANTLR start synpred5_InternalScad
    public final void synpred5_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:1222:4: ( ';' )
        // InternalScad.g:1222:5: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalScad

    // $ANTLR start synpred6_InternalScad
    public final void synpred6_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:1314:5: ( ';' )
        // InternalScad.g:1314:6: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalScad

    // $ANTLR start synpred7_InternalScad
    public final void synpred7_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:1584:5: ( ';' )
        // InternalScad.g:1584:6: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalScad

    // $ANTLR start synpred8_InternalScad
    public final void synpred8_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:2044:5: ( ';' )
        // InternalScad.g:2044:6: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalScad

    // $ANTLR start synpred9_InternalScad
    public final void synpred9_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:2329:5: ( ';' )
        // InternalScad.g:2329:6: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalScad

    // $ANTLR start synpred10_InternalScad
    public final void synpred10_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:2437:5: ( ';' )
        // InternalScad.g:2437:6: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalScad

    // $ANTLR start synpred11_InternalScad
    public final void synpred11_InternalScad_fragment() throws RecognitionException {   
        // InternalScad.g:2545:5: ( ';' )
        // InternalScad.g:2545:6: ';'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalScad

    // Delegated rules

    public final boolean synpred6_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalScad() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalScad_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String dfa_1s = "\116\uffff";
    static final String dfa_2s = "\1\4\1\uffff\3\22\3\uffff\2\30\6\5\1\16\2\5\1\16\2\5\1\16\2\5\1\16\1\5\1\24\6\5\1\23\1\4\1\31\2\5\1\16\1\31\2\5\1\16\1\31\2\5\1\16\1\uffff\6\5\1\31\2\5\1\16\1\31\2\5\1\16\1\31\2\5\1\16\1\5\1\23\1\5\1\23\1\5\1\23\1\32\1\24\1\32\1\24\1\32";
    static final String dfa_3s = "\1\61\1\uffff\3\22\3\uffff\2\30\4\63\2\5\1\23\2\5\1\31\2\5\1\31\2\5\1\31\1\5\1\34\1\5\1\63\1\5\1\63\1\5\1\63\1\23\1\61\1\31\2\5\2\31\2\5\2\31\2\5\1\31\1\uffff\1\5\1\63\1\5\1\63\1\5\1\63\1\31\2\5\1\32\1\31\2\5\1\32\1\31\2\5\1\32\1\5\1\23\1\5\1\23\1\5\1\23\1\32\1\34\1\32\1\34\1\32";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\50\uffff\1\5\35\uffff";
    static final String dfa_5s = "\116\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\14\uffff\1\1\4\uffff\1\6\1\2\3\uffff\1\3\1\4\1\5\6\uffff\1\5\10\uffff\1\5\1\uffff\3\5",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\20\22\uffff\1\15\31\uffff\1\16\1\17",
            "\1\23\54\uffff\1\21\1\22",
            "\1\26\54\uffff\1\24\1\25",
            "\1\31\54\uffff\1\27\1\30",
            "\1\20",
            "\1\20",
            "\1\32\4\uffff\1\33",
            "\1\23",
            "\1\23",
            "\1\34\12\uffff\1\35",
            "\1\26",
            "\1\26",
            "\1\36\12\uffff\1\37",
            "\1\31",
            "\1\31",
            "\1\40\12\uffff\1\41",
            "\1\42",
            "\1\43\2\uffff\1\2\3\uffff\1\3\1\4",
            "\1\44",
            "\1\47\54\uffff\1\45\1\46",
            "\1\50",
            "\1\53\54\uffff\1\51\1\52",
            "\1\54",
            "\1\57\54\uffff\1\55\1\56",
            "\1\33",
            "\1\60\22\uffff\1\5\3\uffff\3\5\6\uffff\1\5\10\uffff\1\5\1\uffff\3\5",
            "\1\35",
            "\1\47",
            "\1\47",
            "\1\61\12\uffff\1\62",
            "\1\37",
            "\1\53",
            "\1\53",
            "\1\63\12\uffff\1\64",
            "\1\41",
            "\1\57",
            "\1\57",
            "\1\65\12\uffff\1\66",
            "",
            "\1\67",
            "\1\72\54\uffff\1\70\1\71",
            "\1\73",
            "\1\76\54\uffff\1\74\1\75",
            "\1\77",
            "\1\102\54\uffff\1\100\1\101",
            "\1\62",
            "\1\72",
            "\1\72",
            "\1\103\13\uffff\1\104",
            "\1\64",
            "\1\76",
            "\1\76",
            "\1\105\13\uffff\1\106",
            "\1\66",
            "\1\102",
            "\1\102",
            "\1\107\13\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\33",
            "\1\104",
            "\1\43\2\uffff\1\2\3\uffff\1\3\1\4",
            "\1\106",
            "\1\43\2\uffff\1\2\3\uffff\1\3\1\4",
            "\1\110"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "289:6: (lv_blocks_6_1= ruleModule | lv_blocks_6_2= ruleShape | lv_blocks_6_3= ruleFunction | lv_blocks_6_4= ruleModuleOrFunctionCall | lv_blocks_6_5= ruleTransformedModuleOrFunctionCall )";
        }
    }
    static final String dfa_7s = "\114\uffff";
    static final String dfa_8s = "\1\4\3\22\2\uffff\2\30\6\5\1\16\2\5\1\16\2\5\1\16\2\5\1\16\1\5\1\24\6\5\1\23\1\4\1\31\2\5\1\16\1\31\2\5\1\16\1\31\2\5\1\16\1\uffff\6\5\1\31\2\5\1\16\1\31\2\5\1\16\1\31\2\5\1\16\1\5\1\23\1\5\1\23\1\5\1\23\1\32\1\24\1\32\1\24\1\32";
    static final String dfa_9s = "\1\61\3\22\2\uffff\2\30\4\63\2\5\1\23\2\5\1\31\2\5\1\31\2\5\1\31\1\5\1\34\1\5\1\63\1\5\1\63\1\5\1\63\1\23\1\61\1\31\2\5\2\31\2\5\2\31\2\5\1\31\1\uffff\1\5\1\63\1\5\1\63\1\5\1\63\1\31\2\5\1\32\1\31\2\5\1\32\1\31\2\5\1\32\1\5\1\23\1\5\1\23\1\5\1\23\1\32\1\34\1\32\1\34\1\32";
    static final String dfa_10s = "\4\uffff\1\1\1\2\50\uffff\1\3\35\uffff";
    static final String dfa_11s = "\114\uffff}>";
    static final String[] dfa_12s = {
            "\1\5\22\uffff\1\1\3\uffff\1\2\1\3\1\4\6\uffff\1\4\10\uffff\1\4\1\uffff\3\4",
            "\1\6",
            "\1\7",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\16\22\uffff\1\13\31\uffff\1\14\1\15",
            "\1\21\54\uffff\1\17\1\20",
            "\1\24\54\uffff\1\22\1\23",
            "\1\27\54\uffff\1\25\1\26",
            "\1\16",
            "\1\16",
            "\1\30\4\uffff\1\31",
            "\1\21",
            "\1\21",
            "\1\32\12\uffff\1\33",
            "\1\24",
            "\1\24",
            "\1\34\12\uffff\1\35",
            "\1\27",
            "\1\27",
            "\1\36\12\uffff\1\37",
            "\1\40",
            "\1\41\2\uffff\1\1\3\uffff\1\2\1\3",
            "\1\42",
            "\1\45\54\uffff\1\43\1\44",
            "\1\46",
            "\1\51\54\uffff\1\47\1\50",
            "\1\52",
            "\1\55\54\uffff\1\53\1\54",
            "\1\31",
            "\1\56\22\uffff\1\4\3\uffff\3\4\6\uffff\1\4\10\uffff\1\4\1\uffff\3\4",
            "\1\33",
            "\1\45",
            "\1\45",
            "\1\57\12\uffff\1\60",
            "\1\35",
            "\1\51",
            "\1\51",
            "\1\61\12\uffff\1\62",
            "\1\37",
            "\1\55",
            "\1\55",
            "\1\63\12\uffff\1\64",
            "",
            "\1\65",
            "\1\70\54\uffff\1\66\1\67",
            "\1\71",
            "\1\74\54\uffff\1\72\1\73",
            "\1\75",
            "\1\100\54\uffff\1\76\1\77",
            "\1\60",
            "\1\70",
            "\1\70",
            "\1\101\13\uffff\1\102",
            "\1\62",
            "\1\74",
            "\1\74",
            "\1\103\13\uffff\1\104",
            "\1\64",
            "\1\100",
            "\1\100",
            "\1\105\13\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\31",
            "\1\102",
            "\1\41\2\uffff\1\1\3\uffff\1\2\1\3",
            "\1\104",
            "\1\41\2\uffff\1\1\3\uffff\1\2\1\3",
            "\1\106"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2273:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )";
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2381:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )";
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2489:6: (lv_shapes_5_1= ruleShape | lv_shapes_5_2= ruleModuleOrFunctionCall | lv_shapes_5_3= ruleTransformedModuleOrFunctionCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0003A01038C21812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0003A01038E20010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000C000001000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018900000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0003A01038800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003A01038A00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000F40080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000F40000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00001FEF40080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001FEF40000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C5C0001080020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000C5C0001000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004002L});

}