// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/jflex/simple.flex

package demo.compiler;
import java.util.Hashtable;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.Stack;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class AnalizadorLexico {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\u10cf\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\1\1\3\22\0\1\4\1\5"+
    "\1\6\1\7\1\0\2\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\15\1\17\1\20\1\21\1\22\6\23"+
    "\2\24\1\25\1\26\1\27\1\30\1\31\1\0\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\3\41\1\42"+
    "\1\41\1\43\1\41\1\44\1\45\2\41\1\46\1\41"+
    "\1\47\1\50\2\41\1\51\2\41\1\52\1\53\1\52"+
    "\1\32\1\54\1\0\1\55\1\56\1\57\1\60\1\61"+
    "\1\62\1\63\1\64\1\65\1\42\1\66\1\67\1\70"+
    "\1\71\1\72\1\73\1\41\1\74\1\75\1\76\1\77"+
    "\1\41\1\100\1\101\1\102\1\41\1\52\1\10\1\52"+
    "\1\32\6\0\1\1\32\0\1\1\36\0\1\103\1\0"+
    "\1\103\7\0\1\103\3\0\1\103\3\0\1\103\1\0"+
    "\1\103\6\0\1\103\5\0\2\103\2\0\1\103\3\0"+
    "\2\103\1\0\3\103\1\0\1\103\1\0\3\103\2\0"+
    "\1\103\2\0\2\103\1\0\1\103\u0183\0\1\1\177\0"+
    "\13\1\35\0\2\1\5\0\1\1\57\0\1\1\240\0"+
    "\1\1\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\2\1\1\2\1\3\1\1\1\4"+
    "\1\5\1\3\1\6\1\7\1\3\2\10\1\11\1\7"+
    "\3\3\10\12\1\13\1\14\20\12\1\0\1\15\1\0"+
    "\1\10\1\16\2\0\2\10\1\0\3\16\1\10\2\16"+
    "\1\12\1\17\2\0\2\12\1\3\1\12\1\17\1\12"+
    "\1\20\13\12\1\20\1\12\2\3\12\12\1\0\1\10"+
    "\1\0\1\16\1\0\1\10\2\0\1\10\1\0\2\16"+
    "\2\10\1\0\6\10\1\0\16\12\1\0\2\12\1\3"+
    "\7\12\1\0\2\16\2\0\4\16\1\0\2\16\5\10"+
    "\7\12\2\0\1\12\1\0\1\12\1\21\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\2\16\4\12\1\0\1\12"+
    "\2\0\1\2\2\16\1\12\1\0\1\16\1\0\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[202];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\104\0\210\0\314\0\104\0\u0110\0\u0154\0\u0198"+
    "\0\u0110\0\u01dc\0\104\0\104\0\u0220\0\104\0\u0264\0\u02a8"+
    "\0\u02ec\0\u0330\0\104\0\104\0\u0374\0\u03b8\0\104\0\u03fc"+
    "\0\u0440\0\u0484\0\u04c8\0\u050c\0\u0550\0\u0594\0\u05d8\0\104"+
    "\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c\0\u0770\0\u07b4\0\u07f8"+
    "\0\u083c\0\u0880\0\u08c4\0\u0908\0\u094c\0\u0990\0\u09d4\0\u0a18"+
    "\0\u0a5c\0\u0aa0\0\104\0\u0ae4\0\u0b28\0\u0ae4\0\u0b6c\0\u0bb0"+
    "\0\u0bf4\0\u0c38\0\u0c7c\0\u0cc0\0\u0d04\0\u0d48\0\u0cc0\0\u0d8c"+
    "\0\u0dd0\0\u0e14\0\u061c\0\u0e58\0\u0e9c\0\u0ee0\0\u0f24\0\u0484"+
    "\0\u0f68\0\u0fac\0\u0ff0\0\u1034\0\u1078\0\u10bc\0\u1100\0\u1144"+
    "\0\u1188\0\u11cc\0\u1210\0\u1254\0\u1298\0\u12dc\0\u1320\0\u0484"+
    "\0\u1364\0\u13a8\0\u13ec\0\u1430\0\u1474\0\u14b8\0\u14fc\0\u1540"+
    "\0\u1584\0\u15c8\0\u160c\0\u1650\0\u1694\0\u16d8\0\u171c\0\u1760"+
    "\0\u17a4\0\u17e8\0\u182c\0\u1870\0\u18b4\0\u18f8\0\u193c\0\u1980"+
    "\0\u19c4\0\u1a08\0\u1a4c\0\u1a90\0\u1ad4\0\u1b18\0\u1b5c\0\u1ba0"+
    "\0\u1be4\0\104\0\u1c28\0\u1c6c\0\u1cb0\0\u1cf4\0\u1d38\0\u1d7c"+
    "\0\u1dc0\0\u1e04\0\u1e48\0\u1e8c\0\u1ed0\0\u1f14\0\u1f58\0\u1f9c"+
    "\0\u1fe0\0\u2024\0\u2068\0\u20ac\0\u20f0\0\u2134\0\u2178\0\u21bc"+
    "\0\u2200\0\u2244\0\u2288\0\u22cc\0\u2310\0\u171c\0\104\0\u2354"+
    "\0\u2398\0\u23dc\0\u182c\0\u2420\0\u2464\0\u24a8\0\u24ec\0\u2530"+
    "\0\u2574\0\u25b8\0\u25fc\0\u2640\0\u0484\0\u2684\0\u26c8\0\u270c"+
    "\0\u2750\0\u2794\0\u27d8\0\u281c\0\u2860\0\u28a4\0\u28e8\0\u292c"+
    "\0\u2970\0\u29b4\0\u29f8\0\u29f8\0\u2a3c\0\u2a80\0\u18f8\0\u2ac4"+
    "\0\u2b08\0\u2b4c\0\u2b90\0\u2bd4\0\u2c18\0\u2c5c\0\u2ca0\0\u2ce4"+
    "\0\u2d28\0\u2d6c\0\u2db0\0\u2df4\0\u2e38\0\u2e7c\0\u2ec0\0\u2db0"+
    "\0\u2f04\0\104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[202];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\11\1\16\1\17\1\20"+
    "\1\21\3\22\1\23\1\24\1\25\1\11\1\26\1\27"+
    "\1\30\1\31\3\32\1\33\3\32\1\34\1\35\1\36"+
    "\1\37\1\31\1\32\1\40\1\41\1\32\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\32\1\51\1\32"+
    "\1\52\1\32\1\53\1\54\1\55\1\56\1\32\1\57"+
    "\1\31\1\60\1\32\1\61\1\41\105\0\4\62\26\0"+
    "\17\63\3\0\26\63\3\0\1\5\131\0\1\27\53\0"+
    "\2\64\2\0\2\64\1\65\44\64\1\66\30\64\2\10"+
    "\2\0\100\10\11\67\1\70\72\67\14\0\1\11\13\0"+
    "\1\27\74\0\4\71\77\0\1\11\7\0\1\27\72\0"+
    "\1\71\1\0\3\72\1\73\6\0\1\74\1\75\2\74"+
    "\1\76\2\74\2\77\1\74\1\100\3\74\1\101\1\0"+
    "\3\74\1\75\2\74\1\76\5\74\1\77\2\74\1\100"+
    "\6\74\1\101\2\74\17\0\1\71\1\0\4\22\6\0"+
    "\4\74\1\76\2\74\2\77\6\74\1\0\6\74\1\76"+
    "\5\74\1\77\14\74\27\0\1\11\2\27\102\0\1\27"+
    "\1\11\73\0\4\32\6\0\11\32\1\102\5\32\1\0"+
    "\1\103\27\32\1\103\6\0\1\104\2\0\1\105\7\0"+
    "\4\32\6\0\13\32\1\36\3\32\1\0\1\103\20\32"+
    "\1\36\6\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\27\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\1\32\1\106\25\32\1\103\21\0\4\32\6\0"+
    "\12\32\1\107\4\32\1\0\1\103\27\32\1\103\21\0"+
    "\4\32\6\0\13\32\1\110\3\32\1\0\1\103\27\32"+
    "\1\103\6\0\1\104\2\0\1\105\7\0\4\32\6\0"+
    "\17\32\1\0\1\103\27\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\20\32\1\111\6\32\1\103\33\0"+
    "\17\112\1\0\1\103\27\112\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\15\32\1\113\3\32\1\114\5\32"+
    "\1\103\6\0\1\104\2\0\1\105\7\0\4\32\6\0"+
    "\13\32\1\36\3\32\1\0\1\103\20\32\1\115\6\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\13\32"+
    "\1\116\2\32\1\117\10\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\5\32\1\120\21\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\13\32\1\121\1\32"+
    "\1\122\7\32\1\123\1\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\11\32\1\124\4\32\1\125\1\32"+
    "\1\126\6\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\13\32\1\127\13\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\6\32\1\130\5\32\1\131\1\132"+
    "\3\32\1\133\5\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\1\32\1\134\25\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\16\32\1\135\10\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\20\32\1\110"+
    "\6\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\1\32\1\136\16\32\1\137\6\32\1\103\6\0\1\104"+
    "\2\0\1\105\7\0\4\32\6\0\17\32\1\0\1\103"+
    "\1\32\1\140\3\32\1\141\21\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\20\32\1\142\6\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\10\32\1\143"+
    "\1\144\15\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\11\32\1\145\15\32\1\103\1\0\4\146\77\0"+
    "\2\64\2\0\2\64\1\147\44\64\1\66\30\64\2\150"+
    "\2\0\2\150\1\151\75\150\11\152\1\153\72\152\11\154"+
    "\1\70\72\154\21\0\4\71\6\0\4\74\1\76\2\74"+
    "\1\77\7\74\1\0\6\74\1\76\22\74\17\0\1\71"+
    "\1\0\3\72\1\73\6\0\4\74\1\76\2\74\2\77"+
    "\6\74\1\0\6\74\1\76\5\74\1\77\14\74\17\0"+
    "\1\71\1\0\4\73\12\0\1\155\2\0\1\156\16\0"+
    "\1\155\41\0\1\157\1\0\1\160\3\161\6\0\17\74"+
    "\1\0\31\74\17\0\1\157\1\0\1\162\1\163\2\161"+
    "\6\0\17\74\1\0\31\74\15\0\1\164\1\0\1\157"+
    "\1\0\1\160\3\161\6\0\17\74\1\0\31\74\17\0"+
    "\1\157\1\0\1\165\2\166\1\161\6\0\17\74\1\0"+
    "\31\74\17\0\1\157\1\0\1\167\3\170\6\0\6\171"+
    "\11\74\1\0\2\74\6\171\21\74\21\0\4\32\6\0"+
    "\3\32\1\110\13\32\1\0\1\103\27\32\1\103\2\104"+
    "\2\0\2\104\1\172\75\104\11\173\1\0\72\173\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\13\32\1\174\13\32"+
    "\1\103\21\0\4\32\6\0\14\32\1\110\2\32\1\0"+
    "\1\103\27\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\23\32\1\175\3\32\1\103\21\0\4\112\6\0"+
    "\17\112\1\0\1\103\27\112\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\4\32\1\110\22\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\21\32\1\176\5\32"+
    "\1\103\6\0\1\104\2\0\1\105\7\0\4\32\6\0"+
    "\17\32\1\0\1\103\5\32\1\177\21\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\1\32\1\136\25\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\15\32"+
    "\1\200\11\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\6\32\1\130\4\32\1\130\13\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\11\32\1\201\7\32"+
    "\1\202\5\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\4\32\1\130\22\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\3\32\1\203\1\32\1\204\21\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\15\32"+
    "\1\205\11\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\20\32\1\130\6\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\16\32\1\206\10\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\16\32\1\207\10\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\17\32"+
    "\1\210\7\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\17\32\1\211\7\32\1\103\4\0\1\212\14\0"+
    "\4\32\6\0\17\32\1\0\1\103\15\32\1\213\11\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\14\32"+
    "\1\214\12\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\22\32\1\215\4\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\21\32\1\216\5\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\11\32\1\217\15\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\11\32"+
    "\1\220\15\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\22\32\1\221\4\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\26\32\1\130\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\11\32\1\222\15\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\22\32\1\223"+
    "\4\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\5\32\1\224\21\32\1\103\1\0\4\225\105\0\1\226"+
    "\75\0\2\150\2\0\2\150\1\227\75\150\2\230\2\231"+
    "\2\230\1\232\75\230\11\152\1\233\72\152\11\0\1\233"+
    "\72\0\11\154\1\227\72\154\15\0\1\164\121\0\17\74"+
    "\1\0\31\74\21\0\4\234\76\0\1\234\1\0\3\235"+
    "\1\236\6\0\4\74\1\237\11\74\1\240\1\0\6\74"+
    "\1\237\17\74\1\240\2\74\17\0\1\234\1\0\4\161"+
    "\6\0\4\74\1\237\12\74\1\0\6\74\1\237\22\74"+
    "\17\0\1\234\1\0\2\241\1\235\1\236\6\0\4\74"+
    "\1\237\3\74\1\77\5\74\1\240\1\0\6\74\1\237"+
    "\5\74\1\77\11\74\1\240\2\74\17\0\1\234\1\0"+
    "\2\163\2\161\6\0\4\74\1\237\3\74\1\77\6\74"+
    "\1\0\6\74\1\237\5\74\1\77\14\74\21\0\4\242"+
    "\76\0\1\234\1\0\3\243\1\236\6\0\4\74\1\237"+
    "\3\74\1\77\5\74\1\240\1\0\6\74\1\237\5\74"+
    "\1\77\11\74\1\240\2\74\17\0\1\234\1\0\3\166"+
    "\1\161\6\0\4\74\1\237\3\74\1\77\6\74\1\0"+
    "\6\74\1\237\5\74\1\77\14\74\17\0\1\234\1\0"+
    "\4\170\6\0\4\171\1\244\1\171\2\74\1\77\5\74"+
    "\1\240\1\0\2\74\4\171\1\244\1\171\4\74\1\77"+
    "\11\74\1\240\2\74\17\0\1\234\1\0\4\170\6\0"+
    "\4\171\1\244\1\171\2\74\1\77\6\74\1\0\2\74"+
    "\4\171\1\244\1\171\4\74\1\77\14\74\17\0\1\157"+
    "\1\0\1\167\3\170\6\0\6\171\2\74\1\77\6\74"+
    "\1\0\2\74\6\171\4\74\1\77\14\74\11\0\1\172"+
    "\113\0\4\32\6\0\17\32\1\0\1\103\21\32\1\175"+
    "\5\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\5\32\1\245\21\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\5\32\1\246\21\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\1\32\1\247\25\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\22\32\1\250"+
    "\4\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\6\32\1\130\20\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\5\32\1\130\21\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\5\32\1\251\21\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\3\32\1\130"+
    "\23\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\1\32\1\252\25\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\14\32\1\130\12\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\2\32\1\253\24\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\16\32\1\246"+
    "\10\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\23\32\1\254\3\32\1\103\71\0\1\255\23\0\1\256"+
    "\7\0\4\32\6\0\17\32\1\0\1\103\27\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\2\32\1\257"+
    "\24\32\1\103\4\0\1\260\14\0\4\32\6\0\17\32"+
    "\1\0\1\103\27\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\21\32\1\130\5\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\15\32\1\254\11\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\21\32\1\202"+
    "\5\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\23\32\1\261\3\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\13\32\1\202\13\32\1\103\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\10\32\1\130\16\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\13\32\1\122"+
    "\13\32\1\103\1\0\4\262\77\0\2\230\2\231\2\230"+
    "\1\263\75\230\6\231\1\264\75\231\2\150\2\0\2\150"+
    "\1\265\75\150\21\0\4\234\6\0\4\74\1\237\12\74"+
    "\1\0\6\74\1\237\22\74\17\0\1\234\1\0\3\235"+
    "\1\236\6\0\4\74\1\237\12\74\1\0\6\74\1\237"+
    "\22\74\17\0\1\234\1\0\4\236\12\0\1\266\2\0"+
    "\1\267\16\0\1\266\37\0\1\270\1\0\1\157\1\0"+
    "\1\160\3\161\6\0\17\74\1\0\31\74\17\0\1\157"+
    "\1\0\1\271\3\272\6\0\6\240\11\74\1\0\2\74"+
    "\6\240\21\74\17\0\1\234\1\0\2\241\1\235\1\236"+
    "\6\0\4\74\1\237\3\74\1\77\6\74\1\0\6\74"+
    "\1\237\5\74\1\77\14\74\21\0\4\242\6\0\7\74"+
    "\1\77\7\74\1\0\31\74\17\0\1\234\1\0\3\243"+
    "\1\236\6\0\4\74\1\237\3\74\1\77\6\74\1\0"+
    "\6\74\1\237\5\74\1\77\14\74\15\0\1\270\1\0"+
    "\1\157\1\0\1\167\3\170\6\0\6\171\2\74\1\77"+
    "\6\74\1\0\2\74\6\171\4\74\1\77\14\74\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\20\32\1\254\6\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\12\32"+
    "\1\130\14\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\11\32\1\273\15\32\1\103\21\0\4\32\6\0"+
    "\17\32\1\0\1\103\17\32\1\254\7\32\1\103\21\0"+
    "\4\32\6\0\17\32\1\0\1\103\13\32\1\274\13\32"+
    "\1\103\21\0\4\32\6\0\17\32\1\0\1\103\1\32"+
    "\1\275\25\32\1\103\21\0\4\32\6\0\17\32\1\0"+
    "\1\103\22\32\1\130\4\32\1\103\72\0\1\256\107\0"+
    "\1\27\26\0\4\32\6\0\17\32\1\0\1\103\4\32"+
    "\1\276\22\32\1\103\65\0\1\277\37\0\4\32\6\0"+
    "\17\32\1\0\1\103\20\32\1\300\6\32\1\103\1\0"+
    "\4\301\105\0\1\302\75\0\2\150\2\0\2\150\1\303"+
    "\75\150\15\0\1\270\107\0\4\304\76\0\1\234\1\0"+
    "\4\272\6\0\4\240\1\305\1\240\10\74\1\240\1\0"+
    "\2\74\4\240\1\305\1\240\16\74\1\240\2\74\17\0"+
    "\1\234\1\0\4\272\6\0\4\240\1\305\1\240\11\74"+
    "\1\0\2\74\4\240\1\305\1\240\21\74\21\0\4\32"+
    "\6\0\17\32\1\0\1\103\15\32\1\306\11\32\1\103"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\13\32\1\142"+
    "\13\32\1\103\21\0\4\32\6\0\17\32\1\0\1\103"+
    "\13\32\1\130\13\32\1\103\21\0\4\32\6\0\17\32"+
    "\1\0\1\103\1\32\1\130\25\32\1\103\71\0\1\27"+
    "\33\0\4\32\6\0\17\32\1\0\1\103\15\32\1\130"+
    "\11\32\1\103\1\0\4\307\105\0\1\5\75\0\2\150"+
    "\2\0\2\150\1\310\75\150\21\0\4\304\6\0\17\74"+
    "\1\0\31\74\15\0\1\270\1\0\1\157\1\0\1\271"+
    "\3\272\6\0\6\240\11\74\1\0\2\74\6\240\21\74"+
    "\21\0\4\32\6\0\17\32\1\0\1\103\23\32\1\202"+
    "\3\32\1\103\1\0\4\311\100\0\4\312\77\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12104];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\5\1\2\11\1\1\1\11"+
    "\4\1\2\11\2\1\1\11\10\1\1\11\21\1\1\0"+
    "\1\11\1\0\2\1\2\0\2\1\1\0\10\1\2\0"+
    "\40\1\1\0\1\1\1\0\1\1\1\0\1\1\2\0"+
    "\1\1\1\0\4\1\1\0\5\1\1\11\1\0\16\1"+
    "\1\0\12\1\1\0\1\1\1\11\2\0\4\1\1\0"+
    "\16\1\2\0\1\1\1\0\3\1\1\0\1\1\1\0"+
    "\1\1\1\0\6\1\1\0\1\1\2\0\4\1\1\0"+
    "\1\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[202];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private ArrayList<Token> listaDeToken = new ArrayList<Token>();
    private int contadorDeIdentacion = 0;
    private int nivelDeIdentado = 0;
    private boolean bloqueValido = false;
    private Stack<Integer> pilaDeIdentado = new Stack<Integer>();

    public String getReviewString() {
        String result = "";
        for (Token token : listaDeToken)
            result += token.toString() + "\n";
        return result;
    }

    private TipoDeToken nuevoToken(String lexema, TipoDeToken token) {
        try {
            listaDeToken.add(new Token(lexema, token.toString(), yyline));
            return token;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return TipoDeToken.INVALIDO;
        }
    }

    private TipoDeToken verificarIdentacion(String lexema, int linea) {

        if(lexema == "ESPACIO_ESPECIAL"){
            System.out.println(" IDENT");
        }else if(lexema == "ESPACIO_ESPECIAL_DOS"){
            System.out.println(" IDENT IDENT");
        }else{
            System.out.println("DEDENT");
        }

        /*for(char caracter : lexema.toCharArray()) {
            if (caracter == '\n') {
                //System.out.println("/n");
                contadorDeIdentacion = 0;
                nivelDeIdentado++;
                bloqueValido = true;
                pilaDeIdentado.push(contadorDeIdentacion + 4);
            } else if (caracter == ' ') {
                contadorDeIdentacion++;
                //System.out.println("esp-");
            } else {
                bloqueValido = false;
            }

            try {
                if (bloqueValido && nivelDeIdentado != 0) {
                    if (contadorDeIdentacion >= (pilaDeIdentado.lastElement())) {
                        listaDeToken.add(new Token("__", TipoDeToken.INDENT.toString(), linea));
                        pilaDeIdentado.push(contadorDeIdentacion + 3);
                        return TipoDeToken.INDENT;
                    }
                }
            } catch (IllegalArgumentException e) {
                return TipoDeToken.INVALIDO;
            }
        }*/

        return null;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
      System.out.println("DEDENT");
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TipoDeToken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return nuevoToken("", TipoDeToken.BAD_ERROR);
            }
            // fall through
          case 19: break;
          case 2:
            { /*         IGNORE        */
            }
            // fall through
          case 20: break;
          case 3:
            { return nuevoToken(yytext(), TipoDeToken.OPERACION);
            }
            // fall through
          case 21: break;
          case 4:
            { return nuevoToken(yytext(), TipoDeToken.PARENTESIS_ABRE);
            }
            // fall through
          case 22: break;
          case 5:
            { return nuevoToken(yytext(), TipoDeToken.PARENTESIS_CIERRA);
            }
            // fall through
          case 23: break;
          case 6:
            { return nuevoToken(yytext(), TipoDeToken.COMA);
            }
            // fall through
          case 24: break;
          case 7:
            { return nuevoToken(yytext(), TipoDeToken.PUNTUADO);
            }
            // fall through
          case 25: break;
          case 8:
            { return nuevoToken(yytext(), TipoDeToken.LITERAL);
            }
            // fall through
          case 26: break;
          case 9:
            { return nuevoToken(yytext(), TipoDeToken.DOS_PUNTOS);
            }
            // fall through
          case 27: break;
          case 10:
            { return nuevoToken(yytext(), TipoDeToken.IDENTIFICADOR);
            }
            // fall through
          case 28: break;
          case 11:
            { return nuevoToken(yytext(), TipoDeToken.DELIMITADOR);
            }
            // fall through
          case 29: break;
          case 12:
            { return nuevoToken(yytext(), TipoDeToken.CARACTER_INVALIDO);
            }
            // fall through
          case 30: break;
          case 13:
            { verificarIdentacion("SALTO_NORMAL", yyline);
            }
            // fall through
          case 31: break;
          case 14:
            { return nuevoToken(yytext(), TipoDeToken.ERROR_LITERAL);
            }
            // fall through
          case 32: break;
          case 15:
            { return nuevoToken(yytext(), TipoDeToken.ERROR_IDENTIFICADOR);
            }
            // fall through
          case 33: break;
          case 16:
            { return nuevoToken(yytext(), TipoDeToken.RESERVADA);
            }
            // fall through
          case 34: break;
          case 17:
            { verificarIdentacion("ESPACIO_ESPECIAL", yyline);
            }
            // fall through
          case 35: break;
          case 18:
            { verificarIdentacion("ESPACIO_ESPECIAL_DOS", yyline);
            }
            // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
