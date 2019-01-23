package xtext.farmbot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.farmbot.services.MyFarmbotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFarmbotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'turnOn('", "'pin'", "'='", "','", "'mode'", "')'", "'turnOff('", "'moveRelative('", "'x'", "'y'", "'z'", "'speed'", "'findHome('", "'findX'", "'findY'", "'findZ'", "'sequence'", "'end'", "'if'", "'then'", "'else'", "'moveAbsolute('", "'z='", "'executeSequence'", "'('", "'id'", "'wait'", "'duration'", "'isToolOn'", "'sendMessage'", "'message'", "'runFarmware'", "'name'", "'takePhoto()'", "'schedule'", "'startDate'", "'startTime'", "'repeat'", "'repeatFrequency'", "'repeatUnit'", "'endDate'", "'endTime'", "'listPeripherals()'", "'listSequences()'", "'equals'", "'to'", "'not'", "'greater'", "'than'", "'lower'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
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


        public InternalMyFarmbotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyFarmbotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyFarmbotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyFarmbot.g"; }



     	private MyFarmbotGrammarAccess grammarAccess;

        public InternalMyFarmbotParser(TokenStream input, MyFarmbotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Farmbot";
       	}

       	@Override
       	protected MyFarmbotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFarmbot"
    // InternalMyFarmbot.g:64:1: entryRuleFarmbot returns [EObject current=null] : iv_ruleFarmbot= ruleFarmbot EOF ;
    public final EObject entryRuleFarmbot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFarmbot = null;


        try {
            // InternalMyFarmbot.g:64:48: (iv_ruleFarmbot= ruleFarmbot EOF )
            // InternalMyFarmbot.g:65:2: iv_ruleFarmbot= ruleFarmbot EOF
            {
             newCompositeNode(grammarAccess.getFarmbotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFarmbot=ruleFarmbot();

            state._fsp--;

             current =iv_ruleFarmbot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFarmbot"


    // $ANTLR start "ruleFarmbot"
    // InternalMyFarmbot.g:71:1: ruleFarmbot returns [EObject current=null] : ( () ( (lv_instructions_1_0= ruleInstruction ) )+ ) ;
    public final EObject ruleFarmbot() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_1_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:77:2: ( ( () ( (lv_instructions_1_0= ruleInstruction ) )+ ) )
            // InternalMyFarmbot.g:78:2: ( () ( (lv_instructions_1_0= ruleInstruction ) )+ )
            {
            // InternalMyFarmbot.g:78:2: ( () ( (lv_instructions_1_0= ruleInstruction ) )+ )
            // InternalMyFarmbot.g:79:3: () ( (lv_instructions_1_0= ruleInstruction ) )+
            {
            // InternalMyFarmbot.g:79:3: ()
            // InternalMyFarmbot.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFarmbotAccess().getFarmbotAction_0(),
            					current);
            			

            }

            // InternalMyFarmbot.g:86:3: ( (lv_instructions_1_0= ruleInstruction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=18)||LA1_0==23||LA1_0==27||LA1_0==29||LA1_0==32||LA1_0==34||LA1_0==37||(LA1_0>=39 && LA1_0<=40)||LA1_0==42||(LA1_0>=44 && LA1_0<=45)||(LA1_0>=53 && LA1_0<=54)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyFarmbot.g:87:4: (lv_instructions_1_0= ruleInstruction )
            	    {
            	    // InternalMyFarmbot.g:87:4: (lv_instructions_1_0= ruleInstruction )
            	    // InternalMyFarmbot.g:88:5: lv_instructions_1_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getFarmbotAccess().getInstructionsInstructionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_1_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFarmbotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_1_0,
            	    						"xtext.farmbot.MyFarmbot.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFarmbot"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyFarmbot.g:109:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyFarmbot.g:109:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyFarmbot.g:110:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyFarmbot.g:116:1: ruleInstruction returns [EObject current=null] : (this_SequenceInstruction_0= ruleSequenceInstruction | this_Sequence_1= ruleSequence | this_Command_2= ruleCommand ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceInstruction_0 = null;

        EObject this_Sequence_1 = null;

        EObject this_Command_2 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:122:2: ( (this_SequenceInstruction_0= ruleSequenceInstruction | this_Sequence_1= ruleSequence | this_Command_2= ruleCommand ) )
            // InternalMyFarmbot.g:123:2: (this_SequenceInstruction_0= ruleSequenceInstruction | this_Sequence_1= ruleSequence | this_Command_2= ruleCommand )
            {
            // InternalMyFarmbot.g:123:2: (this_SequenceInstruction_0= ruleSequenceInstruction | this_Sequence_1= ruleSequence | this_Command_2= ruleCommand )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 17:
            case 18:
            case 23:
            case 29:
            case 32:
            case 34:
            case 37:
            case 39:
            case 40:
            case 42:
            case 44:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 45:
            case 53:
            case 54:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyFarmbot.g:124:3: this_SequenceInstruction_0= ruleSequenceInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSequenceInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceInstruction_0=ruleSequenceInstruction();

                    state._fsp--;


                    			current = this_SequenceInstruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFarmbot.g:133:3: this_Sequence_1= ruleSequence
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sequence_1=ruleSequence();

                    state._fsp--;


                    			current = this_Sequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyFarmbot.g:142:3: this_Command_2= ruleCommand
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command_2=ruleCommand();

                    state._fsp--;


                    			current = this_Command_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCommand"
    // InternalMyFarmbot.g:154:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyFarmbot.g:154:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyFarmbot.g:155:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyFarmbot.g:161:1: ruleCommand returns [EObject current=null] : (this_Schedule_0= ruleSchedule | this_ListPeripherals_1= ruleListPeripherals | this_ListSequences_2= ruleListSequences ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Schedule_0 = null;

        EObject this_ListPeripherals_1 = null;

        EObject this_ListSequences_2 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:167:2: ( (this_Schedule_0= ruleSchedule | this_ListPeripherals_1= ruleListPeripherals | this_ListSequences_2= ruleListSequences ) )
            // InternalMyFarmbot.g:168:2: (this_Schedule_0= ruleSchedule | this_ListPeripherals_1= ruleListPeripherals | this_ListSequences_2= ruleListSequences )
            {
            // InternalMyFarmbot.g:168:2: (this_Schedule_0= ruleSchedule | this_ListPeripherals_1= ruleListPeripherals | this_ListSequences_2= ruleListSequences )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt3=1;
                }
                break;
            case 53:
                {
                alt3=2;
                }
                break;
            case 54:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyFarmbot.g:169:3: this_Schedule_0= ruleSchedule
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getScheduleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Schedule_0=ruleSchedule();

                    state._fsp--;


                    			current = this_Schedule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFarmbot.g:178:3: this_ListPeripherals_1= ruleListPeripherals
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getListPeripheralsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListPeripherals_1=ruleListPeripherals();

                    state._fsp--;


                    			current = this_ListPeripherals_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyFarmbot.g:187:3: this_ListSequences_2= ruleListSequences
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getListSequencesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListSequences_2=ruleListSequences();

                    state._fsp--;


                    			current = this_ListSequences_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSequenceCommand"
    // InternalMyFarmbot.g:199:1: entryRuleSequenceCommand returns [EObject current=null] : iv_ruleSequenceCommand= ruleSequenceCommand EOF ;
    public final EObject entryRuleSequenceCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceCommand = null;


        try {
            // InternalMyFarmbot.g:199:56: (iv_ruleSequenceCommand= ruleSequenceCommand EOF )
            // InternalMyFarmbot.g:200:2: iv_ruleSequenceCommand= ruleSequenceCommand EOF
            {
             newCompositeNode(grammarAccess.getSequenceCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceCommand=ruleSequenceCommand();

            state._fsp--;

             current =iv_ruleSequenceCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequenceCommand"


    // $ANTLR start "ruleSequenceCommand"
    // InternalMyFarmbot.g:206:1: ruleSequenceCommand returns [EObject current=null] : (this_TurnOn_0= ruleTurnOn | this_TurnOff_1= ruleTurnOff | this_MoveRelative_2= ruleMoveRelative | this_FindHome_3= ruleFindHome | this_MoveAbsolute_4= ruleMoveAbsolute | this_ExecuteSequence_5= ruleExecuteSequence | this_Wait_6= ruleWait | this_IsToolOn_7= ruleIsToolOn | this_SendMessage_8= ruleSendMessage | this_RunFarmware_9= ruleRunFarmware | this_TakePhoto_10= ruleTakePhoto ) ;
    public final EObject ruleSequenceCommand() throws RecognitionException {
        EObject current = null;

        EObject this_TurnOn_0 = null;

        EObject this_TurnOff_1 = null;

        EObject this_MoveRelative_2 = null;

        EObject this_FindHome_3 = null;

        EObject this_MoveAbsolute_4 = null;

        EObject this_ExecuteSequence_5 = null;

        EObject this_Wait_6 = null;

        EObject this_IsToolOn_7 = null;

        EObject this_SendMessage_8 = null;

        EObject this_RunFarmware_9 = null;

        EObject this_TakePhoto_10 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:212:2: ( (this_TurnOn_0= ruleTurnOn | this_TurnOff_1= ruleTurnOff | this_MoveRelative_2= ruleMoveRelative | this_FindHome_3= ruleFindHome | this_MoveAbsolute_4= ruleMoveAbsolute | this_ExecuteSequence_5= ruleExecuteSequence | this_Wait_6= ruleWait | this_IsToolOn_7= ruleIsToolOn | this_SendMessage_8= ruleSendMessage | this_RunFarmware_9= ruleRunFarmware | this_TakePhoto_10= ruleTakePhoto ) )
            // InternalMyFarmbot.g:213:2: (this_TurnOn_0= ruleTurnOn | this_TurnOff_1= ruleTurnOff | this_MoveRelative_2= ruleMoveRelative | this_FindHome_3= ruleFindHome | this_MoveAbsolute_4= ruleMoveAbsolute | this_ExecuteSequence_5= ruleExecuteSequence | this_Wait_6= ruleWait | this_IsToolOn_7= ruleIsToolOn | this_SendMessage_8= ruleSendMessage | this_RunFarmware_9= ruleRunFarmware | this_TakePhoto_10= ruleTakePhoto )
            {
            // InternalMyFarmbot.g:213:2: (this_TurnOn_0= ruleTurnOn | this_TurnOff_1= ruleTurnOff | this_MoveRelative_2= ruleMoveRelative | this_FindHome_3= ruleFindHome | this_MoveAbsolute_4= ruleMoveAbsolute | this_ExecuteSequence_5= ruleExecuteSequence | this_Wait_6= ruleWait | this_IsToolOn_7= ruleIsToolOn | this_SendMessage_8= ruleSendMessage | this_RunFarmware_9= ruleRunFarmware | this_TakePhoto_10= ruleTakePhoto )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=6;
                }
                break;
            case 37:
                {
                alt4=7;
                }
                break;
            case 39:
                {
                alt4=8;
                }
                break;
            case 40:
                {
                alt4=9;
                }
                break;
            case 42:
                {
                alt4=10;
                }
                break;
            case 44:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyFarmbot.g:214:3: this_TurnOn_0= ruleTurnOn
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getTurnOnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnOn_0=ruleTurnOn();

                    state._fsp--;


                    			current = this_TurnOn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFarmbot.g:223:3: this_TurnOff_1= ruleTurnOff
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getTurnOffParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnOff_1=ruleTurnOff();

                    state._fsp--;


                    			current = this_TurnOff_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyFarmbot.g:232:3: this_MoveRelative_2= ruleMoveRelative
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getMoveRelativeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveRelative_2=ruleMoveRelative();

                    state._fsp--;


                    			current = this_MoveRelative_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyFarmbot.g:241:3: this_FindHome_3= ruleFindHome
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getFindHomeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindHome_3=ruleFindHome();

                    state._fsp--;


                    			current = this_FindHome_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyFarmbot.g:250:3: this_MoveAbsolute_4= ruleMoveAbsolute
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getMoveAbsoluteParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveAbsolute_4=ruleMoveAbsolute();

                    state._fsp--;


                    			current = this_MoveAbsolute_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyFarmbot.g:259:3: this_ExecuteSequence_5= ruleExecuteSequence
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getExecuteSequenceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecuteSequence_5=ruleExecuteSequence();

                    state._fsp--;


                    			current = this_ExecuteSequence_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyFarmbot.g:268:3: this_Wait_6= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getWaitParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_6=ruleWait();

                    state._fsp--;


                    			current = this_Wait_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyFarmbot.g:277:3: this_IsToolOn_7= ruleIsToolOn
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getIsToolOnParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsToolOn_7=ruleIsToolOn();

                    state._fsp--;


                    			current = this_IsToolOn_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyFarmbot.g:286:3: this_SendMessage_8= ruleSendMessage
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getSendMessageParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendMessage_8=ruleSendMessage();

                    state._fsp--;


                    			current = this_SendMessage_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyFarmbot.g:295:3: this_RunFarmware_9= ruleRunFarmware
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getRunFarmwareParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunFarmware_9=ruleRunFarmware();

                    state._fsp--;


                    			current = this_RunFarmware_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyFarmbot.g:304:3: this_TakePhoto_10= ruleTakePhoto
                    {

                    			newCompositeNode(grammarAccess.getSequenceCommandAccess().getTakePhotoParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TakePhoto_10=ruleTakePhoto();

                    state._fsp--;


                    			current = this_TakePhoto_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceCommand"


    // $ANTLR start "entryRuleSequenceInstruction"
    // InternalMyFarmbot.g:316:1: entryRuleSequenceInstruction returns [EObject current=null] : iv_ruleSequenceInstruction= ruleSequenceInstruction EOF ;
    public final EObject entryRuleSequenceInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceInstruction = null;


        try {
            // InternalMyFarmbot.g:316:60: (iv_ruleSequenceInstruction= ruleSequenceInstruction EOF )
            // InternalMyFarmbot.g:317:2: iv_ruleSequenceInstruction= ruleSequenceInstruction EOF
            {
             newCompositeNode(grammarAccess.getSequenceInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceInstruction=ruleSequenceInstruction();

            state._fsp--;

             current =iv_ruleSequenceInstruction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequenceInstruction"


    // $ANTLR start "ruleSequenceInstruction"
    // InternalMyFarmbot.g:323:1: ruleSequenceInstruction returns [EObject current=null] : (this_If_0= ruleIf | this_SequenceCommand_1= ruleSequenceCommand ) ;
    public final EObject ruleSequenceInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_SequenceCommand_1 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:329:2: ( (this_If_0= ruleIf | this_SequenceCommand_1= ruleSequenceCommand ) )
            // InternalMyFarmbot.g:330:2: (this_If_0= ruleIf | this_SequenceCommand_1= ruleSequenceCommand )
            {
            // InternalMyFarmbot.g:330:2: (this_If_0= ruleIf | this_SequenceCommand_1= ruleSequenceCommand )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==11||(LA5_0>=17 && LA5_0<=18)||LA5_0==23||LA5_0==32||LA5_0==34||LA5_0==37||(LA5_0>=39 && LA5_0<=40)||LA5_0==42||LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyFarmbot.g:331:3: this_If_0= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getSequenceInstructionAccess().getIfParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;


                    			current = this_If_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFarmbot.g:340:3: this_SequenceCommand_1= ruleSequenceCommand
                    {

                    			newCompositeNode(grammarAccess.getSequenceInstructionAccess().getSequenceCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceCommand_1=ruleSequenceCommand();

                    state._fsp--;


                    			current = this_SequenceCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceInstruction"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalMyFarmbot.g:352:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalMyFarmbot.g:352:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalMyFarmbot.g:353:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalMyFarmbot.g:359:1: ruleBooleanExpression returns [EObject current=null] : (this_IsToolOn_0= ruleIsToolOn | this_IsEqualTo_1= ruleIsEqualTo | this_IsNotEqualTo_2= ruleIsNotEqualTo | this_IsGreaterThan_3= ruleIsGreaterThan | this_IsLowerThan_4= ruleIsLowerThan ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IsToolOn_0 = null;

        EObject this_IsEqualTo_1 = null;

        EObject this_IsNotEqualTo_2 = null;

        EObject this_IsGreaterThan_3 = null;

        EObject this_IsLowerThan_4 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:365:2: ( (this_IsToolOn_0= ruleIsToolOn | this_IsEqualTo_1= ruleIsEqualTo | this_IsNotEqualTo_2= ruleIsNotEqualTo | this_IsGreaterThan_3= ruleIsGreaterThan | this_IsLowerThan_4= ruleIsLowerThan ) )
            // InternalMyFarmbot.g:366:2: (this_IsToolOn_0= ruleIsToolOn | this_IsEqualTo_1= ruleIsEqualTo | this_IsNotEqualTo_2= ruleIsNotEqualTo | this_IsGreaterThan_3= ruleIsGreaterThan | this_IsLowerThan_4= ruleIsLowerThan )
            {
            // InternalMyFarmbot.g:366:2: (this_IsToolOn_0= ruleIsToolOn | this_IsEqualTo_1= ruleIsEqualTo | this_IsNotEqualTo_2= ruleIsNotEqualTo | this_IsGreaterThan_3= ruleIsGreaterThan | this_IsLowerThan_4= ruleIsLowerThan )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    alt6=3;
                    }
                    break;
                case 60:
                    {
                    alt6=5;
                    }
                    break;
                case 55:
                    {
                    alt6=2;
                    }
                    break;
                case 58:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyFarmbot.g:367:3: this_IsToolOn_0= ruleIsToolOn
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getIsToolOnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsToolOn_0=ruleIsToolOn();

                    state._fsp--;


                    			current = this_IsToolOn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFarmbot.g:376:3: this_IsEqualTo_1= ruleIsEqualTo
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getIsEqualToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsEqualTo_1=ruleIsEqualTo();

                    state._fsp--;


                    			current = this_IsEqualTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyFarmbot.g:385:3: this_IsNotEqualTo_2= ruleIsNotEqualTo
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getIsNotEqualToParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsNotEqualTo_2=ruleIsNotEqualTo();

                    state._fsp--;


                    			current = this_IsNotEqualTo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyFarmbot.g:394:3: this_IsGreaterThan_3= ruleIsGreaterThan
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getIsGreaterThanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsGreaterThan_3=ruleIsGreaterThan();

                    state._fsp--;


                    			current = this_IsGreaterThan_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyFarmbot.g:403:3: this_IsLowerThan_4= ruleIsLowerThan
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getIsLowerThanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsLowerThan_4=ruleIsLowerThan();

                    state._fsp--;


                    			current = this_IsLowerThan_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleTurnOn"
    // InternalMyFarmbot.g:415:1: entryRuleTurnOn returns [EObject current=null] : iv_ruleTurnOn= ruleTurnOn EOF ;
    public final EObject entryRuleTurnOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnOn = null;


        try {
            // InternalMyFarmbot.g:415:47: (iv_ruleTurnOn= ruleTurnOn EOF )
            // InternalMyFarmbot.g:416:2: iv_ruleTurnOn= ruleTurnOn EOF
            {
             newCompositeNode(grammarAccess.getTurnOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnOn=ruleTurnOn();

            state._fsp--;

             current =iv_ruleTurnOn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnOn"


    // $ANTLR start "ruleTurnOn"
    // InternalMyFarmbot.g:422:1: ruleTurnOn returns [EObject current=null] : ( () otherlv_1= 'turnOn(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleTurnOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_pin_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_mode_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:428:2: ( ( () otherlv_1= 'turnOn(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // InternalMyFarmbot.g:429:2: ( () otherlv_1= 'turnOn(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // InternalMyFarmbot.g:429:2: ( () otherlv_1= 'turnOn(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // InternalMyFarmbot.g:430:3: () otherlv_1= 'turnOn(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            // InternalMyFarmbot.g:430:3: ()
            // InternalMyFarmbot.g:431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnOnAccess().getTurnOnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnOnAccess().getTurnOnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnOnAccess().getPinKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTurnOnAccess().getEqualsSignKeyword_3());
            		
            // InternalMyFarmbot.g:449:3: ( (lv_pin_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:450:4: (lv_pin_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:450:4: (lv_pin_4_0= RULE_INT )
            // InternalMyFarmbot.g:451:5: lv_pin_4_0= RULE_INT
            {
            lv_pin_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_pin_4_0, grammarAccess.getTurnOnAccess().getPinINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnOnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pin",
            						lv_pin_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getTurnOnAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getTurnOnAccess().getModeKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getTurnOnAccess().getEqualsSignKeyword_7());
            		
            // InternalMyFarmbot.g:479:3: ( (lv_mode_8_0= RULE_STRING ) )
            // InternalMyFarmbot.g:480:4: (lv_mode_8_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:480:4: (lv_mode_8_0= RULE_STRING )
            // InternalMyFarmbot.g:481:5: lv_mode_8_0= RULE_STRING
            {
            lv_mode_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_mode_8_0, grammarAccess.getTurnOnAccess().getModeSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnOnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mode",
            						lv_mode_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTurnOnAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnOn"


    // $ANTLR start "entryRuleTurnOff"
    // InternalMyFarmbot.g:505:1: entryRuleTurnOff returns [EObject current=null] : iv_ruleTurnOff= ruleTurnOff EOF ;
    public final EObject entryRuleTurnOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnOff = null;


        try {
            // InternalMyFarmbot.g:505:48: (iv_ruleTurnOff= ruleTurnOff EOF )
            // InternalMyFarmbot.g:506:2: iv_ruleTurnOff= ruleTurnOff EOF
            {
             newCompositeNode(grammarAccess.getTurnOffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnOff=ruleTurnOff();

            state._fsp--;

             current =iv_ruleTurnOff; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnOff"


    // $ANTLR start "ruleTurnOff"
    // InternalMyFarmbot.g:512:1: ruleTurnOff returns [EObject current=null] : ( () otherlv_1= 'turnOff(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleTurnOff() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_pin_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_mode_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:518:2: ( ( () otherlv_1= 'turnOff(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // InternalMyFarmbot.g:519:2: ( () otherlv_1= 'turnOff(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // InternalMyFarmbot.g:519:2: ( () otherlv_1= 'turnOff(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // InternalMyFarmbot.g:520:3: () otherlv_1= 'turnOff(' otherlv_2= 'pin' otherlv_3= '=' ( (lv_pin_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'mode' otherlv_7= '=' ( (lv_mode_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            // InternalMyFarmbot.g:520:3: ()
            // InternalMyFarmbot.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnOffAccess().getTurnOffAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnOffAccess().getTurnOffKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnOffAccess().getPinKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTurnOffAccess().getEqualsSignKeyword_3());
            		
            // InternalMyFarmbot.g:539:3: ( (lv_pin_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:540:4: (lv_pin_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:540:4: (lv_pin_4_0= RULE_INT )
            // InternalMyFarmbot.g:541:5: lv_pin_4_0= RULE_INT
            {
            lv_pin_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_pin_4_0, grammarAccess.getTurnOffAccess().getPinINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnOffRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pin",
            						lv_pin_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getTurnOffAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getTurnOffAccess().getModeKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getTurnOffAccess().getEqualsSignKeyword_7());
            		
            // InternalMyFarmbot.g:569:3: ( (lv_mode_8_0= RULE_STRING ) )
            // InternalMyFarmbot.g:570:4: (lv_mode_8_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:570:4: (lv_mode_8_0= RULE_STRING )
            // InternalMyFarmbot.g:571:5: lv_mode_8_0= RULE_STRING
            {
            lv_mode_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_mode_8_0, grammarAccess.getTurnOffAccess().getModeSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnOffRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mode",
            						lv_mode_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTurnOffAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnOff"


    // $ANTLR start "entryRuleMoveRelative"
    // InternalMyFarmbot.g:595:1: entryRuleMoveRelative returns [EObject current=null] : iv_ruleMoveRelative= ruleMoveRelative EOF ;
    public final EObject entryRuleMoveRelative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveRelative = null;


        try {
            // InternalMyFarmbot.g:595:53: (iv_ruleMoveRelative= ruleMoveRelative EOF )
            // InternalMyFarmbot.g:596:2: iv_ruleMoveRelative= ruleMoveRelative EOF
            {
             newCompositeNode(grammarAccess.getMoveRelativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveRelative=ruleMoveRelative();

            state._fsp--;

             current =iv_ruleMoveRelative; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMoveRelative"


    // $ANTLR start "ruleMoveRelative"
    // InternalMyFarmbot.g:602:1: ruleMoveRelative returns [EObject current=null] : ( () otherlv_1= 'moveRelative(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z' otherlv_11= '=' ( (lv_z_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'speed' otherlv_15= '=' ( (lv_speed_16_0= ruleEDouble ) ) otherlv_17= ')' ) ;
    public final EObject ruleMoveRelative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_y_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_z_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_speed_16_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:608:2: ( ( () otherlv_1= 'moveRelative(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z' otherlv_11= '=' ( (lv_z_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'speed' otherlv_15= '=' ( (lv_speed_16_0= ruleEDouble ) ) otherlv_17= ')' ) )
            // InternalMyFarmbot.g:609:2: ( () otherlv_1= 'moveRelative(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z' otherlv_11= '=' ( (lv_z_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'speed' otherlv_15= '=' ( (lv_speed_16_0= ruleEDouble ) ) otherlv_17= ')' )
            {
            // InternalMyFarmbot.g:609:2: ( () otherlv_1= 'moveRelative(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z' otherlv_11= '=' ( (lv_z_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'speed' otherlv_15= '=' ( (lv_speed_16_0= ruleEDouble ) ) otherlv_17= ')' )
            // InternalMyFarmbot.g:610:3: () otherlv_1= 'moveRelative(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z' otherlv_11= '=' ( (lv_z_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'speed' otherlv_15= '=' ( (lv_speed_16_0= ruleEDouble ) ) otherlv_17= ')'
            {
            // InternalMyFarmbot.g:610:3: ()
            // InternalMyFarmbot.g:611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveRelativeAccess().getMoveRelativeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveRelativeAccess().getMoveRelativeKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveRelativeAccess().getXKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveRelativeAccess().getEqualsSignKeyword_3());
            		
            // InternalMyFarmbot.g:629:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:630:4: (lv_x_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:630:4: (lv_x_4_0= RULE_INT )
            // InternalMyFarmbot.g:631:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_x_4_0, grammarAccess.getMoveRelativeAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRelativeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveRelativeAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getMoveRelativeAccess().getYKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getMoveRelativeAccess().getEqualsSignKeyword_7());
            		
            // InternalMyFarmbot.g:659:3: ( (lv_y_8_0= RULE_INT ) )
            // InternalMyFarmbot.g:660:4: (lv_y_8_0= RULE_INT )
            {
            // InternalMyFarmbot.g:660:4: (lv_y_8_0= RULE_INT )
            // InternalMyFarmbot.g:661:5: lv_y_8_0= RULE_INT
            {
            lv_y_8_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_y_8_0, grammarAccess.getMoveRelativeAccess().getYINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRelativeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getMoveRelativeAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getMoveRelativeAccess().getZKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getMoveRelativeAccess().getEqualsSignKeyword_11());
            		
            // InternalMyFarmbot.g:689:3: ( (lv_z_12_0= RULE_INT ) )
            // InternalMyFarmbot.g:690:4: (lv_z_12_0= RULE_INT )
            {
            // InternalMyFarmbot.g:690:4: (lv_z_12_0= RULE_INT )
            // InternalMyFarmbot.g:691:5: lv_z_12_0= RULE_INT
            {
            lv_z_12_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_z_12_0, grammarAccess.getMoveRelativeAccess().getZINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRelativeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"z",
            						lv_z_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getMoveRelativeAccess().getCommaKeyword_13());
            		
            otherlv_14=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getMoveRelativeAccess().getSpeedKeyword_14());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getMoveRelativeAccess().getEqualsSignKeyword_15());
            		
            // InternalMyFarmbot.g:719:3: ( (lv_speed_16_0= ruleEDouble ) )
            // InternalMyFarmbot.g:720:4: (lv_speed_16_0= ruleEDouble )
            {
            // InternalMyFarmbot.g:720:4: (lv_speed_16_0= ruleEDouble )
            // InternalMyFarmbot.g:721:5: lv_speed_16_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMoveRelativeAccess().getSpeedEDoubleParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_10);
            lv_speed_16_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRelativeRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_16_0,
            						"xtext.farmbot.MyFarmbot.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getMoveRelativeAccess().getRightParenthesisKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveRelative"


    // $ANTLR start "entryRuleFindHome"
    // InternalMyFarmbot.g:746:1: entryRuleFindHome returns [EObject current=null] : iv_ruleFindHome= ruleFindHome EOF ;
    public final EObject entryRuleFindHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindHome = null;


        try {
            // InternalMyFarmbot.g:746:49: (iv_ruleFindHome= ruleFindHome EOF )
            // InternalMyFarmbot.g:747:2: iv_ruleFindHome= ruleFindHome EOF
            {
             newCompositeNode(grammarAccess.getFindHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindHome=ruleFindHome();

            state._fsp--;

             current =iv_ruleFindHome; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFindHome"


    // $ANTLR start "ruleFindHome"
    // InternalMyFarmbot.g:753:1: ruleFindHome returns [EObject current=null] : ( () otherlv_1= 'findHome(' otherlv_2= 'findX' otherlv_3= '=' ( (lv_findX_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'findY' otherlv_7= '=' ( (lv_findY_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'findZ' otherlv_11= '=' ( (lv_findZ_12_0= ruleEBoolean ) ) otherlv_13= ')' ) ;
    public final EObject ruleFindHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_findX_4_0 = null;

        AntlrDatatypeRuleToken lv_findY_8_0 = null;

        AntlrDatatypeRuleToken lv_findZ_12_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:759:2: ( ( () otherlv_1= 'findHome(' otherlv_2= 'findX' otherlv_3= '=' ( (lv_findX_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'findY' otherlv_7= '=' ( (lv_findY_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'findZ' otherlv_11= '=' ( (lv_findZ_12_0= ruleEBoolean ) ) otherlv_13= ')' ) )
            // InternalMyFarmbot.g:760:2: ( () otherlv_1= 'findHome(' otherlv_2= 'findX' otherlv_3= '=' ( (lv_findX_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'findY' otherlv_7= '=' ( (lv_findY_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'findZ' otherlv_11= '=' ( (lv_findZ_12_0= ruleEBoolean ) ) otherlv_13= ')' )
            {
            // InternalMyFarmbot.g:760:2: ( () otherlv_1= 'findHome(' otherlv_2= 'findX' otherlv_3= '=' ( (lv_findX_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'findY' otherlv_7= '=' ( (lv_findY_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'findZ' otherlv_11= '=' ( (lv_findZ_12_0= ruleEBoolean ) ) otherlv_13= ')' )
            // InternalMyFarmbot.g:761:3: () otherlv_1= 'findHome(' otherlv_2= 'findX' otherlv_3= '=' ( (lv_findX_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'findY' otherlv_7= '=' ( (lv_findY_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'findZ' otherlv_11= '=' ( (lv_findZ_12_0= ruleEBoolean ) ) otherlv_13= ')'
            {
            // InternalMyFarmbot.g:761:3: ()
            // InternalMyFarmbot.g:762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFindHomeAccess().getFindHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getFindHomeAccess().getFindHomeKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFindHomeAccess().getFindXKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getFindHomeAccess().getEqualsSignKeyword_3());
            		
            // InternalMyFarmbot.g:780:3: ( (lv_findX_4_0= ruleEBoolean ) )
            // InternalMyFarmbot.g:781:4: (lv_findX_4_0= ruleEBoolean )
            {
            // InternalMyFarmbot.g:781:4: (lv_findX_4_0= ruleEBoolean )
            // InternalMyFarmbot.g:782:5: lv_findX_4_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getFindHomeAccess().getFindXEBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_findX_4_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindHomeRule());
            					}
            					set(
            						current,
            						"findX",
            						lv_findX_4_0,
            						"xtext.farmbot.MyFarmbot.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getFindHomeAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getFindHomeAccess().getFindYKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getFindHomeAccess().getEqualsSignKeyword_7());
            		
            // InternalMyFarmbot.g:811:3: ( (lv_findY_8_0= ruleEBoolean ) )
            // InternalMyFarmbot.g:812:4: (lv_findY_8_0= ruleEBoolean )
            {
            // InternalMyFarmbot.g:812:4: (lv_findY_8_0= ruleEBoolean )
            // InternalMyFarmbot.g:813:5: lv_findY_8_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getFindHomeAccess().getFindYEBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_findY_8_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindHomeRule());
            					}
            					set(
            						current,
            						"findY",
            						lv_findY_8_0,
            						"xtext.farmbot.MyFarmbot.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getFindHomeAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getFindHomeAccess().getFindZKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getFindHomeAccess().getEqualsSignKeyword_11());
            		
            // InternalMyFarmbot.g:842:3: ( (lv_findZ_12_0= ruleEBoolean ) )
            // InternalMyFarmbot.g:843:4: (lv_findZ_12_0= ruleEBoolean )
            {
            // InternalMyFarmbot.g:843:4: (lv_findZ_12_0= ruleEBoolean )
            // InternalMyFarmbot.g:844:5: lv_findZ_12_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getFindHomeAccess().getFindZEBooleanParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_findZ_12_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindHomeRule());
            					}
            					set(
            						current,
            						"findZ",
            						lv_findZ_12_0,
            						"xtext.farmbot.MyFarmbot.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFindHomeAccess().getRightParenthesisKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindHome"


    // $ANTLR start "entryRuleSequence"
    // InternalMyFarmbot.g:869:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalMyFarmbot.g:869:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalMyFarmbot.g:870:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalMyFarmbot.g:876:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_sequenceInstructions_3_0= ruleSequenceInstruction ) )* otherlv_4= 'end' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_sequenceInstructions_3_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:882:2: ( ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_sequenceInstructions_3_0= ruleSequenceInstruction ) )* otherlv_4= 'end' ) )
            // InternalMyFarmbot.g:883:2: ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_sequenceInstructions_3_0= ruleSequenceInstruction ) )* otherlv_4= 'end' )
            {
            // InternalMyFarmbot.g:883:2: ( () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_sequenceInstructions_3_0= ruleSequenceInstruction ) )* otherlv_4= 'end' )
            // InternalMyFarmbot.g:884:3: () otherlv_1= 'sequence' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_sequenceInstructions_3_0= ruleSequenceInstruction ) )* otherlv_4= 'end'
            {
            // InternalMyFarmbot.g:884:3: ()
            // InternalMyFarmbot.g:885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceAccess().getSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSequenceKeyword_1());
            		
            // InternalMyFarmbot.g:895:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalMyFarmbot.g:896:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:896:4: (lv_name_2_0= RULE_STRING )
            // InternalMyFarmbot.g:897:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSequenceAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyFarmbot.g:913:3: ( (lv_sequenceInstructions_3_0= ruleSequenceInstruction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||(LA7_0>=17 && LA7_0<=18)||LA7_0==23||LA7_0==29||LA7_0==32||LA7_0==34||LA7_0==37||(LA7_0>=39 && LA7_0<=40)||LA7_0==42||LA7_0==44) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFarmbot.g:914:4: (lv_sequenceInstructions_3_0= ruleSequenceInstruction )
            	    {
            	    // InternalMyFarmbot.g:914:4: (lv_sequenceInstructions_3_0= ruleSequenceInstruction )
            	    // InternalMyFarmbot.g:915:5: lv_sequenceInstructions_3_0= ruleSequenceInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getSequenceAccess().getSequenceInstructionsSequenceInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_sequenceInstructions_3_0=ruleSequenceInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sequenceInstructions",
            	    						lv_sequenceInstructions_3_0,
            	    						"xtext.farmbot.MyFarmbot.SequenceInstruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleIf"
    // InternalMyFarmbot.g:940:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyFarmbot.g:940:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyFarmbot.g:941:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyFarmbot.g:947:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_booleanExpression_2_0= ruleBooleanExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExecuteSequence ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) ) )? otherlv_7= 'end' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_booleanExpression_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:953:2: ( ( () otherlv_1= 'if' ( (lv_booleanExpression_2_0= ruleBooleanExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExecuteSequence ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) ) )? otherlv_7= 'end' ) )
            // InternalMyFarmbot.g:954:2: ( () otherlv_1= 'if' ( (lv_booleanExpression_2_0= ruleBooleanExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExecuteSequence ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) ) )? otherlv_7= 'end' )
            {
            // InternalMyFarmbot.g:954:2: ( () otherlv_1= 'if' ( (lv_booleanExpression_2_0= ruleBooleanExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExecuteSequence ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) ) )? otherlv_7= 'end' )
            // InternalMyFarmbot.g:955:3: () otherlv_1= 'if' ( (lv_booleanExpression_2_0= ruleBooleanExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExecuteSequence ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) ) )? otherlv_7= 'end'
            {
            // InternalMyFarmbot.g:955:3: ()
            // InternalMyFarmbot.g:956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalMyFarmbot.g:966:3: ( (lv_booleanExpression_2_0= ruleBooleanExpression ) )
            // InternalMyFarmbot.g:967:4: (lv_booleanExpression_2_0= ruleBooleanExpression )
            {
            // InternalMyFarmbot.g:967:4: (lv_booleanExpression_2_0= ruleBooleanExpression )
            // InternalMyFarmbot.g:968:5: lv_booleanExpression_2_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getBooleanExpressionBooleanExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_booleanExpression_2_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"booleanExpression",
            						lv_booleanExpression_2_0,
            						"xtext.farmbot.MyFarmbot.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getThenKeyword_3());
            		
            // InternalMyFarmbot.g:989:3: ( (lv_then_4_0= ruleExecuteSequence ) )
            // InternalMyFarmbot.g:990:4: (lv_then_4_0= ruleExecuteSequence )
            {
            // InternalMyFarmbot.g:990:4: (lv_then_4_0= ruleExecuteSequence )
            // InternalMyFarmbot.g:991:5: lv_then_4_0= ruleExecuteSequence
            {

            					newCompositeNode(grammarAccess.getIfAccess().getThenExecuteSequenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_then_4_0=ruleExecuteSequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_4_0,
            						"xtext.farmbot.MyFarmbot.ExecuteSequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFarmbot.g:1008:3: (otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyFarmbot.g:1009:4: otherlv_5= 'else' ( (lv_else_6_0= ruleExecuteSequence ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                    			
                    // InternalMyFarmbot.g:1013:4: ( (lv_else_6_0= ruleExecuteSequence ) )
                    // InternalMyFarmbot.g:1014:5: (lv_else_6_0= ruleExecuteSequence )
                    {
                    // InternalMyFarmbot.g:1014:5: (lv_else_6_0= ruleExecuteSequence )
                    // InternalMyFarmbot.g:1015:6: lv_else_6_0= ruleExecuteSequence
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getElseExecuteSequenceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_else_6_0=ruleExecuteSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
                    						}
                    						set(
                    							current,
                    							"else",
                    							lv_else_6_0,
                    							"xtext.farmbot.MyFarmbot.ExecuteSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleMoveAbsolute"
    // InternalMyFarmbot.g:1041:1: entryRuleMoveAbsolute returns [EObject current=null] : iv_ruleMoveAbsolute= ruleMoveAbsolute EOF ;
    public final EObject entryRuleMoveAbsolute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAbsolute = null;


        try {
            // InternalMyFarmbot.g:1041:53: (iv_ruleMoveAbsolute= ruleMoveAbsolute EOF )
            // InternalMyFarmbot.g:1042:2: iv_ruleMoveAbsolute= ruleMoveAbsolute EOF
            {
             newCompositeNode(grammarAccess.getMoveAbsoluteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveAbsolute=ruleMoveAbsolute();

            state._fsp--;

             current =iv_ruleMoveAbsolute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMoveAbsolute"


    // $ANTLR start "ruleMoveAbsolute"
    // InternalMyFarmbot.g:1048:1: ruleMoveAbsolute returns [EObject current=null] : ( () otherlv_1= 'moveAbsolute(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z=' ( (lv_z_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'speed' otherlv_14= '=' ( (lv_speed_15_0= ruleEDouble ) ) otherlv_16= ')' ) ;
    public final EObject ruleMoveAbsolute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_y_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_z_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_speed_15_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:1054:2: ( ( () otherlv_1= 'moveAbsolute(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z=' ( (lv_z_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'speed' otherlv_14= '=' ( (lv_speed_15_0= ruleEDouble ) ) otherlv_16= ')' ) )
            // InternalMyFarmbot.g:1055:2: ( () otherlv_1= 'moveAbsolute(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z=' ( (lv_z_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'speed' otherlv_14= '=' ( (lv_speed_15_0= ruleEDouble ) ) otherlv_16= ')' )
            {
            // InternalMyFarmbot.g:1055:2: ( () otherlv_1= 'moveAbsolute(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z=' ( (lv_z_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'speed' otherlv_14= '=' ( (lv_speed_15_0= ruleEDouble ) ) otherlv_16= ')' )
            // InternalMyFarmbot.g:1056:3: () otherlv_1= 'moveAbsolute(' otherlv_2= 'x' otherlv_3= '=' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'y' otherlv_7= '=' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'z=' ( (lv_z_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'speed' otherlv_14= '=' ( (lv_speed_15_0= ruleEDouble ) ) otherlv_16= ')'
            {
            // InternalMyFarmbot.g:1056:3: ()
            // InternalMyFarmbot.g:1057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAbsoluteAccess().getMoveAbsoluteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAbsoluteAccess().getMoveAbsoluteKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAbsoluteAccess().getXKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveAbsoluteAccess().getEqualsSignKeyword_3());
            		
            // InternalMyFarmbot.g:1075:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:1076:4: (lv_x_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1076:4: (lv_x_4_0= RULE_INT )
            // InternalMyFarmbot.g:1077:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_x_4_0, grammarAccess.getMoveAbsoluteAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveAbsoluteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveAbsoluteAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getMoveAbsoluteAccess().getYKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getMoveAbsoluteAccess().getEqualsSignKeyword_7());
            		
            // InternalMyFarmbot.g:1105:3: ( (lv_y_8_0= RULE_INT ) )
            // InternalMyFarmbot.g:1106:4: (lv_y_8_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1106:4: (lv_y_8_0= RULE_INT )
            // InternalMyFarmbot.g:1107:5: lv_y_8_0= RULE_INT
            {
            lv_y_8_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_y_8_0, grammarAccess.getMoveAbsoluteAccess().getYINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveAbsoluteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getMoveAbsoluteAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getMoveAbsoluteAccess().getZKeyword_10());
            		
            // InternalMyFarmbot.g:1131:3: ( (lv_z_11_0= RULE_INT ) )
            // InternalMyFarmbot.g:1132:4: (lv_z_11_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1132:4: (lv_z_11_0= RULE_INT )
            // InternalMyFarmbot.g:1133:5: lv_z_11_0= RULE_INT
            {
            lv_z_11_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_z_11_0, grammarAccess.getMoveAbsoluteAccess().getZINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveAbsoluteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"z",
            						lv_z_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getMoveAbsoluteAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getMoveAbsoluteAccess().getSpeedKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getMoveAbsoluteAccess().getEqualsSignKeyword_14());
            		
            // InternalMyFarmbot.g:1161:3: ( (lv_speed_15_0= ruleEDouble ) )
            // InternalMyFarmbot.g:1162:4: (lv_speed_15_0= ruleEDouble )
            {
            // InternalMyFarmbot.g:1162:4: (lv_speed_15_0= ruleEDouble )
            // InternalMyFarmbot.g:1163:5: lv_speed_15_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMoveAbsoluteAccess().getSpeedEDoubleParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_10);
            lv_speed_15_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveAbsoluteRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_15_0,
            						"xtext.farmbot.MyFarmbot.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMoveAbsoluteAccess().getRightParenthesisKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveAbsolute"


    // $ANTLR start "entryRuleExecuteSequence"
    // InternalMyFarmbot.g:1188:1: entryRuleExecuteSequence returns [EObject current=null] : iv_ruleExecuteSequence= ruleExecuteSequence EOF ;
    public final EObject entryRuleExecuteSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteSequence = null;


        try {
            // InternalMyFarmbot.g:1188:56: (iv_ruleExecuteSequence= ruleExecuteSequence EOF )
            // InternalMyFarmbot.g:1189:2: iv_ruleExecuteSequence= ruleExecuteSequence EOF
            {
             newCompositeNode(grammarAccess.getExecuteSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecuteSequence=ruleExecuteSequence();

            state._fsp--;

             current =iv_ruleExecuteSequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExecuteSequence"


    // $ANTLR start "ruleExecuteSequence"
    // InternalMyFarmbot.g:1195:1: ruleExecuteSequence returns [EObject current=null] : ( () otherlv_1= 'executeSequence' otherlv_2= '(' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleExecuteSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1201:2: ( ( () otherlv_1= 'executeSequence' otherlv_2= '(' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // InternalMyFarmbot.g:1202:2: ( () otherlv_1= 'executeSequence' otherlv_2= '(' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // InternalMyFarmbot.g:1202:2: ( () otherlv_1= 'executeSequence' otherlv_2= '(' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalMyFarmbot.g:1203:3: () otherlv_1= 'executeSequence' otherlv_2= '(' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            // InternalMyFarmbot.g:1203:3: ()
            // InternalMyFarmbot.g:1204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecuteSequenceAccess().getExecuteSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteSequenceAccess().getExecuteSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getExecuteSequenceAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getExecuteSequenceAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getExecuteSequenceAccess().getEqualsSignKeyword_4());
            		
            // InternalMyFarmbot.g:1226:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalMyFarmbot.g:1227:4: (lv_id_5_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1227:4: (lv_id_5_0= RULE_INT )
            // InternalMyFarmbot.g:1228:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_id_5_0, grammarAccess.getExecuteSequenceAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExecuteSequenceAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecuteSequence"


    // $ANTLR start "entryRuleWait"
    // InternalMyFarmbot.g:1252:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMyFarmbot.g:1252:45: (iv_ruleWait= ruleWait EOF )
            // InternalMyFarmbot.g:1253:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMyFarmbot.g:1259:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'wait' otherlv_2= '(' otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEDouble ) ) otherlv_6= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:1265:2: ( ( () otherlv_1= 'wait' otherlv_2= '(' otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEDouble ) ) otherlv_6= ')' ) )
            // InternalMyFarmbot.g:1266:2: ( () otherlv_1= 'wait' otherlv_2= '(' otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEDouble ) ) otherlv_6= ')' )
            {
            // InternalMyFarmbot.g:1266:2: ( () otherlv_1= 'wait' otherlv_2= '(' otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEDouble ) ) otherlv_6= ')' )
            // InternalMyFarmbot.g:1267:3: () otherlv_1= 'wait' otherlv_2= '(' otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEDouble ) ) otherlv_6= ')'
            {
            // InternalMyFarmbot.g:1267:3: ()
            // InternalMyFarmbot.g:1268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getDurationKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getWaitAccess().getEqualsSignKeyword_4());
            		
            // InternalMyFarmbot.g:1290:3: ( (lv_duration_5_0= ruleEDouble ) )
            // InternalMyFarmbot.g:1291:4: (lv_duration_5_0= ruleEDouble )
            {
            // InternalMyFarmbot.g:1291:4: (lv_duration_5_0= ruleEDouble )
            // InternalMyFarmbot.g:1292:5: lv_duration_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getDurationEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_duration_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"xtext.farmbot.MyFarmbot.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWaitAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleIsToolOn"
    // InternalMyFarmbot.g:1317:1: entryRuleIsToolOn returns [EObject current=null] : iv_ruleIsToolOn= ruleIsToolOn EOF ;
    public final EObject entryRuleIsToolOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsToolOn = null;


        try {
            // InternalMyFarmbot.g:1317:49: (iv_ruleIsToolOn= ruleIsToolOn EOF )
            // InternalMyFarmbot.g:1318:2: iv_ruleIsToolOn= ruleIsToolOn EOF
            {
             newCompositeNode(grammarAccess.getIsToolOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsToolOn=ruleIsToolOn();

            state._fsp--;

             current =iv_ruleIsToolOn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsToolOn"


    // $ANTLR start "ruleIsToolOn"
    // InternalMyFarmbot.g:1324:1: ruleIsToolOn returns [EObject current=null] : ( () otherlv_1= 'isToolOn' otherlv_2= '(' otherlv_3= 'pin' otherlv_4= '=' ( (lv_pin_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleIsToolOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pin_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1330:2: ( ( () otherlv_1= 'isToolOn' otherlv_2= '(' otherlv_3= 'pin' otherlv_4= '=' ( (lv_pin_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // InternalMyFarmbot.g:1331:2: ( () otherlv_1= 'isToolOn' otherlv_2= '(' otherlv_3= 'pin' otherlv_4= '=' ( (lv_pin_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // InternalMyFarmbot.g:1331:2: ( () otherlv_1= 'isToolOn' otherlv_2= '(' otherlv_3= 'pin' otherlv_4= '=' ( (lv_pin_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalMyFarmbot.g:1332:3: () otherlv_1= 'isToolOn' otherlv_2= '(' otherlv_3= 'pin' otherlv_4= '=' ( (lv_pin_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            // InternalMyFarmbot.g:1332:3: ()
            // InternalMyFarmbot.g:1333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsToolOnAccess().getIsToolOnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getIsToolOnAccess().getIsToolOnKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIsToolOnAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getIsToolOnAccess().getPinKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getIsToolOnAccess().getEqualsSignKeyword_4());
            		
            // InternalMyFarmbot.g:1355:3: ( (lv_pin_5_0= RULE_INT ) )
            // InternalMyFarmbot.g:1356:4: (lv_pin_5_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1356:4: (lv_pin_5_0= RULE_INT )
            // InternalMyFarmbot.g:1357:5: lv_pin_5_0= RULE_INT
            {
            lv_pin_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_pin_5_0, grammarAccess.getIsToolOnAccess().getPinINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsToolOnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pin",
            						lv_pin_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIsToolOnAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsToolOn"


    // $ANTLR start "entryRuleSendMessage"
    // InternalMyFarmbot.g:1381:1: entryRuleSendMessage returns [EObject current=null] : iv_ruleSendMessage= ruleSendMessage EOF ;
    public final EObject entryRuleSendMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessage = null;


        try {
            // InternalMyFarmbot.g:1381:52: (iv_ruleSendMessage= ruleSendMessage EOF )
            // InternalMyFarmbot.g:1382:2: iv_ruleSendMessage= ruleSendMessage EOF
            {
             newCompositeNode(grammarAccess.getSendMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendMessage=ruleSendMessage();

            state._fsp--;

             current =iv_ruleSendMessage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSendMessage"


    // $ANTLR start "ruleSendMessage"
    // InternalMyFarmbot.g:1388:1: ruleSendMessage returns [EObject current=null] : ( () otherlv_1= 'sendMessage' otherlv_2= '(' otherlv_3= 'message' otherlv_4= '=' ( (lv_message_5_0= RULE_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleSendMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_message_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1394:2: ( ( () otherlv_1= 'sendMessage' otherlv_2= '(' otherlv_3= 'message' otherlv_4= '=' ( (lv_message_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            // InternalMyFarmbot.g:1395:2: ( () otherlv_1= 'sendMessage' otherlv_2= '(' otherlv_3= 'message' otherlv_4= '=' ( (lv_message_5_0= RULE_STRING ) ) otherlv_6= ')' )
            {
            // InternalMyFarmbot.g:1395:2: ( () otherlv_1= 'sendMessage' otherlv_2= '(' otherlv_3= 'message' otherlv_4= '=' ( (lv_message_5_0= RULE_STRING ) ) otherlv_6= ')' )
            // InternalMyFarmbot.g:1396:3: () otherlv_1= 'sendMessage' otherlv_2= '(' otherlv_3= 'message' otherlv_4= '=' ( (lv_message_5_0= RULE_STRING ) ) otherlv_6= ')'
            {
            // InternalMyFarmbot.g:1396:3: ()
            // InternalMyFarmbot.g:1397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendMessageAccess().getSendMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSendMessageAccess().getSendMessageKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSendMessageAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSendMessageAccess().getMessageKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSendMessageAccess().getEqualsSignKeyword_4());
            		
            // InternalMyFarmbot.g:1419:3: ( (lv_message_5_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1420:4: (lv_message_5_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1420:4: (lv_message_5_0= RULE_STRING )
            // InternalMyFarmbot.g:1421:5: lv_message_5_0= RULE_STRING
            {
            lv_message_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_message_5_0, grammarAccess.getSendMessageAccess().getMessageSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSendMessageAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendMessage"


    // $ANTLR start "entryRuleRunFarmware"
    // InternalMyFarmbot.g:1445:1: entryRuleRunFarmware returns [EObject current=null] : iv_ruleRunFarmware= ruleRunFarmware EOF ;
    public final EObject entryRuleRunFarmware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunFarmware = null;


        try {
            // InternalMyFarmbot.g:1445:52: (iv_ruleRunFarmware= ruleRunFarmware EOF )
            // InternalMyFarmbot.g:1446:2: iv_ruleRunFarmware= ruleRunFarmware EOF
            {
             newCompositeNode(grammarAccess.getRunFarmwareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunFarmware=ruleRunFarmware();

            state._fsp--;

             current =iv_ruleRunFarmware; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRunFarmware"


    // $ANTLR start "ruleRunFarmware"
    // InternalMyFarmbot.g:1452:1: ruleRunFarmware returns [EObject current=null] : ( () otherlv_1= 'runFarmware' otherlv_2= '(' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleRunFarmware() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1458:2: ( ( () otherlv_1= 'runFarmware' otherlv_2= '(' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            // InternalMyFarmbot.g:1459:2: ( () otherlv_1= 'runFarmware' otherlv_2= '(' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ')' )
            {
            // InternalMyFarmbot.g:1459:2: ( () otherlv_1= 'runFarmware' otherlv_2= '(' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ')' )
            // InternalMyFarmbot.g:1460:3: () otherlv_1= 'runFarmware' otherlv_2= '(' otherlv_3= 'name' otherlv_4= '=' ( (lv_name_5_0= RULE_STRING ) ) otherlv_6= ')'
            {
            // InternalMyFarmbot.g:1460:3: ()
            // InternalMyFarmbot.g:1461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunFarmwareAccess().getRunFarmwareAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRunFarmwareAccess().getRunFarmwareKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getRunFarmwareAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRunFarmwareAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRunFarmwareAccess().getEqualsSignKeyword_4());
            		
            // InternalMyFarmbot.g:1483:3: ( (lv_name_5_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1484:4: (lv_name_5_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1484:4: (lv_name_5_0= RULE_STRING )
            // InternalMyFarmbot.g:1485:5: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_5_0, grammarAccess.getRunFarmwareAccess().getNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunFarmwareRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRunFarmwareAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunFarmware"


    // $ANTLR start "entryRuleTakePhoto"
    // InternalMyFarmbot.g:1509:1: entryRuleTakePhoto returns [EObject current=null] : iv_ruleTakePhoto= ruleTakePhoto EOF ;
    public final EObject entryRuleTakePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakePhoto = null;


        try {
            // InternalMyFarmbot.g:1509:50: (iv_ruleTakePhoto= ruleTakePhoto EOF )
            // InternalMyFarmbot.g:1510:2: iv_ruleTakePhoto= ruleTakePhoto EOF
            {
             newCompositeNode(grammarAccess.getTakePhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTakePhoto=ruleTakePhoto();

            state._fsp--;

             current =iv_ruleTakePhoto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTakePhoto"


    // $ANTLR start "ruleTakePhoto"
    // InternalMyFarmbot.g:1516:1: ruleTakePhoto returns [EObject current=null] : ( () otherlv_1= 'takePhoto()' ) ;
    public final EObject ruleTakePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1522:2: ( ( () otherlv_1= 'takePhoto()' ) )
            // InternalMyFarmbot.g:1523:2: ( () otherlv_1= 'takePhoto()' )
            {
            // InternalMyFarmbot.g:1523:2: ( () otherlv_1= 'takePhoto()' )
            // InternalMyFarmbot.g:1524:3: () otherlv_1= 'takePhoto()'
            {
            // InternalMyFarmbot.g:1524:3: ()
            // InternalMyFarmbot.g:1525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTakePhotoAccess().getTakePhotoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTakePhotoAccess().getTakePhotoKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTakePhoto"


    // $ANTLR start "entryRuleSchedule"
    // InternalMyFarmbot.g:1539:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyFarmbot.g:1539:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyFarmbot.g:1540:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalMyFarmbot.g:1546:1: ruleSchedule returns [EObject current=null] : ( () otherlv_1= 'schedule' otherlv_2= '(' otherlv_3= 'sequence' otherlv_4= '=' ( (lv_sequence_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'startDate' otherlv_8= '=' ( (lv_startDate_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'startTime' otherlv_12= '=' ( (lv_startTime_13_0= RULE_STRING ) ) otherlv_14= ',' otherlv_15= 'repeat' otherlv_16= '=' ( (lv_repeat_17_0= ruleEBoolean ) ) otherlv_18= ',' otherlv_19= 'repeatFrequency' otherlv_20= '=' ( (lv_repeatFrequency_21_0= RULE_INT ) ) otherlv_22= ',' otherlv_23= 'repeatUnit' otherlv_24= '=' ( (lv_repeatUnit_25_0= RULE_STRING ) ) otherlv_26= ',' otherlv_27= 'endDate' otherlv_28= '=' ( (lv_endDate_29_0= RULE_STRING ) ) otherlv_30= ',' otherlv_31= 'endTime' otherlv_32= '=' ( (lv_endTime_33_0= RULE_STRING ) ) otherlv_34= ')' ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_sequence_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_startDate_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_startTime_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_repeatFrequency_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_repeatUnit_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_endDate_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_endTime_33_0=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_repeat_17_0 = null;



        	enterRule();

        try {
            // InternalMyFarmbot.g:1552:2: ( ( () otherlv_1= 'schedule' otherlv_2= '(' otherlv_3= 'sequence' otherlv_4= '=' ( (lv_sequence_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'startDate' otherlv_8= '=' ( (lv_startDate_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'startTime' otherlv_12= '=' ( (lv_startTime_13_0= RULE_STRING ) ) otherlv_14= ',' otherlv_15= 'repeat' otherlv_16= '=' ( (lv_repeat_17_0= ruleEBoolean ) ) otherlv_18= ',' otherlv_19= 'repeatFrequency' otherlv_20= '=' ( (lv_repeatFrequency_21_0= RULE_INT ) ) otherlv_22= ',' otherlv_23= 'repeatUnit' otherlv_24= '=' ( (lv_repeatUnit_25_0= RULE_STRING ) ) otherlv_26= ',' otherlv_27= 'endDate' otherlv_28= '=' ( (lv_endDate_29_0= RULE_STRING ) ) otherlv_30= ',' otherlv_31= 'endTime' otherlv_32= '=' ( (lv_endTime_33_0= RULE_STRING ) ) otherlv_34= ')' ) )
            // InternalMyFarmbot.g:1553:2: ( () otherlv_1= 'schedule' otherlv_2= '(' otherlv_3= 'sequence' otherlv_4= '=' ( (lv_sequence_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'startDate' otherlv_8= '=' ( (lv_startDate_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'startTime' otherlv_12= '=' ( (lv_startTime_13_0= RULE_STRING ) ) otherlv_14= ',' otherlv_15= 'repeat' otherlv_16= '=' ( (lv_repeat_17_0= ruleEBoolean ) ) otherlv_18= ',' otherlv_19= 'repeatFrequency' otherlv_20= '=' ( (lv_repeatFrequency_21_0= RULE_INT ) ) otherlv_22= ',' otherlv_23= 'repeatUnit' otherlv_24= '=' ( (lv_repeatUnit_25_0= RULE_STRING ) ) otherlv_26= ',' otherlv_27= 'endDate' otherlv_28= '=' ( (lv_endDate_29_0= RULE_STRING ) ) otherlv_30= ',' otherlv_31= 'endTime' otherlv_32= '=' ( (lv_endTime_33_0= RULE_STRING ) ) otherlv_34= ')' )
            {
            // InternalMyFarmbot.g:1553:2: ( () otherlv_1= 'schedule' otherlv_2= '(' otherlv_3= 'sequence' otherlv_4= '=' ( (lv_sequence_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'startDate' otherlv_8= '=' ( (lv_startDate_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'startTime' otherlv_12= '=' ( (lv_startTime_13_0= RULE_STRING ) ) otherlv_14= ',' otherlv_15= 'repeat' otherlv_16= '=' ( (lv_repeat_17_0= ruleEBoolean ) ) otherlv_18= ',' otherlv_19= 'repeatFrequency' otherlv_20= '=' ( (lv_repeatFrequency_21_0= RULE_INT ) ) otherlv_22= ',' otherlv_23= 'repeatUnit' otherlv_24= '=' ( (lv_repeatUnit_25_0= RULE_STRING ) ) otherlv_26= ',' otherlv_27= 'endDate' otherlv_28= '=' ( (lv_endDate_29_0= RULE_STRING ) ) otherlv_30= ',' otherlv_31= 'endTime' otherlv_32= '=' ( (lv_endTime_33_0= RULE_STRING ) ) otherlv_34= ')' )
            // InternalMyFarmbot.g:1554:3: () otherlv_1= 'schedule' otherlv_2= '(' otherlv_3= 'sequence' otherlv_4= '=' ( (lv_sequence_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'startDate' otherlv_8= '=' ( (lv_startDate_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'startTime' otherlv_12= '=' ( (lv_startTime_13_0= RULE_STRING ) ) otherlv_14= ',' otherlv_15= 'repeat' otherlv_16= '=' ( (lv_repeat_17_0= ruleEBoolean ) ) otherlv_18= ',' otherlv_19= 'repeatFrequency' otherlv_20= '=' ( (lv_repeatFrequency_21_0= RULE_INT ) ) otherlv_22= ',' otherlv_23= 'repeatUnit' otherlv_24= '=' ( (lv_repeatUnit_25_0= RULE_STRING ) ) otherlv_26= ',' otherlv_27= 'endDate' otherlv_28= '=' ( (lv_endDate_29_0= RULE_STRING ) ) otherlv_30= ',' otherlv_31= 'endTime' otherlv_32= '=' ( (lv_endTime_33_0= RULE_STRING ) ) otherlv_34= ')'
            {
            // InternalMyFarmbot.g:1554:3: ()
            // InternalMyFarmbot.g:1555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScheduleAccess().getScheduleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getScheduleKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getSequenceKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getScheduleAccess().getEqualsSignKeyword_4());
            		
            // InternalMyFarmbot.g:1577:3: ( (lv_sequence_5_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1578:4: (lv_sequence_5_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1578:4: (lv_sequence_5_0= RULE_STRING )
            // InternalMyFarmbot.g:1579:5: lv_sequence_5_0= RULE_STRING
            {
            lv_sequence_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_sequence_5_0, grammarAccess.getScheduleAccess().getSequenceSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sequence",
            						lv_sequence_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getScheduleAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getScheduleAccess().getStartDateKeyword_7());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getScheduleAccess().getEqualsSignKeyword_8());
            		
            // InternalMyFarmbot.g:1607:3: ( (lv_startDate_9_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1608:4: (lv_startDate_9_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1608:4: (lv_startDate_9_0= RULE_STRING )
            // InternalMyFarmbot.g:1609:5: lv_startDate_9_0= RULE_STRING
            {
            lv_startDate_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_startDate_9_0, grammarAccess.getScheduleAccess().getStartDateSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_10, grammarAccess.getScheduleAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getScheduleAccess().getStartTimeKeyword_11());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getScheduleAccess().getEqualsSignKeyword_12());
            		
            // InternalMyFarmbot.g:1637:3: ( (lv_startTime_13_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1638:4: (lv_startTime_13_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1638:4: (lv_startTime_13_0= RULE_STRING )
            // InternalMyFarmbot.g:1639:5: lv_startTime_13_0= RULE_STRING
            {
            lv_startTime_13_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_startTime_13_0, grammarAccess.getScheduleAccess().getStartTimeSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_14, grammarAccess.getScheduleAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_15, grammarAccess.getScheduleAccess().getRepeatKeyword_15());
            		
            otherlv_16=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getScheduleAccess().getEqualsSignKeyword_16());
            		
            // InternalMyFarmbot.g:1667:3: ( (lv_repeat_17_0= ruleEBoolean ) )
            // InternalMyFarmbot.g:1668:4: (lv_repeat_17_0= ruleEBoolean )
            {
            // InternalMyFarmbot.g:1668:4: (lv_repeat_17_0= ruleEBoolean )
            // InternalMyFarmbot.g:1669:5: lv_repeat_17_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getRepeatEBooleanParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_7);
            lv_repeat_17_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					set(
            						current,
            						"repeat",
            						lv_repeat_17_0,
            						"xtext.farmbot.MyFarmbot.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_18, grammarAccess.getScheduleAccess().getCommaKeyword_18());
            		
            otherlv_19=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_19, grammarAccess.getScheduleAccess().getRepeatFrequencyKeyword_19());
            		
            otherlv_20=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getScheduleAccess().getEqualsSignKeyword_20());
            		
            // InternalMyFarmbot.g:1698:3: ( (lv_repeatFrequency_21_0= RULE_INT ) )
            // InternalMyFarmbot.g:1699:4: (lv_repeatFrequency_21_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1699:4: (lv_repeatFrequency_21_0= RULE_INT )
            // InternalMyFarmbot.g:1700:5: lv_repeatFrequency_21_0= RULE_INT
            {
            lv_repeatFrequency_21_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_repeatFrequency_21_0, grammarAccess.getScheduleAccess().getRepeatFrequencyINTTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repeatFrequency",
            						lv_repeatFrequency_21_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_22=(Token)match(input,14,FOLLOW_37); 

            			newLeafNode(otherlv_22, grammarAccess.getScheduleAccess().getCommaKeyword_22());
            		
            otherlv_23=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getScheduleAccess().getRepeatUnitKeyword_23());
            		
            otherlv_24=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_24, grammarAccess.getScheduleAccess().getEqualsSignKeyword_24());
            		
            // InternalMyFarmbot.g:1728:3: ( (lv_repeatUnit_25_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1729:4: (lv_repeatUnit_25_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1729:4: (lv_repeatUnit_25_0= RULE_STRING )
            // InternalMyFarmbot.g:1730:5: lv_repeatUnit_25_0= RULE_STRING
            {
            lv_repeatUnit_25_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_repeatUnit_25_0, grammarAccess.getScheduleAccess().getRepeatUnitSTRINGTerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repeatUnit",
            						lv_repeatUnit_25_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_26=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_26, grammarAccess.getScheduleAccess().getCommaKeyword_26());
            		
            otherlv_27=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_27, grammarAccess.getScheduleAccess().getEndDateKeyword_27());
            		
            otherlv_28=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getScheduleAccess().getEqualsSignKeyword_28());
            		
            // InternalMyFarmbot.g:1758:3: ( (lv_endDate_29_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1759:4: (lv_endDate_29_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1759:4: (lv_endDate_29_0= RULE_STRING )
            // InternalMyFarmbot.g:1760:5: lv_endDate_29_0= RULE_STRING
            {
            lv_endDate_29_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_endDate_29_0, grammarAccess.getScheduleAccess().getEndDateSTRINGTerminalRuleCall_29_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endDate",
            						lv_endDate_29_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_30=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_30, grammarAccess.getScheduleAccess().getCommaKeyword_30());
            		
            otherlv_31=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_31, grammarAccess.getScheduleAccess().getEndTimeKeyword_31());
            		
            otherlv_32=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_32, grammarAccess.getScheduleAccess().getEqualsSignKeyword_32());
            		
            // InternalMyFarmbot.g:1788:3: ( (lv_endTime_33_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1789:4: (lv_endTime_33_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1789:4: (lv_endTime_33_0= RULE_STRING )
            // InternalMyFarmbot.g:1790:5: lv_endTime_33_0= RULE_STRING
            {
            lv_endTime_33_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_endTime_33_0, grammarAccess.getScheduleAccess().getEndTimeSTRINGTerminalRuleCall_33_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_33_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_34=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getScheduleAccess().getRightParenthesisKeyword_34());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleListPeripherals"
    // InternalMyFarmbot.g:1814:1: entryRuleListPeripherals returns [EObject current=null] : iv_ruleListPeripherals= ruleListPeripherals EOF ;
    public final EObject entryRuleListPeripherals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListPeripherals = null;


        try {
            // InternalMyFarmbot.g:1814:56: (iv_ruleListPeripherals= ruleListPeripherals EOF )
            // InternalMyFarmbot.g:1815:2: iv_ruleListPeripherals= ruleListPeripherals EOF
            {
             newCompositeNode(grammarAccess.getListPeripheralsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListPeripherals=ruleListPeripherals();

            state._fsp--;

             current =iv_ruleListPeripherals; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListPeripherals"


    // $ANTLR start "ruleListPeripherals"
    // InternalMyFarmbot.g:1821:1: ruleListPeripherals returns [EObject current=null] : ( () otherlv_1= 'listPeripherals()' ) ;
    public final EObject ruleListPeripherals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1827:2: ( ( () otherlv_1= 'listPeripherals()' ) )
            // InternalMyFarmbot.g:1828:2: ( () otherlv_1= 'listPeripherals()' )
            {
            // InternalMyFarmbot.g:1828:2: ( () otherlv_1= 'listPeripherals()' )
            // InternalMyFarmbot.g:1829:3: () otherlv_1= 'listPeripherals()'
            {
            // InternalMyFarmbot.g:1829:3: ()
            // InternalMyFarmbot.g:1830:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListPeripheralsAccess().getListPeripheralsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListPeripheralsAccess().getListPeripheralsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListPeripherals"


    // $ANTLR start "entryRuleListSequences"
    // InternalMyFarmbot.g:1844:1: entryRuleListSequences returns [EObject current=null] : iv_ruleListSequences= ruleListSequences EOF ;
    public final EObject entryRuleListSequences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListSequences = null;


        try {
            // InternalMyFarmbot.g:1844:54: (iv_ruleListSequences= ruleListSequences EOF )
            // InternalMyFarmbot.g:1845:2: iv_ruleListSequences= ruleListSequences EOF
            {
             newCompositeNode(grammarAccess.getListSequencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListSequences=ruleListSequences();

            state._fsp--;

             current =iv_ruleListSequences; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListSequences"


    // $ANTLR start "ruleListSequences"
    // InternalMyFarmbot.g:1851:1: ruleListSequences returns [EObject current=null] : ( () otherlv_1= 'listSequences()' ) ;
    public final EObject ruleListSequences() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1857:2: ( ( () otherlv_1= 'listSequences()' ) )
            // InternalMyFarmbot.g:1858:2: ( () otherlv_1= 'listSequences()' )
            {
            // InternalMyFarmbot.g:1858:2: ( () otherlv_1= 'listSequences()' )
            // InternalMyFarmbot.g:1859:3: () otherlv_1= 'listSequences()'
            {
            // InternalMyFarmbot.g:1859:3: ()
            // InternalMyFarmbot.g:1860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListSequencesAccess().getListSequencesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListSequencesAccess().getListSequencesKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListSequences"


    // $ANTLR start "entryRuleIsEqualTo"
    // InternalMyFarmbot.g:1874:1: entryRuleIsEqualTo returns [EObject current=null] : iv_ruleIsEqualTo= ruleIsEqualTo EOF ;
    public final EObject entryRuleIsEqualTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEqualTo = null;


        try {
            // InternalMyFarmbot.g:1874:50: (iv_ruleIsEqualTo= ruleIsEqualTo EOF )
            // InternalMyFarmbot.g:1875:2: iv_ruleIsEqualTo= ruleIsEqualTo EOF
            {
             newCompositeNode(grammarAccess.getIsEqualToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsEqualTo=ruleIsEqualTo();

            state._fsp--;

             current =iv_ruleIsEqualTo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsEqualTo"


    // $ANTLR start "ruleIsEqualTo"
    // InternalMyFarmbot.g:1881:1: ruleIsEqualTo returns [EObject current=null] : ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'equals' otherlv_3= 'to' ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIsEqualTo() throws RecognitionException {
        EObject current = null;

        Token lv_axe_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1887:2: ( ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'equals' otherlv_3= 'to' ( (lv_value_4_0= RULE_INT ) ) ) )
            // InternalMyFarmbot.g:1888:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'equals' otherlv_3= 'to' ( (lv_value_4_0= RULE_INT ) ) )
            {
            // InternalMyFarmbot.g:1888:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'equals' otherlv_3= 'to' ( (lv_value_4_0= RULE_INT ) ) )
            // InternalMyFarmbot.g:1889:3: () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'equals' otherlv_3= 'to' ( (lv_value_4_0= RULE_INT ) )
            {
            // InternalMyFarmbot.g:1889:3: ()
            // InternalMyFarmbot.g:1890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsEqualToAccess().getIsEqualToAction_0(),
            					current);
            			

            }

            // InternalMyFarmbot.g:1896:3: ( (lv_axe_1_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1897:4: (lv_axe_1_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1897:4: (lv_axe_1_0= RULE_STRING )
            // InternalMyFarmbot.g:1898:5: lv_axe_1_0= RULE_STRING
            {
            lv_axe_1_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_axe_1_0, grammarAccess.getIsEqualToAccess().getAxeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsEqualToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"axe",
            						lv_axe_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getIsEqualToAccess().getEqualsKeyword_2());
            		
            otherlv_3=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIsEqualToAccess().getToKeyword_3());
            		
            // InternalMyFarmbot.g:1922:3: ( (lv_value_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:1923:4: (lv_value_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1923:4: (lv_value_4_0= RULE_INT )
            // InternalMyFarmbot.g:1924:5: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getIsEqualToAccess().getValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsEqualToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsEqualTo"


    // $ANTLR start "entryRuleIsNotEqualTo"
    // InternalMyFarmbot.g:1944:1: entryRuleIsNotEqualTo returns [EObject current=null] : iv_ruleIsNotEqualTo= ruleIsNotEqualTo EOF ;
    public final EObject entryRuleIsNotEqualTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsNotEqualTo = null;


        try {
            // InternalMyFarmbot.g:1944:53: (iv_ruleIsNotEqualTo= ruleIsNotEqualTo EOF )
            // InternalMyFarmbot.g:1945:2: iv_ruleIsNotEqualTo= ruleIsNotEqualTo EOF
            {
             newCompositeNode(grammarAccess.getIsNotEqualToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsNotEqualTo=ruleIsNotEqualTo();

            state._fsp--;

             current =iv_ruleIsNotEqualTo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsNotEqualTo"


    // $ANTLR start "ruleIsNotEqualTo"
    // InternalMyFarmbot.g:1951:1: ruleIsNotEqualTo returns [EObject current=null] : ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'not' otherlv_3= 'equals' otherlv_4= 'to' ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleIsNotEqualTo() throws RecognitionException {
        EObject current = null;

        Token lv_axe_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:1957:2: ( ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'not' otherlv_3= 'equals' otherlv_4= 'to' ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalMyFarmbot.g:1958:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'not' otherlv_3= 'equals' otherlv_4= 'to' ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalMyFarmbot.g:1958:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'not' otherlv_3= 'equals' otherlv_4= 'to' ( (lv_value_5_0= RULE_INT ) ) )
            // InternalMyFarmbot.g:1959:3: () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'not' otherlv_3= 'equals' otherlv_4= 'to' ( (lv_value_5_0= RULE_INT ) )
            {
            // InternalMyFarmbot.g:1959:3: ()
            // InternalMyFarmbot.g:1960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsNotEqualToAccess().getIsNotEqualToAction_0(),
            					current);
            			

            }

            // InternalMyFarmbot.g:1966:3: ( (lv_axe_1_0= RULE_STRING ) )
            // InternalMyFarmbot.g:1967:4: (lv_axe_1_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:1967:4: (lv_axe_1_0= RULE_STRING )
            // InternalMyFarmbot.g:1968:5: lv_axe_1_0= RULE_STRING
            {
            lv_axe_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_axe_1_0, grammarAccess.getIsNotEqualToAccess().getAxeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsNotEqualToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"axe",
            						lv_axe_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getIsNotEqualToAccess().getNotKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getIsNotEqualToAccess().getEqualsKeyword_3());
            		
            otherlv_4=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getIsNotEqualToAccess().getToKeyword_4());
            		
            // InternalMyFarmbot.g:1996:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalMyFarmbot.g:1997:4: (lv_value_5_0= RULE_INT )
            {
            // InternalMyFarmbot.g:1997:4: (lv_value_5_0= RULE_INT )
            // InternalMyFarmbot.g:1998:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getIsNotEqualToAccess().getValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsNotEqualToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsNotEqualTo"


    // $ANTLR start "entryRuleIsGreaterThan"
    // InternalMyFarmbot.g:2018:1: entryRuleIsGreaterThan returns [EObject current=null] : iv_ruleIsGreaterThan= ruleIsGreaterThan EOF ;
    public final EObject entryRuleIsGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGreaterThan = null;


        try {
            // InternalMyFarmbot.g:2018:54: (iv_ruleIsGreaterThan= ruleIsGreaterThan EOF )
            // InternalMyFarmbot.g:2019:2: iv_ruleIsGreaterThan= ruleIsGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getIsGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsGreaterThan=ruleIsGreaterThan();

            state._fsp--;

             current =iv_ruleIsGreaterThan; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsGreaterThan"


    // $ANTLR start "ruleIsGreaterThan"
    // InternalMyFarmbot.g:2025:1: ruleIsGreaterThan returns [EObject current=null] : ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'greater' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIsGreaterThan() throws RecognitionException {
        EObject current = null;

        Token lv_axe_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:2031:2: ( ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'greater' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) ) )
            // InternalMyFarmbot.g:2032:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'greater' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) )
            {
            // InternalMyFarmbot.g:2032:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'greater' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) )
            // InternalMyFarmbot.g:2033:3: () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'greater' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) )
            {
            // InternalMyFarmbot.g:2033:3: ()
            // InternalMyFarmbot.g:2034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsGreaterThanAccess().getIsGreaterThanAction_0(),
            					current);
            			

            }

            // InternalMyFarmbot.g:2040:3: ( (lv_axe_1_0= RULE_STRING ) )
            // InternalMyFarmbot.g:2041:4: (lv_axe_1_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:2041:4: (lv_axe_1_0= RULE_STRING )
            // InternalMyFarmbot.g:2042:5: lv_axe_1_0= RULE_STRING
            {
            lv_axe_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_axe_1_0, grammarAccess.getIsGreaterThanAccess().getAxeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsGreaterThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"axe",
            						lv_axe_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getIsGreaterThanAccess().getGreaterKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIsGreaterThanAccess().getThanKeyword_3());
            		
            // InternalMyFarmbot.g:2066:3: ( (lv_value_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:2067:4: (lv_value_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:2067:4: (lv_value_4_0= RULE_INT )
            // InternalMyFarmbot.g:2068:5: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getIsGreaterThanAccess().getValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsGreaterThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsGreaterThan"


    // $ANTLR start "entryRuleIsLowerThan"
    // InternalMyFarmbot.g:2088:1: entryRuleIsLowerThan returns [EObject current=null] : iv_ruleIsLowerThan= ruleIsLowerThan EOF ;
    public final EObject entryRuleIsLowerThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsLowerThan = null;


        try {
            // InternalMyFarmbot.g:2088:52: (iv_ruleIsLowerThan= ruleIsLowerThan EOF )
            // InternalMyFarmbot.g:2089:2: iv_ruleIsLowerThan= ruleIsLowerThan EOF
            {
             newCompositeNode(grammarAccess.getIsLowerThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsLowerThan=ruleIsLowerThan();

            state._fsp--;

             current =iv_ruleIsLowerThan; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIsLowerThan"


    // $ANTLR start "ruleIsLowerThan"
    // InternalMyFarmbot.g:2095:1: ruleIsLowerThan returns [EObject current=null] : ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'lower' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIsLowerThan() throws RecognitionException {
        EObject current = null;

        Token lv_axe_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:2101:2: ( ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'lower' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) ) )
            // InternalMyFarmbot.g:2102:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'lower' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) )
            {
            // InternalMyFarmbot.g:2102:2: ( () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'lower' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) ) )
            // InternalMyFarmbot.g:2103:3: () ( (lv_axe_1_0= RULE_STRING ) ) otherlv_2= 'lower' otherlv_3= 'than' ( (lv_value_4_0= RULE_INT ) )
            {
            // InternalMyFarmbot.g:2103:3: ()
            // InternalMyFarmbot.g:2104:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsLowerThanAccess().getIsLowerThanAction_0(),
            					current);
            			

            }

            // InternalMyFarmbot.g:2110:3: ( (lv_axe_1_0= RULE_STRING ) )
            // InternalMyFarmbot.g:2111:4: (lv_axe_1_0= RULE_STRING )
            {
            // InternalMyFarmbot.g:2111:4: (lv_axe_1_0= RULE_STRING )
            // InternalMyFarmbot.g:2112:5: lv_axe_1_0= RULE_STRING
            {
            lv_axe_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_axe_1_0, grammarAccess.getIsLowerThanAccess().getAxeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsLowerThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"axe",
            						lv_axe_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getIsLowerThanAccess().getLowerKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIsLowerThanAccess().getThanKeyword_3());
            		
            // InternalMyFarmbot.g:2136:3: ( (lv_value_4_0= RULE_INT ) )
            // InternalMyFarmbot.g:2137:4: (lv_value_4_0= RULE_INT )
            {
            // InternalMyFarmbot.g:2137:4: (lv_value_4_0= RULE_INT )
            // InternalMyFarmbot.g:2138:5: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getIsLowerThanAccess().getValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsLowerThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsLowerThan"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyFarmbot.g:2158:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyFarmbot.g:2158:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyFarmbot.g:2159:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyFarmbot.g:2165:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:2171:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyFarmbot.g:2172:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyFarmbot.g:2172:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyFarmbot.g:2173:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyFarmbot.g:2173:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==61) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyFarmbot.g:2174:4: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_46); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyFarmbot.g:2180:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyFarmbot.g:2181:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_47); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,62,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_48); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyFarmbot.g:2201:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=63 && LA13_0<=64)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyFarmbot.g:2202:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyFarmbot.g:2202:4: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==63) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==64) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyFarmbot.g:2203:5: kw= 'E'
                            {
                            kw=(Token)match(input,63,FOLLOW_49); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyFarmbot.g:2209:5: kw= 'e'
                            {
                            kw=(Token)match(input,64,FOLLOW_49); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyFarmbot.g:2215:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==61) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyFarmbot.g:2216:5: kw= '-'
                            {
                            kw=(Token)match(input,61,FOLLOW_6); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyFarmbot.g:2234:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyFarmbot.g:2234:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyFarmbot.g:2235:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyFarmbot.g:2241:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyFarmbot.g:2247:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyFarmbot.g:2248:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyFarmbot.g:2248:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==65) ) {
                alt14=1;
            }
            else if ( (LA14_0==66) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyFarmbot.g:2249:3: kw= 'true'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFarmbot.g:2255:3: kw= 'false'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x006035A528860802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x6000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000015A530860800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000010L});

}