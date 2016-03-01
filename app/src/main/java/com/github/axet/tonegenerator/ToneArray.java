package com.github.axet.tonegenerator;

public class ToneArray {
    public static Tone[] tones = new Tone[]{
            new Tone(0, "TONE_DTMF_0", "\n" +
                    "DTMF tone for key 0: 1336Hz, 941Hz, continuous</p>\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(1, "TONE_DTMF_1", "\n" +
                    "DTMF tone for key 1: 1209Hz, 697Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(2, "TONE_DTMF_2", "\n" +
                    "DTMF tone for key 2: 1336Hz, 697Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(3, "TONE_DTMF_3", "\n" +
                    "DTMF tone for key 3: 1477Hz, 697Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(4, "TONE_DTMF_4", "\n" +
                    "DTMF tone for key 4: 1209Hz, 770Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(5, "TONE_DTMF_5", "\n" +
                    "DTMF tone for key 5: 1336Hz, 770Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(6, "TONE_DTMF_6", "\n" +
                    "DTMF tone for key 6: 1477Hz, 770Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(7, "TONE_DTMF_7", "\n" +
                    "DTMF tone for key 7: 1209Hz, 852Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(8, "TONE_DTMF_8", "\n" +
                    "DTMF tone for key 8: 1336Hz, 852Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(9, "TONE_DTMF_9", "\n" +
                    "DTMF tone for key 9: 1477Hz, 852Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(10, "TONE_DTMF_S", "\n" +
                    "DTMF tone for key *: 1209Hz, 941Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(11, "TONE_DTMF_P", "\n" +
                    "DTMF tone for key #: 1477Hz, 941Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(12, "TONE_DTMF_A", "\n" +
                    "DTMF tone for key A: 1633Hz, 697Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(13, "TONE_DTMF_B", "\n" +
                    "DTMF tone for key B: 1633Hz, 770Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(14, "TONE_DTMF_C", "\n" +
                    "DTMF tone for key C: 1633Hz, 852Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(15, "TONE_DTMF_D", "\n" +
                    "DTMF tone for key D: 1633Hz, 941Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(16, "TONE_SUP_DIAL", "\n" +
                    "Call supervisory tone, Dial tone:\n" +
                    "CEPT:           425Hz, continuous\n" +
                    "ANSI (IS-95):   350Hz+440Hz, continuous\n" +
                    "JAPAN:          400Hz, continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(17, "TONE_SUP_BUSY", "\n" +
                    "Call supervisory tone, Busy:\n" +
                    "CEPT:           425Hz, 500ms ON, 500ms OFF...\n" +
                    "ANSI (IS-95):   480Hz+620Hz, 500ms ON, 500ms OFF...\n" +
                    "JAPAN:          400Hz, 500ms ON, 500ms OFF...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(18, "TONE_SUP_CONGESTION", "\n" +
                    "Call supervisory tone, Congestion:\n" +
                    "CEPT, JAPAN:    425Hz, 200ms ON, 200ms OFF...\n" +
                    "ANSI (IS-95):   480Hz+620Hz, 250ms ON, 250ms OFF...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(19, "TONE_SUP_RADIO_ACK", "\n" +
                    "Call supervisory tone, Radio path acknowlegment :\n" +
                    "CEPT, ANSI:    425Hz, 200ms ON\n" +
                    "JAPAN:         400Hz, 1s ON, 2s OFF...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(20, "TONE_SUP_RADIO_NOTAVAIL", "\n" +
                    "Call supervisory tone, Radio path not available: 425Hz, 200ms ON, 200 OFF 3 bursts\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(21, "TONE_SUP_ERROR", "\n" +
                    "Call supervisory tone, Error/Special info: 950Hz+1400Hz+1800Hz, 330ms ON, 1s OFF...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(22, "TONE_SUP_CALL_WAITING", "\n" +
                    "Call supervisory tone, Call Waiting:\n" +
                    "CEPT, JAPAN:    425Hz, 200ms ON, 600ms OFF, 200ms ON, 3s OFF...\n" +
                    "ANSI (IS-95):   440 Hz, 300 ms ON, 9.7 s OFF,\n" +
                    "(100 ms ON, 100 ms OFF, 100 ms ON, 9.7s OFF ...)\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(23, "TONE_SUP_RINGTONE", "\n" +
                    "Call supervisory tone, Ring Tone:\n" +
                    "CEPT, JAPAN:    425Hz, 1s ON, 4s OFF...\n" +
                    "ANSI (IS-95):   440Hz + 480Hz, 2s ON, 4s OFF...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(24, "TONE_PROP_BEEP", "\n" +
                    "Proprietary tone, general beep: 400Hz+1200Hz, 35ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(25, "TONE_PROP_ACK", "\n" +
                    "Proprietary tone, positive acknowlegement: 1200Hz, 100ms ON, 100ms OFF 2 bursts\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(26, "TONE_PROP_NACK", "\n" +
                    "Proprietary tone, negative acknowlegement: 300Hz+400Hz+500Hz, 400ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(27, "TONE_PROP_PROMPT", "\n" +
                    "Proprietary tone, prompt tone: 400Hz+1200Hz, 200ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(28, "TONE_PROP_BEEP2", "\n" +
                    "Proprietary tone, general double beep: twice 400Hz+1200Hz, 35ms ON, 200ms OFF, 35ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(29, "TONE_SUP_INTERCEPT", "\n" +
                    "Call supervisory tone (IS-95), intercept tone: alternating 440 Hz and 620 Hz tones,\n" +
                    "each on for 250 ms\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(30, "TONE_SUP_INTERCEPT_ABBREV", "\n" +
                    "Call supervisory tone (IS-95), abbreviated intercept: intercept tone limited to 4 seconds\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(31, "TONE_SUP_CONGESTION_ABBREV", "\n" +
                    "Call supervisory tone (IS-95), abbreviated congestion: congestion tone limited to 4 seconds\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(32, "TONE_SUP_CONFIRM", "\n" +
                    "Call supervisory tone (IS-95), confirm tone: a 350 Hz tone added to a 440 Hz tone\n" +
                    "repeated 3 times in a 100 ms on, 100 ms off cycle\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(33, "TONE_SUP_PIP", "\n" +
                    "Call supervisory tone (IS-95), pip tone: four bursts of 480 Hz tone (0.1 s on, 0.1 s off).\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(34, "TONE_CDMA_DIAL_TONE_LITE", "\n" +
                    "CDMA Dial tone : 425Hz  continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(35, "TONE_CDMA_NETWORK_USA_RINGBACK", "\n" +
                    "CDMA USA Ringback: 440Hz+480Hz 2s ON, 4000 OFF ...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(36, "TONE_CDMA_INTERCEPT", "\n" +
                    "CDMA Intercept tone: 440Hz 250ms ON, 620Hz 250ms ON ...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(37, "TONE_CDMA_ABBR_INTERCEPT", "\n" +
                    "CDMA Abbr Intercept tone: 440Hz 250ms ON, 620Hz 250ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(38, "TONE_CDMA_REORDER", "\n" +
                    "CDMA Reorder tone: 480Hz+620Hz 250ms ON, 250ms OFF...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(39, "TONE_CDMA_ABBR_REORDER", "\n" +
                    "\n" +
                    "CDMA Abbr Reorder tone: 480Hz+620Hz 250ms ON, 250ms OFF repeated for 8 times\n" +
                    "\n" +
                    "\n"),
            new Tone(40, "TONE_CDMA_NETWORK_BUSY", "\n" +
                    "CDMA Network Busy tone: 480Hz+620Hz 500ms ON, 500ms OFF continuous\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(41, "TONE_CDMA_CONFIRM", "\n" +
                    "CDMA Confirm tone: 350Hz+440Hz 100ms ON, 100ms OFF repeated for 3 times\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(42, "TONE_CDMA_ANSWER", "\n" +
                    "\n" +
                    "CDMA answer tone: silent tone - defintion Frequency 0, 0ms ON, 0ms OFF\n" +
                    "\n" +
                    "\n"),
            new Tone(43, "TONE_CDMA_NETWORK_CALLWAITING", "\n" +
                    "\n" +
                    "CDMA Network Callwaiting tone: 440Hz 300ms ON\n" +
                    "\n" +
                    "\n"),
            new Tone(44, "TONE_CDMA_PIP", "\n" +
                    "CDMA PIP tone: 480Hz 100ms ON, 100ms OFF repeated for 4 times\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(45, "TONE_CDMA_CALL_SIGNAL_ISDN_NORMAL", "\n" +
                    "ISDN Call Signal Normal tone: {2091Hz 32ms ON, 2556 64ms ON} 20 times,\n" +
                    "2091 32ms ON, 2556 48ms ON, 4s OFF\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(46, "TONE_CDMA_CALL_SIGNAL_ISDN_INTERGROUP", "\n" +
                    "ISDN Call Signal Intergroup tone: {2091Hz 32ms ON, 2556 64ms ON} 8 times,\n" +
                    "2091Hz 32ms ON, 400ms OFF, {2091Hz 32ms ON, 2556Hz 64ms ON} times,\n" +
                    "2091Hz 32ms ON, 4s OFF.\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(47, "TONE_CDMA_CALL_SIGNAL_ISDN_SP_PRI", "\n" +
                    "ISDN Call Signal SP PRI tone:{2091Hz 32ms ON, 2556 64ms ON} 4 times\n" +
                    "2091Hz 16ms ON, 200ms OFF, {2091Hz 32ms ON, 2556Hz 64ms ON} 4 times,\n" +
                    "2091Hz 16ms ON, 200ms OFF\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(48, "TONE_CDMA_CALL_SIGNAL_ISDN_PAT3", "\n" +
                    "ISDN Call sign PAT3 tone: silent tone\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(49, "TONE_CDMA_CALL_SIGNAL_ISDN_PING_RING", "\n" +
                    "ISDN Ping Ring tone: {2091Hz 32ms ON, 2556Hz 64ms ON} 5 times\n" +
                    "2091Hz 20ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(50, "TONE_CDMA_CALL_SIGNAL_ISDN_PAT5", "\n" +
                    "\n" +
                    "ISDN Pat5 tone: silent tone\n" +
                    "\n" +
                    "\n"),
            new Tone(51, "TONE_CDMA_CALL_SIGNAL_ISDN_PAT6", "\n" +
                    "\n" +
                    "ISDN Pat6 tone: silent tone\n" +
                    "\n" +
                    "\n"),
            new Tone(52, "TONE_CDMA_CALL_SIGNAL_ISDN_PAT7", "\n" +
                    "ISDN Pat7 tone: silent tone\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(53, "TONE_CDMA_HIGH_L", "\n" +
                    "TONE_CDMA_HIGH_L tone: {3700Hz 25ms, 4000Hz 25ms} 40 times\n" +
                    "4000ms OFF, Repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(54, "TONE_CDMA_MED_L", "\n" +
                    "TONE_CDMA_MED_L tone: {2600Hz 25ms, 2900Hz 25ms} 40 times\n" +
                    "4000ms OFF, Repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(55, "TONE_CDMA_LOW_L", "\n" +
                    "TONE_CDMA_LOW_L tone: {1300Hz 25ms, 1450Hz 25ms} 40 times,\n" +
                    "4000ms OFF, Repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(56, "TONE_CDMA_HIGH_SS", "\n" +
                    "CDMA HIGH SS tone: {3700Hz 25ms, 4000Hz 25ms} repeat 16 times,\n" +
                    "400ms OFF, repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(57, "TONE_CDMA_MED_SS", "\n" +
                    "CDMA MED SS tone: {2600Hz 25ms, 2900Hz 25ms} repeat 16 times,\n" +
                    "400ms OFF, repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(58, "TONE_CDMA_LOW_SS", "\n" +
                    "CDMA LOW SS tone: {1300z 25ms, 1450Hz 25ms} repeat 16 times,\n" +
                    "400ms OFF, repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(59, "TONE_CDMA_HIGH_SSL", "\n" +
                    "CDMA HIGH SSL tone: {3700Hz 25ms, 4000Hz 25ms} 8 times,\n" +
                    "200ms OFF, {3700Hz 25ms, 4000Hz 25ms} repeat 8 times,\n" +
                    "200ms OFF, {3700Hz 25ms, 4000Hz 25ms} repeat 16 times,\n" +
                    "4000ms OFF, repeat ...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(60, "TONE_CDMA_MED_SSL", "\n" +
                    "CDMA MED SSL tone: {2600Hz 25ms, 2900Hz 25ms} 8 times,\n" +
                    "200ms OFF, {2600Hz 25ms, 2900Hz 25ms} repeat 8 times,\n" +
                    "200ms OFF, {2600Hz 25ms, 2900Hz 25ms} repeat 16 times,\n" +
                    "4000ms OFF, repeat ...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(61, "TONE_CDMA_LOW_SSL", "\n" +
                    "CDMA LOW SSL tone: {1300Hz 25ms, 1450Hz 25ms} 8 times,\n" +
                    "200ms OFF, {1300Hz 25ms, 1450Hz 25ms} repeat 8 times,\n" +
                    "200ms OFF, {1300Hz 25ms, 1450Hz 25ms} repeat 16 times,\n" +
                    "4000ms OFF, repeat ...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(62, "TONE_CDMA_HIGH_SS_2", "\n" +
                    "CDMA HIGH SS2 tone: {3700Hz 25ms, 4000Hz 25ms} 20 times,\n" +
                    "1000ms OFF, {3700Hz 25ms, 4000Hz 25ms} 20 times,\n" +
                    "3000ms OFF, repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(63, "TONE_CDMA_MED_SS_2", "\n" +
                    "CDMA MED SS2 tone: {2600Hz 25ms, 2900Hz 25ms} 20 times,\n" +
                    "1000ms OFF, {2600Hz 25ms, 2900Hz 25ms} 20 times,\n" +
                    "3000ms OFF, repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(64, "TONE_CDMA_LOW_SS_2", "\n" +
                    "CDMA LOW SS2 tone: {1300Hz 25ms, 1450Hz 25ms} 20 times,\n" +
                    "1000ms OFF, {1300Hz 25ms, 1450Hz 25ms} 20 times,\n" +
                    "3000ms OFF, repeat ....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(65, "TONE_CDMA_HIGH_SLS", "\n" +
                    "CDMA HIGH SLS tone: {3700Hz 25ms, 4000Hz 25ms} 10 times,\n" +
                    "500ms OFF, {3700Hz 25ms, 4000Hz 25ms} 20 times, 500ms OFF,\n" +
                    "{3700Hz 25ms, 4000Hz 25ms} 10 times, 3000ms OFF, REPEAT\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(66, "TONE_CDMA_MED_SLS", "\n" +
                    "CDMA MED  SLS tone: {2600Hz 25ms, 2900Hz 25ms} 10 times,\n" +
                    "500ms OFF, {2600Hz 25ms, 2900Hz 25ms} 20 times, 500ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 10 times, 3000ms OFF, REPEAT\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(67, "TONE_CDMA_LOW_SLS", "\n" +
                    "CDMA LOW SLS tone: {1300Hz 25ms, 1450Hz 25ms} 10 times,\n" +
                    "500ms OFF, {1300Hz 25ms, 1450Hz 25ms} 20 times, 500ms OFF,\n" +
                    "{1300Hz 25ms, 1450Hz 25ms} 10 times, 3000ms OFF, REPEAT\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(68, "TONE_CDMA_HIGH_S_X4", "\n" +
                    "CDMA HIGH S X4 tone: {3700Hz 25ms, 4000Hz 25ms} 10 times,\n" +
                    "500ms OFF, {3700Hz 25ms, 4000Hz 25ms} 10 times, 500ms OFF,\n" +
                    "{3700Hz 25ms, 4000Hz 25ms} 10 times, 500ms OFF,\n" +
                    "{3700Hz 25ms, 4000Hz 25ms} 10 times, 2500ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(69, "TONE_CDMA_MED_S_X4", "\n" +
                    "CDMA MED S X4 tone: {2600Hz 25ms, 2900Hz 25ms} 10 times,\n" +
                    "500ms OFF, {2600Hz 25ms, 2900Hz 25ms} 10 times, 500ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 10 times, 500ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 10 times, 2500ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(70, "TONE_CDMA_LOW_S_X4", "\n" +
                    "CDMA LOW  S X4 tone: {2600Hz 25ms, 2900Hz 25ms} 10 times,\n" +
                    "500ms OFF, {2600Hz 25ms, 2900Hz 25ms} 10 times, 500ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 10 times, 500ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 10 times, 2500ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(71, "TONE_CDMA_HIGH_PBX_L", "\n" +
                    "CDMA HIGH PBX L: {3700Hz 25ms, 4000Hz 25ms}20 times,\n" +
                    "2000ms OFF,  REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(72, "TONE_CDMA_MED_PBX_L", "\n" +
                    "CDMA MED PBX L: {2600Hz 25ms, 2900Hz 25ms}20 times,\n" +
                    "2000ms OFF,  REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(73, "TONE_CDMA_LOW_PBX_L", "\n" +
                    "CDMA LOW PBX L: {1300Hz 25ms,1450Hz 25ms}20 times,\n" +
                    "2000ms OFF,  REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(74, "TONE_CDMA_HIGH_PBX_SS", "\n" +
                    "CDMA HIGH PBX SS tone: {3700Hz 25ms, 4000Hz 25ms} 8 times\n" +
                    "200 ms OFF, {3700Hz 25ms 4000Hz 25ms}8 times,\n" +
                    "2000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(75, "TONE_CDMA_MED_PBX_SS", "\n" +
                    "CDMA MED PBX SS tone: {2600Hz 25ms, 2900Hz 25ms} 8 times\n" +
                    "200 ms OFF, {2600Hz 25ms 2900Hz 25ms}8 times,\n" +
                    "2000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(76, "TONE_CDMA_LOW_PBX_SS", "\n" +
                    "CDMA LOW PBX SS tone: {1300Hz 25ms, 1450Hz 25ms} 8 times\n" +
                    "200 ms OFF, {1300Hz 25ms 1450Hz 25ms}8 times,\n" +
                    "2000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(77, "TONE_CDMA_HIGH_PBX_SSL", "\n" +
                    "CDMA HIGH PBX SSL tone:{3700Hz 25ms, 4000Hz 25ms} 8 times\n" +
                    "200ms OFF, {3700Hz 25ms, 4000Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{3700Hz 25ms, 4000Hz 25ms} 16 times, 1000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(78, "TONE_CDMA_MED_PBX_SSL", "\n" +
                    "CDMA MED PBX SSL tone:{2600Hz 25ms, 2900Hz 25ms} 8 times\n" +
                    "200ms OFF, {2600Hz 25ms, 2900Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 16 times, 1000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(79, "TONE_CDMA_LOW_PBX_SSL", "\n" +
                    "CDMA LOW PBX SSL tone:{1300Hz 25ms, 1450Hz 25ms} 8 times\n" +
                    "200ms OFF, {1300Hz 25ms, 1450Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{1300Hz 25ms, 1450Hz 25ms} 16 times, 1000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(80, "TONE_CDMA_HIGH_PBX_SLS", "\n" +
                    "CDMA HIGH PBX SSL tone:{3700Hz 25ms, 4000Hz 25ms} 8 times\n" +
                    "200ms OFF, {3700Hz 25ms, 4000Hz 25ms} 16 times, 200ms OFF,\n" +
                    "{3700Hz 25ms, 4000Hz 25ms} 8 times, 1000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(81, "TONE_CDMA_MED_PBX_SLS", "\n" +
                    "CDMA HIGH PBX SLS tone:{2600Hz 25ms, 2900Hz 25ms} 8 times\n" +
                    "200ms OFF, {2600Hz 25ms, 2900Hz 25ms} 16 times, 200ms OFF,\n" +
                    "{2600Hz 25ms, 2900Hz 25ms} 8 times, 1000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(82, "TONE_CDMA_LOW_PBX_SLS", "\n" +
                    "CDMA HIGH PBX SLS tone:{1300Hz 25ms, 1450Hz 25ms} 8 times\n" +
                    "200ms OFF, {1300Hz 25ms, 1450Hz 25ms} 16 times, 200ms OFF,\n" +
                    "{1300Hz 25ms, 1450Hz 25ms} 8 times, 1000ms OFF, REPEAT....\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(83, "TONE_CDMA_HIGH_PBX_S_X4", "\n" +
                    "CDMA HIGH PBX X S4 tone: {3700Hz 25ms 4000Hz 25ms} 8 times,\n" +
                    "200ms OFF, {3700Hz 25ms 4000Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{3700Hz 25ms 4000Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{3700Hz 25ms 4000Hz 25ms} 8 times, 800ms OFF, REPEAT...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(84, "TONE_CDMA_MED_PBX_S_X4", "\n" +
                    "CDMA MED PBX X S4 tone: {2600Hz 25ms 2900Hz 25ms} 8 times,\n" +
                    "200ms OFF, {2600Hz 25ms 2900Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{2600Hz 25ms 2900Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{2600Hz 25ms 2900Hz 25ms} 8 times, 800ms OFF, REPEAT...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(85, "TONE_CDMA_LOW_PBX_S_X4", "\n" +
                    "CDMA LOW PBX X S4 tone: {1300Hz 25ms 1450Hz 25ms} 8 times,\n" +
                    "200ms OFF, {1300Hz 25ms 1450Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{1300Hz 25ms 1450Hz 25ms} 8 times, 200ms OFF,\n" +
                    "{1300Hz 25ms 1450Hz 25ms} 8 times, 800ms OFF, REPEAT...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(86, "TONE_CDMA_ALERT_NETWORK_LITE", "\n" +
                    "CDMA Alert Network Lite tone: 1109Hz 62ms ON, 784Hz 62ms ON, 740Hz 62ms ON\n" +
                    "622Hz 62ms ON, 1109Hz 62ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(87, "TONE_CDMA_ALERT_AUTOREDIAL_LITE", "\n" +
                    "CDMA Alert Auto Redial tone: {1245Hz 62ms ON, 659Hz 62ms ON} 3 times,\n" +
                    "1245 62ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(88, "TONE_CDMA_ONE_MIN_BEEP", "\n" +
                    "CDMA One Min Beep tone: 1150Hz+770Hz 400ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(89, "TONE_CDMA_KEYPAD_VOLUME_KEY_LITE", "\n" +
                    "\n" +
                    "CDMA KEYPAD Volume key lite tone: 941Hz+1477Hz 120ms ON\n" +
                    "\n" +
                    "\n"),
            new Tone(90, "TONE_CDMA_PRESSHOLDKEY_LITE", "\n" +
                    "CDMA PRESSHOLDKEY LITE tone: 587Hz 375ms ON, 1175Hz 125ms ON\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(91, "TONE_CDMA_ALERT_INCALL_LITE", "\n" +
                    "CDMA ALERT INCALL LITE tone: 587Hz 62ms, 784 62ms, 831Hz 62ms,\n" +
                    "784Hz 62ms, 1109 62ms, 784Hz 62ms, 831Hz 62ms, 784Hz 62ms\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(92, "TONE_CDMA_EMERGENCY_RINGBACK", "\n" +
                    "CDMA EMERGENCY RINGBACK tone: {941Hz 125ms ON, 10ms OFF} 3times\n" +
                    "4990ms OFF, REPEAT...\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(93, "TONE_CDMA_ALERT_CALL_GUARD", "\n" +
                    "CDMA ALERT CALL GUARD tone: {1319Hz 125ms ON, 125ms OFF} 3 times\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(94, "TONE_CDMA_SOFT_ERROR_LITE", "\n" +
                    "CDMA SOFT ERROR LITE  tone: 1047Hz 125ms ON, 370Hz 125ms\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(95, "TONE_CDMA_CALLDROP_LITE", "\n" +
                    "CDMA CALLDROP LITE tone: 1480Hz 125ms, 1397Hz 125ms, 784Hz 125ms\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(96, "TONE_CDMA_NETWORK_BUSY_ONE_SHOT", "\n" +
                    "CDMA_NETWORK_BUSY_ONE_SHOT tone: 425Hz 500ms ON, 500ms OFF.\n" +
                    "\n" +
                    "\n" +
                    "\n"),
            new Tone(97, "TONE_CDMA_ABBR_ALERT", "\n" +
                    "CDMA_ABBR_ALERT tone: 1150Hz+770Hz 400ms ON\n" +
                    "\n" +
                    "\n"),
    };
}
