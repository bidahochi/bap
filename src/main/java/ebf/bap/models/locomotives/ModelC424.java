//

package ebf.bap.models.locomotives; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelC424 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelC424() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[342];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 85
		bodyModel[13] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 86
		bodyModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 87
		bodyModel[15] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 88
		bodyModel[16] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 116
		bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 48
		bodyModel[21] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 56
		bodyModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 64
		bodyModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 66
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 132
		bodyModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 133
		bodyModel[35] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 70
		bodyModel[36] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 115
		bodyModel[37] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 141
		bodyModel[38] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 141
		bodyModel[39] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 95
		bodyModel[40] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 29
		bodyModel[41] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 32
		bodyModel[42] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 117
		bodyModel[43] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 135
		bodyModel[44] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 205
		bodyModel[47] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 206
		bodyModel[48] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 406
		bodyModel[49] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 407
		bodyModel[50] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 408
		bodyModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 409
		bodyModel[52] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 410
		bodyModel[53] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 412
		bodyModel[54] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 413
		bodyModel[55] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 415
		bodyModel[56] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 416
		bodyModel[57] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 428
		bodyModel[58] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 314 door swing right
		bodyModel[59] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 315 door swing right
		bodyModel[60] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 448 headlight front nose
		bodyModel[61] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 449 headlight front nose
		bodyModel[62] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 451 ditchlight front nose
		bodyModel[63] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 454 ditchlight front nose
		bodyModel[64] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 455
		bodyModel[65] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 456
		bodyModel[66] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 457
		bodyModel[67] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 458
		bodyModel[68] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 4
		bodyModel[69] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 4
		bodyModel[70] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 4
		bodyModel[71] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 4
		bodyModel[72] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 446
		bodyModel[73] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 447
		bodyModel[74] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 448
		bodyModel[75] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 449
		bodyModel[76] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 467
		bodyModel[77] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 468
		bodyModel[78] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 469
		bodyModel[79] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 471
		bodyModel[80] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 472
		bodyModel[81] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 473
		bodyModel[82] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 474
		bodyModel[83] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 114
		bodyModel[84] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 74
		bodyModel[85] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 78
		bodyModel[86] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 875
		bodyModel[87] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 876
		bodyModel[88] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 877
		bodyModel[89] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 481
		bodyModel[90] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 482
		bodyModel[91] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 483
		bodyModel[92] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 484
		bodyModel[93] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 485
		bodyModel[94] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 486
		bodyModel[95] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 487
		bodyModel[96] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 488
		bodyModel[97] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 489
		bodyModel[98] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 490
		bodyModel[99] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 493 425 radiator compartment
		bodyModel[100] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 494
		bodyModel[101] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 496
		bodyModel[102] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 497
		bodyModel[103] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 498
		bodyModel[104] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 500
		bodyModel[105] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 501
		bodyModel[106] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 502
		bodyModel[107] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 503
		bodyModel[108] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 504
		bodyModel[109] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 155
		bodyModel[110] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 156
		bodyModel[111] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 157
		bodyModel[112] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 158
		bodyModel[113] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 159
		bodyModel[114] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 160
		bodyModel[115] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 161
		bodyModel[116] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 162 headlight rear V
		bodyModel[117] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 163 headlight rear V
		bodyModel[118] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 86 seccondary control bit
		bodyModel[119] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 87 main control bit
		bodyModel[120] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 86 radio control bit
		bodyModel[121] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 168
		bodyModel[122] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 169
		bodyModel[123] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 170
		bodyModel[124] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 174
		bodyModel[128] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 175
		bodyModel[129] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 178
		bodyModel[130] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 179
		bodyModel[131] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 180
		bodyModel[132] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 181
		bodyModel[133] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 182
		bodyModel[134] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 183
		bodyModel[135] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 184
		bodyModel[136] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 201
		bodyModel[137] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 202
		bodyModel[138] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 224
		bodyModel[139] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 225
		bodyModel[140] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 226
		bodyModel[141] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 228
		bodyModel[142] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 229
		bodyModel[143] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 230
		bodyModel[144] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 231
		bodyModel[145] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 230
		bodyModel[146] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 231
		bodyModel[147] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 232
		bodyModel[148] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 233
		bodyModel[149] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 234
		bodyModel[150] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 235
		bodyModel[151] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 236
		bodyModel[152] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 237
		bodyModel[153] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 238
		bodyModel[154] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 241
		bodyModel[155] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 242
		bodyModel[156] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 243
		bodyModel[157] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 244
		bodyModel[158] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 245
		bodyModel[159] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 246
		bodyModel[160] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 247
		bodyModel[161] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 248
		bodyModel[162] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 250
		bodyModel[163] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 251 425 radiator compartment
		bodyModel[164] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 253
		bodyModel[165] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 557
		bodyModel[166] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 560
		bodyModel[167] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 561
		bodyModel[168] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 562
		bodyModel[169] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 563
		bodyModel[170] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 564
		bodyModel[171] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 565
		bodyModel[172] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 566
		bodyModel[173] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 567
		bodyModel[174] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 568
		bodyModel[175] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 569
		bodyModel[176] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 570
		bodyModel[177] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 571
		bodyModel[178] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 572
		bodyModel[179] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 573
		bodyModel[180] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 675
		bodyModel[181] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 676
		bodyModel[182] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 677
		bodyModel[183] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 678
		bodyModel[184] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 679
		bodyModel[185] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 61
		bodyModel[186] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 682
		bodyModel[187] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 684
		bodyModel[188] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 685
		bodyModel[189] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 688
		bodyModel[190] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 690
		bodyModel[191] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 691
		bodyModel[192] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 693
		bodyModel[193] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 694
		bodyModel[194] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 695
		bodyModel[195] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 698 headlight front v
		bodyModel[196] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 699 headlight front v
		bodyModel[197] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 706
		bodyModel[198] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 708
		bodyModel[199] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 709
		bodyModel[200] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 710
		bodyModel[201] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 711
		bodyModel[202] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 713
		bodyModel[203] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 714
		bodyModel[204] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 721
		bodyModel[205] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 722
		bodyModel[206] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 723
		bodyModel[207] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 724
		bodyModel[208] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 299 nose cover
		bodyModel[209] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 432
		bodyModel[210] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 436
		bodyModel[211] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 439
		bodyModel[212] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 440
		bodyModel[213] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 441
		bodyModel[214] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 442
		bodyModel[215] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 443
		bodyModel[216] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 275
		bodyModel[217] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 276
		bodyModel[218] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 277 extra stacc
		bodyModel[219] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 278
		bodyModel[220] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 279
		bodyModel[221] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 280
		bodyModel[222] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 281
		bodyModel[223] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 282
		bodyModel[224] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 284 headlight front h
		bodyModel[225] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 285 headlight front h
		bodyModel[226] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 286
		bodyModel[227] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 287
		bodyModel[228] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 346 commander beacon
		bodyModel[229] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 347
		bodyModel[230] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 346 commander beacon
		bodyModel[231] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 347
		bodyModel[232] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 292
		bodyModel[233] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 293
		bodyModel[234] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 294
		bodyModel[235] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 295
		bodyModel[236] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 287
		bodyModel[237] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 298
		bodyModel[238] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // box64
		bodyModel[239] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // box65
		bodyModel[240] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 359 ditchlight front L
		bodyModel[241] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 360 cull
		bodyModel[242] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 272 ditchlight rear L
		bodyModel[243] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 273 cull
		bodyModel[244] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 275
		bodyModel[245] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 276
		bodyModel[246] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 277
		bodyModel[247] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 278
		bodyModel[248] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 279
		bodyModel[249] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 280
		bodyModel[250] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 281
		bodyModel[251] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 282
		bodyModel[252] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 117 liveryimg 2
		bodyModel[253] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 298 liveryimg 2
		bodyModel[254] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 117 liveryimg 2
		bodyModel[255] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 298 liveryimg 2
		bodyModel[256] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 301
		bodyModel[257] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 302
		bodyModel[258] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 303
		bodyModel[259] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 304
		bodyModel[260] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 305
		bodyModel[261] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 306
		bodyModel[262] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 307
		bodyModel[263] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 308
		bodyModel[264] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 309
		bodyModel[265] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 310
		bodyModel[266] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 311
		bodyModel[267] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 312
		bodyModel[268] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 313
		bodyModel[269] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 314
		bodyModel[270] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 315
		bodyModel[271] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 316
		bodyModel[272] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 317
		bodyModel[273] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 318
		bodyModel[274] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 319
		bodyModel[275] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 320 cull
		bodyModel[276] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 321 ditchlight front L
		bodyModel[277] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 322 cull
		bodyModel[278] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 323 ditchlight rear L
		bodyModel[279] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 324
		bodyModel[280] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 325
		bodyModel[281] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 326
		bodyModel[282] = new ModelRendererTurbo(this, 162, 61, textureX, textureY); // Box 327
		bodyModel[283] = new ModelRendererTurbo(this, 451, 33, textureX, textureY); // Box 328 commander beacon
		bodyModel[284] = new ModelRendererTurbo(this, 159, 83, textureX, textureY); // Box 298
		bodyModel[285] = new ModelRendererTurbo(this, 451, 27, textureX, textureY); // Box 299 commander beacon
		bodyModel[286] = new ModelRendererTurbo(this, 374, 114, textureX, textureY); // Box 3 cull
		bodyModel[287] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 5
		bodyModel[288] = new ModelRendererTurbo(this, 414, 113, textureX, textureY); // Box 304
		bodyModel[289] = new ModelRendererTurbo(this, 393, 120, textureX, textureY); // Box 311 cull
		bodyModel[290] = new ModelRendererTurbo(this, 189, 120, textureX, textureY); // Box 298 cull
		bodyModel[291] = new ModelRendererTurbo(this, 1, 116, textureX, textureY); // Box 493 424 radiator compartment
		bodyModel[292] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 129
		bodyModel[293] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 130
		bodyModel[294] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 132
		bodyModel[295] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 405
		bodyModel[296] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 417
		bodyModel[297] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 427
		bodyModel[298] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 705
		bodyModel[299] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 307
		bodyModel[300] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 308
		bodyModel[301] = new ModelRendererTurbo(this, 198, 119, textureX, textureY); // Box 309
		bodyModel[302] = new ModelRendererTurbo(this, 198, 119, textureX, textureY); // Box 310
		bodyModel[303] = new ModelRendererTurbo(this, 101, 125, textureX, textureY); // Box 299
		bodyModel[304] = new ModelRendererTurbo(this, 134, 134, textureX, textureY); // Box 300
		bodyModel[305] = new ModelRendererTurbo(this, 68, 115, textureX, textureY); // Box 301
		bodyModel[306] = new ModelRendererTurbo(this, 127, 134, textureX, textureY); // Box 302
		bodyModel[307] = new ModelRendererTurbo(this, 45, 142, textureX, textureY); // Box 303
		bodyModel[308] = new ModelRendererTurbo(this, 38, 138, textureX, textureY); // Box 304
		bodyModel[309] = new ModelRendererTurbo(this, 26, 138, textureX, textureY); // Box 305
		bodyModel[310] = new ModelRendererTurbo(this, 36, 144, textureX, textureY); // Box 306
		bodyModel[311] = new ModelRendererTurbo(this, 24, 144, textureX, textureY); // Box 307
		bodyModel[312] = new ModelRendererTurbo(this, 290, 99, textureX, textureY); // Box 308 headlight rear H
		bodyModel[313] = new ModelRendererTurbo(this, 298, 99, textureX, textureY); // Box 309 headlight rear H
		bodyModel[314] = new ModelRendererTurbo(this, 291, 106, textureX, textureY); // Box 310
		bodyModel[315] = new ModelRendererTurbo(this, 304, 107, textureX, textureY); // Box 311 liveryimg 2
		bodyModel[316] = new ModelRendererTurbo(this, 287, 105, textureX, textureY); // Box 312
		bodyModel[317] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 114
		bodyModel[318] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 74
		bodyModel[319] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 78
		bodyModel[320] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 245
		bodyModel[321] = new ModelRendererTurbo(this, 386, 107, textureX, textureY); // Box 317
		bodyModel[322] = new ModelRendererTurbo(this, 414, 120, textureX, textureY); // Box 318
		bodyModel[323] = new ModelRendererTurbo(this, 250, 69, textureX, textureY); // Box 319
		bodyModel[324] = new ModelRendererTurbo(this, 338, 30, textureX, textureY); // Box 320
		bodyModel[325] = new ModelRendererTurbo(this, 228, 117, textureX, textureY); // Box 321
		bodyModel[326] = new ModelRendererTurbo(this, 36, 49, textureX, textureY); // Box 322
		bodyModel[327] = new ModelRendererTurbo(this, 397, 85, textureX, textureY); // Box 323
		bodyModel[328] = new ModelRendererTurbo(this, 154, 137, textureX, textureY); // Box 252
		bodyModel[329] = new ModelRendererTurbo(this, 154, 143, textureX, textureY); // Box 190 ditchlight front u
		bodyModel[330] = new ModelRendererTurbo(this, 154, 143, textureX, textureY); // Box 446 ditchlight front u
		bodyModel[331] = new ModelRendererTurbo(this, 154, 137, textureX, textureY); // Box 447
		bodyModel[332] = new ModelRendererTurbo(this, 146, 137, textureX, textureY); // Box 252
		bodyModel[333] = new ModelRendererTurbo(this, 146, 143, textureX, textureY); // Box 190 ditchlight rear u
		bodyModel[334] = new ModelRendererTurbo(this, 146, 143, textureX, textureY); // Box 446 ditchlight rear u
		bodyModel[335] = new ModelRendererTurbo(this, 146, 137, textureX, textureY); // Box 447
		bodyModel[336] = new ModelRendererTurbo(this, 162, 137, textureX, textureY); // Box 364 prime base
		bodyModel[337] = new ModelRendererTurbo(this, 162, 141, textureX, textureY); // Box 6 PRIME1-1
		bodyModel[338] = new ModelRendererTurbo(this, 162, 141, textureX, textureY); // Box 7 PRIME1-3
		bodyModel[339] = new ModelRendererTurbo(this, 162, 141, textureX, textureY); // Box 8 PRIME1-2
		bodyModel[340] = new ModelRendererTurbo(this, 162, 141, textureX, textureY); // Box 9 PRIME1-4
		bodyModel[341] = new ModelRendererTurbo(this, 162, 144, textureX, textureY); // Box 344 cull

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43.5F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-40.5F, 2.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 52, 20, 14, 0F); // Box 2
		bodyModel[2].setRotationPoint(-16.5F, -21F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 69, 1, 4, 0F); // Box 0
		bodyModel[3].setRotationPoint(-34.5F, -1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(-39.5F, -1F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 6
		bodyModel[5].setRotationPoint(-39.51F, -1F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 8
		bodyModel[6].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 13
		bodyModel[7].setRotationPoint(-39.5F, 8F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 14
		bodyModel[8].setRotationPoint(-39.5F, 5.5F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 18
		bodyModel[9].setRotationPoint(-39.5F, 4.5F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 20
		bodyModel[10].setRotationPoint(-39.5F, 7F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 21
		bodyModel[11].setRotationPoint(-39.5F, 8F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 85
		bodyModel[12].setRotationPoint(-39.5F, 4.5F, 9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 86
		bodyModel[13].setRotationPoint(-39.5F, 5.5F, 9F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 87
		bodyModel[14].setRotationPoint(-39.5F, 7F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 88
		bodyModel[15].setRotationPoint(-39.5F, 8F, 9F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 116
		bodyModel[16].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[17].setRotationPoint(40.5F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(39.5F, 2.5F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 28
		bodyModel[19].setRotationPoint(-39.51F, 7F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 48
		bodyModel[20].setRotationPoint(39.51F, -1F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 49
		bodyModel[21].setRotationPoint(39.49F, 7F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 50
		bodyModel[22].setRotationPoint(39.5F, 8F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 79, 4, 14, 0F); // Box 52
		bodyModel[23].setRotationPoint(-39.5F, -1F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 9, 12, 14, 0F); // Box 25
		bodyModel[24].setRotationPoint(-36.5F, -13F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 56
		bodyModel[25].setRotationPoint(-37.5F, -13F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(-36.5F, -14F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-36.5F, -14F, 2F);

		bodyModel[28].addBox(0F, 0F, 0F, 10, 1, 4, 0F); // Box 28
		bodyModel[28].setRotationPoint(-37.5F, -14F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[29].setRotationPoint(-37.5F, -14F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		bodyModel[30].setRotationPoint(-37.5F, -14F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[31].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[32].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[33].setRotationPoint(-41.5F, 6F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[34].setRotationPoint(-41.5F, 6F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 5, 22, 0F); // Box 70
		bodyModel[35].setRotationPoint(-33.5F, -6F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[36].setRotationPoint(-37.5F, 5F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 141
		bodyModel[37].setRotationPoint(-39.5F, 3F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 141
		bodyModel[38].setRotationPoint(-37.5F, 3F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 95
		bodyModel[39].setRotationPoint(-28.5F, -6F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 29
		bodyModel[40].setRotationPoint(-27.5F, -18F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 32
		bodyModel[41].setRotationPoint(-27.5F, -18F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // Box 117
		bodyModel[42].setRotationPoint(19.5F, -21F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[43].setRotationPoint(-29.5F, -23F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(-28.5F, -23F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[45].setRotationPoint(-27.5F, -21F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 205
		bodyModel[46].setRotationPoint(-39.5F, -1F, 7F);

		bodyModel[47].addBox(0F, 0F, 0F, 69, 1, 4, 0F); // Box 206
		bodyModel[47].setRotationPoint(-34.5F, -1F, 7F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 406
		bodyModel[48].setRotationPoint(-17.5F, -18F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 407
		bodyModel[49].setRotationPoint(-17.5F, -20F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 408
		bodyModel[50].setRotationPoint(-17.5F, -22F, -3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 409
		bodyModel[51].setRotationPoint(-17.5F, -21F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 410
		bodyModel[52].setRotationPoint(-17.5F, -23F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[53].setRotationPoint(-17.5F, -21F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[54].setRotationPoint(-28.5F, -21F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 415
		bodyModel[55].setRotationPoint(-17.5F, -23F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[56].setRotationPoint(-17.5F, -21F, 8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 428
		bodyModel[57].setRotationPoint(-28.5F, -20F, -10F);

		bodyModel[58].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[58].setRotationPoint(-17F, -18F, 10.5F);

		bodyModel[59].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[59].setRotationPoint(-28F, -18F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 448 headlight front nose
		bodyModel[60].setRotationPoint(-38F, -13F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 449 headlight front nose
		bodyModel[61].setRotationPoint(-38F, -11F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 451 ditchlight front nose
		bodyModel[62].setRotationPoint(-38F, -7F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 454 ditchlight front nose
		bodyModel[63].setRotationPoint(-38F, -7F, 4F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 455
		bodyModel[64].setRotationPoint(-41.5F, -1F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[65].setRotationPoint(-41.5F, -1F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 457
		bodyModel[66].setRotationPoint(-41.5F, -1F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 458
		bodyModel[67].setRotationPoint(-41.5F, 0F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[68].setRotationPoint(-42.5F, 6F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[69].setRotationPoint(-42.5F, 7F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[70].setRotationPoint(-42.5F, 6F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[71].setRotationPoint(-42.5F, 7F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[72].setRotationPoint(-43F, 3F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[73].setRotationPoint(-42.5F, 3F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[74].setRotationPoint(-42.5F, 4F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[75].setRotationPoint(-42.5F, 4F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 467
		bodyModel[76].setRotationPoint(39.5F, -1F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 468
		bodyModel[77].setRotationPoint(39.5F, 0F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 469
		bodyModel[78].setRotationPoint(40.5F, -1F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 471
		bodyModel[79].setRotationPoint(34.5F, -1F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 472
		bodyModel[80].setRotationPoint(34.5F, -1F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[81].setRotationPoint(34.5F, -1F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[82].setRotationPoint(34.5F, -1F, 9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[83].setRotationPoint(-33F, -21.25F, -0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[84].setRotationPoint(-33F, -22.25F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[85].setRotationPoint(-32.75F, -20.75F, -0.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[86].setRotationPoint(-33F, -22.5F, -1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[87].setRotationPoint(-33F, -22.5F, 1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[88].setRotationPoint(-32.75F, -22.75F, -1.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 481
		bodyModel[89].setRotationPoint(-33F, -22.5F, -1F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 482
		bodyModel[90].setRotationPoint(-32.5F, -23.5F, -0.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 483
		bodyModel[91].setRotationPoint(-33.5F, -24.5F, -0.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 484
		bodyModel[92].setRotationPoint(-33.5F, -24F, -1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[93].setRotationPoint(-32.5F, -24F, 0.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[94].setRotationPoint(-30.5F, -24.25F, 1.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 487
		bodyModel[95].setRotationPoint(-30.5F, -24.75F, 2.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 488
		bodyModel[96].setRotationPoint(-29.5F, -24.25F, 3.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 489
		bodyModel[97].setRotationPoint(-29.5F, -23.75F, 2.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 490
		bodyModel[98].setRotationPoint(35.5F, -16F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 16, 4, 16, 0F); // Box 493 425 radiator compartment
		bodyModel[99].setRotationPoint(19.5F, -18F, -8F);

		bodyModel[100].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // Box 494
		bodyModel[100].setRotationPoint(19.5F, -21F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[101].setRotationPoint(-16.5F, -22F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[102].setRotationPoint(-16.5F, -22F, 2F);

		bodyModel[103].addBox(0F, 0F, 0F, 36, 1, 4, 0F); // Box 498
		bodyModel[103].setRotationPoint(-16.5F, -22F, -2F);

		bodyModel[104].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 500
		bodyModel[104].setRotationPoint(19.5F, -22.5F, -2F);

		bodyModel[105].addBox(0F, 0F, 0F, 16, 2, 6, 0F); // Box 501
		bodyModel[105].setRotationPoint(-6.5F, -23F, -3F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 502
		bodyModel[106].setRotationPoint(35.5F, -22F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[107].setRotationPoint(35.5F, -21F, 1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 15, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
		bodyModel[108].setRotationPoint(36.5F, -16F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[109].setRotationPoint(35.5F, -22F, 1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[110].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[111].setRotationPoint(35.5F, -22F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[112].setRotationPoint(35.5F, -17F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[113].setRotationPoint(35.5F, -17F, 1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[114].setRotationPoint(35.5F, -17F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[115].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 headlight rear V
		bodyModel[116].setRotationPoint(37F, -19F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 headlight rear V
		bodyModel[117].setRotationPoint(37F, -21F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 86 seccondary control bit
		bodyModel[118].setRotationPoint(-27.6F, -13F, -2F); //-5 to be centered
		bodyModel[118].rotateAngleY = -0.38397244F;

		bodyModel[119].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 87 main control bit
		bodyModel[119].setRotationPoint(-27.5F, -13F, -1F);//-4 to be centered

		bodyModel[120].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 86 radio control bit
		bodyModel[120].setRotationPoint(-25.5F, -15F, -2F);// -5 to be centered
		bodyModel[120].rotateAngleY = -0.38397244F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[121].setRotationPoint(39.5F, 6F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 169
		bodyModel[122].setRotationPoint(39.5F, 6F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 170
		bodyModel[123].setRotationPoint(39.5F, 7F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 171
		bodyModel[124].setRotationPoint(39.5F, 7F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[125].setRotationPoint(39.5F, 4F, 2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 173
		bodyModel[126].setRotationPoint(39.5F, 4F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 174
		bodyModel[127].setRotationPoint(40F, 3F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[128].setRotationPoint(39.5F, 3F, 2F);

		bodyModel[129].addBox(0F, 0F, 0F, 19, 6, 16, 0F); // Box 178
		bodyModel[129].setRotationPoint(-9.5F, 3F, -8F);

		bodyModel[130].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 179
		bodyModel[130].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 180
		bodyModel[131].setRotationPoint(-34.5F, 0F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 181
		bodyModel[132].setRotationPoint(-34.5F, 0F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 182
		bodyModel[133].setRotationPoint(-34.5F, 0F, 10F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 183
		bodyModel[134].setRotationPoint(33.5F, 0F, 7F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 184
		bodyModel[135].setRotationPoint(33.5F, 0F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[136].setRotationPoint(-24.5F, 3F, -2F);

		bodyModel[137].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 202
		bodyModel[137].setRotationPoint(0.5F, 3.5F, -7F);
		bodyModel[137].rotateAngleX = -0.26179939F;

		bodyModel[138].addBox(0F, 0F, 0F, 53, 8, 0, 0F); // Box 224
		bodyModel[138].setRotationPoint(-16.5F, -9F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 53, 8, 0, 0F); // Box 225
		bodyModel[139].setRotationPoint(-16.5F, -9F, 11F);

		bodyModel[140].addBox(0F, 0F, 0F, 0, 9, 6, 0F); // Box 226
		bodyModel[140].setRotationPoint(-41.5F, -10F, -3F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[141].setRotationPoint(-40.5F, -9F, -8F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 229
		bodyModel[142].setRotationPoint(-40.5F, -9F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 230
		bodyModel[143].setRotationPoint(-40.5F, -9F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[144].setRotationPoint(-40.5F, -9F, 3F);

		bodyModel[145].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 230
		bodyModel[145].setRotationPoint(-15.5F, -22.5F, -2F);

		bodyModel[146].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 231
		bodyModel[146].setRotationPoint(-15.5F, -22.5F, 2F);
		bodyModel[146].rotateAngleX = -0.19198622F;

		bodyModel[147].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 232
		bodyModel[147].setRotationPoint(-15.5F, -22.5F, -2F);
		bodyModel[147].rotateAngleX = 0.19198622F;

		bodyModel[148].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 233
		bodyModel[148].setRotationPoint(10.5F, -22.5F, -2F);

		bodyModel[149].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 234
		bodyModel[149].setRotationPoint(10.5F, -22.5F, -2F);
		bodyModel[149].rotateAngleX = 0.19198622F;

		bodyModel[150].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 235
		bodyModel[150].setRotationPoint(10.5F, -22.5F, 2F);
		bodyModel[150].rotateAngleX = -0.19198622F;

		bodyModel[151].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 236
		bodyModel[151].setRotationPoint(11F, -23F, -1.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 237
		bodyModel[152].setRotationPoint(0.5F, 3.5F, 7F);
		bodyModel[152].rotateAngleX = 0.26179939F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[153].setRotationPoint(-37.5F, -14.5F, -1F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[154].setRotationPoint(-28.5F, -22F, -10F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[155].setRotationPoint(-29.5F, -23F, -8F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 243
		bodyModel[156].setRotationPoint(-28.5F, -22.5F, -9F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 244
		bodyModel[157].setRotationPoint(-27.5F, -21F, -10F);
		bodyModel[157].rotateAngleX = 0.48869219F;

		bodyModel[158].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 245
		bodyModel[158].setRotationPoint(-24.5F, 1F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[159].setRotationPoint(-23.5F, 0F, -10F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 247
		bodyModel[160].setRotationPoint(-24.5F, 1F, 10F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 248
		bodyModel[161].setRotationPoint(20.5F, 1F, 10F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 250
		bodyModel[162].setRotationPoint(20.5F, 1F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 8, 1, 16, 0F); // Box 251 425 radiator compartment
		bodyModel[163].setRotationPoint(24.5F, -14F, -8F);

		bodyModel[164].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 253
		bodyModel[164].setRotationPoint(-31.5F, 0F, -10F);
		bodyModel[164].rotateAngleZ = -0.29670597F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 557
		bodyModel[165].setRotationPoint(-23.5F, 0F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 560
		bodyModel[166].setRotationPoint(-7F, 0F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 561
		bodyModel[167].setRotationPoint(-11F, 0F, 7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
		bodyModel[168].setRotationPoint(3F, 0F, 7F);

		bodyModel[169].addBox(0F, 0F, 0F, 5, 5, 22, 0F); // Box 563
		bodyModel[169].setRotationPoint(-16.5F, -6F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 564
		bodyModel[170].setRotationPoint(-9.5F, 5F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 565
		bodyModel[171].setRotationPoint(-0.5F, 5F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 566
		bodyModel[172].setRotationPoint(2.5F, 5F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 567
		bodyModel[173].setRotationPoint(6.5F, 5F, -10F);

		bodyModel[174].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 568
		bodyModel[174].setRotationPoint(6.5F, 3.5F, -7F);
		bodyModel[174].rotateAngleX = -0.26179939F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[175].setRotationPoint(-9.5F, 5F, 8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[176].setRotationPoint(-0.5F, 5F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[177].setRotationPoint(2.5F, 5F, 8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[178].setRotationPoint(6.5F, 5F, 8F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 573
		bodyModel[179].setRotationPoint(6.5F, 3.5F, 7F);
		bodyModel[179].rotateAngleX = 0.26179939F;

		bodyModel[180].addBox(0F, 0F, 0F, 0, 9, 6, 0F); // Box 675
		bodyModel[180].setRotationPoint(41.5F, -10F, -3F);

		bodyModel[181].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 676
		bodyModel[181].setRotationPoint(40.5F, -9F, -8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 677
		bodyModel[182].setRotationPoint(40.5F, -9F, -7F);

		bodyModel[183].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 678
		bodyModel[183].setRotationPoint(40.5F, -9F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[184].setRotationPoint(40.5F, -9F, 3F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[185].setRotationPoint(-39.5F, -3F, 10F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 682
		bodyModel[186].setRotationPoint(-39.5F, -3F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 684
		bodyModel[187].setRotationPoint(39.5F, -3F, 10F);

		bodyModel[188].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 685
		bodyModel[188].setRotationPoint(39.5F, -3F, -11F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 688
		bodyModel[189].setRotationPoint(-36.5F, -8F, 11F);

		bodyModel[190].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 690
		bodyModel[190].setRotationPoint(-33.5F, -14F, 11F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 691
		bodyModel[191].setRotationPoint(-36.5F, -8F, -11F);

		bodyModel[192].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 693
		bodyModel[192].setRotationPoint(-33.5F, -14F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 694
		bodyModel[193].setRotationPoint(-31.5F, -21F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[194].setRotationPoint(-31.5F, -21F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 698 headlight front v
		bodyModel[195].setRotationPoint(-31.5F, -21F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 699 headlight front v
		bodyModel[196].setRotationPoint(-31.5F, -23F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		bodyModel[197].setRotationPoint(-28.5F, -21F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
		bodyModel[198].setRotationPoint(-39.5F, -9F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
		bodyModel[199].setRotationPoint(-39.5F, -9F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 710
		bodyModel[200].setRotationPoint(39.5F, -9F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 711
		bodyModel[201].setRotationPoint(39.5F, -9F, 8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 713
		bodyModel[202].setRotationPoint(-34.5F, -14F, 11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 714
		bodyModel[203].setRotationPoint(-34.5F, -14F, -11F);

		bodyModel[204].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 721
		bodyModel[204].setRotationPoint(-16.5F, -14F, 11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 722
		bodyModel[205].setRotationPoint(-11.5F, -14F, 11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 723
		bodyModel[206].setRotationPoint(-11.5F, -14F, -11F);

		bodyModel[207].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 724
		bodyModel[207].setRotationPoint(-16.5F, -14F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.43F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[208].setRotationPoint(-31.5F, -23F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.05F, 0F, 0F); // Box 432
		bodyModel[209].setRotationPoint(-31F, -23F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-2F, -0.2F, 0F, 2F, -0.2F, 0F, -0.5F, 0F, 0F, 0.57F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.57F, 0F, 0F); // Box 436
		bodyModel[210].setRotationPoint(-30.5F, -22F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-2F, -1.2F, 0F, 1F, -1.2F, 0F, 1F, 0F, 0F, -0.285F, 0F, 0F, -2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.065F, 0F, -0.285F, 0.065F, 0F); // Box 439
		bodyModel[211].setRotationPoint(-30.5F, -23F, -7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.285F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F, -0.285F, 0.065F, 0F, 0F, 0.065F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F); // Box 440
		bodyModel[212].setRotationPoint(-30.5F, -23F, -3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.57F, 0F, 0F, -0.5F, 0F, 0F, 2F, -0.2F, 0F, -2F, -0.2F, 0F, 0.57F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 441
		bodyModel[213].setRotationPoint(-30.5F, -22F, 1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.285F, 0F, 0F, 1F, 0F, 0F, 1F, -1.2F, 0F, -2F, -1.2F, 0F, -0.285F, 0.065F, 0F, 1F, 0.065F, 0F, 1F, 0.2F, 0F, -2F, 0.2F, 0F); // Box 442
		bodyModel[214].setRotationPoint(-30.5F, -23F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.285F, 0F, 0F, 0.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0.065F, 0F, -0.285F, 0.065F, 0F); // Box 443
		bodyModel[215].setRotationPoint(-30.5F, -23F, 1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, -0.56F, 0F, 0F, -0.56F, 0F, 0F, -0.43F, 0F, 0F); // Box 275
		bodyModel[216].setRotationPoint(-31.5F, -23F, 0F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 276
		bodyModel[217].setRotationPoint(-36.5F, -9F, 11F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 277 extra stacc
		bodyModel[218].setRotationPoint(11F, -24F, -1.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[219].setRotationPoint(-28.5F, -20F, -11F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[220].setRotationPoint(-30.5F, -24.75F, -3.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 280
		bodyModel[221].setRotationPoint(-29.5F, -23.75F, -3.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 281
		bodyModel[222].setRotationPoint(-29.5F, -24.25F, -4.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 282
		bodyModel[223].setRotationPoint(-30.5F, -24.25F, -2.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight front h
		bodyModel[224].setRotationPoint(-31F, -21F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 headlight front h
		bodyModel[225].setRotationPoint(-31F, -21F, 0F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 286
		bodyModel[226].setRotationPoint(-30.5F, -21F, -2F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 287
		bodyModel[227].setRotationPoint(-29.5F, -22F, -4.5F);

		bodyModel[228].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 346 commander beacon
		bodyModel[228].setRotationPoint(-30F, -24F, 0.5F);

		bodyModel[229].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 347
		bodyModel[229].setRotationPoint(-29.85F, -24F, 0.5F);

		bodyModel[230].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 346 commander beacon
		bodyModel[230].setRotationPoint(-23F, -24F, 0.5F);

		bodyModel[231].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 347
		bodyModel[231].setRotationPoint(-22.85F, -24F, 0.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 292
		bodyModel[232].setRotationPoint(-29.5F, -23F, 7F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 293
		bodyModel[233].setRotationPoint(-28.5F, -22.5F, 8F);

		bodyModel[234].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 294
		bodyModel[234].setRotationPoint(-27.5F, -21F, 10F);
		bodyModel[234].rotateAngleX = -0.48869219F;

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[235].setRotationPoint(-28.5F, -22F, 9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[236].setRotationPoint(-24.5F, -23F, 6F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 298
		bodyModel[237].setRotationPoint(-20.5F, -25F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[238].setRotationPoint(-26.5F, -18F, 11F);
		bodyModel[238].rotateAngleX = 0.26179939F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[239].setRotationPoint(-26.5F, -18.25F, -11.97F);
		bodyModel[239].rotateAngleX = -0.26179939F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight front L
		bodyModel[240].setRotationPoint(-40.5F, 0F, -6.75F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
		bodyModel[241].setRotationPoint(-40.25F, 0F, -6.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 272 ditchlight rear L
		bodyModel[242].setRotationPoint(39.5F, 0F, -6.75F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 273 cull
		bodyModel[243].setRotationPoint(39.25F, 0F, -6.75F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 275
		bodyModel[244].setRotationPoint(35.5F, -1F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 276
		bodyModel[245].setRotationPoint(35.5F, -1F, 11F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 277
		bodyModel[246].setRotationPoint(-39.5F, 2F, -9F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 278
		bodyModel[247].setRotationPoint(-39.5F, 3F, -10F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 279
		bodyModel[248].setRotationPoint(-39.5F, 0.5F, -10F);

		bodyModel[249].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 280
		bodyModel[249].setRotationPoint(-39.5F, 2F, 9F);

		bodyModel[250].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 281
		bodyModel[250].setRotationPoint(-39.5F, 3F, 9F);

		bodyModel[251].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 282
		bodyModel[251].setRotationPoint(-39.5F, 0.5F, 9F);

		bodyModel[252].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[252].setRotationPoint(-28.75F, -20.5F, -6.5F);
		bodyModel[252].rotateAngleY = 0.40142573F;

		bodyModel[253].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 298 liveryimg 2
		bodyModel[253].setRotationPoint(-28.75F, -20.5F, 6.5F);
		bodyModel[253].rotateAngleY = -0.40142573F;

		bodyModel[254].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[254].setRotationPoint(37.35F, -19.5F, 1.5F);
		bodyModel[254].rotateAngleY = 0.31415927F;

		bodyModel[255].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 298 liveryimg 2
		bodyModel[255].setRotationPoint(37.35F, -19.5F, -1.5F);
		bodyModel[255].rotateAngleY = -0.31415927F;

		bodyModel[256].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 301
		bodyModel[256].setRotationPoint(35.5F, 7F, -9F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 302
		bodyModel[257].setRotationPoint(35.5F, 8F, -11F);

		bodyModel[258].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 303
		bodyModel[258].setRotationPoint(35.5F, 5.5F, -10F);

		bodyModel[259].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 304
		bodyModel[259].setRotationPoint(35.5F, 4.5F, -9F);

		bodyModel[260].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 305
		bodyModel[260].setRotationPoint(35.5F, 3F, -10F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 306
		bodyModel[261].setRotationPoint(35.5F, 2F, -9F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 307
		bodyModel[262].setRotationPoint(35.5F, 0.5F, -10F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 308
		bodyModel[263].setRotationPoint(35.5F, -1F, -11F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 309
		bodyModel[264].setRotationPoint(35.5F, 0.5F, 9F);

		bodyModel[265].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 310
		bodyModel[265].setRotationPoint(35.5F, 2F, 9F);

		bodyModel[266].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 311
		bodyModel[266].setRotationPoint(35.5F, 3F, 9F);

		bodyModel[267].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 312
		bodyModel[267].setRotationPoint(35.5F, 4.5F, 9F);

		bodyModel[268].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 313
		bodyModel[268].setRotationPoint(35.5F, 5.5F, 9F);

		bodyModel[269].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 314
		bodyModel[269].setRotationPoint(35.5F, 7F, 9F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 315
		bodyModel[270].setRotationPoint(35.5F, 8F, 9F);

		bodyModel[271].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 316
		bodyModel[271].setRotationPoint(35.5F, -1F, 9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[272].setRotationPoint(21.5F, 0F, -10F);

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
		bodyModel[273].setRotationPoint(20.5F, 3F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 319
		bodyModel[274].setRotationPoint(21.5F, 0F, 7F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
		bodyModel[275].setRotationPoint(-40.25F, 0F, 4.75F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 ditchlight front L
		bodyModel[276].setRotationPoint(-40.5F, 0F, 4.75F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 322 cull
		bodyModel[277].setRotationPoint(39.25F, 0F, 4.75F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 323 ditchlight rear L
		bodyModel[278].setRotationPoint(39.5F, 0F, 4.75F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 324
		bodyModel[279].setRotationPoint(35.5F, 5F, -3F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 325
		bodyModel[280].setRotationPoint(37.5F, 3F, -3F);

		bodyModel[281].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 326
		bodyModel[281].setRotationPoint(35.5F, 3F, -3F);

		bodyModel[282].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 327
		bodyModel[282].setRotationPoint(-17.84F, -24F, 0.5F);

		bodyModel[283].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 328 commander beacon
		bodyModel[283].setRotationPoint(-18F, -24F, 0.5F);

		bodyModel[284].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 298
		bodyModel[284].setRotationPoint(36.16F, -23F, 0.5F);

		bodyModel[285].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 299 commander beacon
		bodyModel[285].setRotationPoint(36F, -23F, 0.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[286].setRotationPoint(-25.5F, -17F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[287].setRotationPoint(-25.5F, -18F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[288].setRotationPoint(-25.5F, -18F, -13F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[289].setRotationPoint(-25.5F, -17F, -15F);

		bodyModel[290].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 298 cull
		bodyModel[290].setRotationPoint(-26.5F, -24F, -7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 493 424 radiator compartment
		bodyModel[291].setRotationPoint(19.5F, -18F, -8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[292].setRotationPoint(-27.5F, -21F, 8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[293].setRotationPoint(-28.5F, -20F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[294].setRotationPoint(-28.5F, -23F, 3F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 405
		bodyModel[295].setRotationPoint(-28.5F, -18F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[296].setRotationPoint(-28.5F, -21F, 8F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 427
		bodyModel[297].setRotationPoint(-28.5F, -20F, 7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[298].setRotationPoint(-28.5F, -21F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[299].setRotationPoint(39.5F, 6F, 0F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[300].setRotationPoint(39.5F, 6F, -8F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 309
		bodyModel[301].setRotationPoint(-41.5F, 9F, -9F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 310
		bodyModel[302].setRotationPoint(39.5F, 9F, -9F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 20, 10, 0F); // Box 299
		bodyModel[303].setRotationPoint(36.5F, -21F, -5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[304].setRotationPoint(36.5F, -21F, -7F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Box 301
		bodyModel[305].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[306].setRotationPoint(36.5F, -21F, 5F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 303
		bodyModel[307].setRotationPoint(35.5F, -22F, -3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[308].setRotationPoint(35.5F, -22F, -5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[309].setRotationPoint(35.5F, -22F, -7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[310].setRotationPoint(35.5F, -22F, 5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[311].setRotationPoint(35.5F, -22F, 3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 headlight rear H
		bodyModel[312].setRotationPoint(37F, -21F, -2F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 headlight rear H
		bodyModel[313].setRotationPoint(37F, -21F, 0F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 310
		bodyModel[314].setRotationPoint(36.75F, -19F, -2.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 311 liveryimg 2
		bodyModel[315].setRotationPoint(37.76F, -19F, -2.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 312
		bodyModel[316].setRotationPoint(36.75F, -16.5F, -1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[317].setRotationPoint(-6F, -19.5F, 7.7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[318].setRotationPoint(-6F, -20.5F, 7.7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[319].setRotationPoint(-5.75F, -19F, 7.95F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[320].setRotationPoint(-6F, -21.5F, 6.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 26, 3, 0, 0F); // Box 317
		bodyModel[321].setRotationPoint(8.5F, 1F, -11F);

		bodyModel[322].addBox(0F, 0F, 0F, 26, 3, 0, 0F); // Box 318
		bodyModel[322].setRotationPoint(8.5F, 1F, 11F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 319
		bodyModel[323].setRotationPoint(8.5F, -25F, -0.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 320
		bodyModel[324].setRotationPoint(9.5F, -24F, -0.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 321
		bodyModel[325].setRotationPoint(8.5F, -24.5F, 0.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 322
		bodyModel[326].setRotationPoint(9.5F, -24.5F, -1.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[327].setRotationPoint(-24.5F, -24F, 0F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[328].setRotationPoint(-41F, -4F, -5.75F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front u
		bodyModel[329].setRotationPoint(-41.25F, -4F, -5.75F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight front u
		bodyModel[330].setRotationPoint(-41.25F, -4F, 3.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[331].setRotationPoint(-41F, -4F, 3.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 252
		bodyModel[332].setRotationPoint(40F, -4F, -5.75F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ditchlight rear u
		bodyModel[333].setRotationPoint(40.25F, -4F, -5.75F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 446 ditchlight rear u
		bodyModel[334].setRotationPoint(40.25F, -4F, 3.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 447
		bodyModel[335].setRotationPoint(40F, -4F, 3.75F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[336].setRotationPoint(-26.5F, -24F, 5.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[337].setRotationPoint(-26.5F, -24.5F, 5.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[338].setRotationPoint(-26.5F, -24.5F, 5.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[339].setRotationPoint(-26.5F, -24.5F, 5.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[340].setRotationPoint(-26.5F, -24.5F, 5.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 344 cull
		bodyModel[341].setRotationPoint(-26.5F, -23F, 5F);
	}
}