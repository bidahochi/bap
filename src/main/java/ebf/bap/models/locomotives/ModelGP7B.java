//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.03.2020 - 23:04:42
// Last changed on: 04.03.2020 - 23:04:42

package ebf.bap.models.locomotives; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelGP7B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP7B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[225];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 266
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 271
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 272
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 273
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 275
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 276
		bodyModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 271
		bodyModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 272
		bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 273
		bodyModel[11] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 274
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 275
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 276
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 143
		bodyModel[15] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 188
		bodyModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 266
		bodyModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 271
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 272
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 273
		bodyModel[33] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 274
		bodyModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 275
		bodyModel[35] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 271
		bodyModel[36] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 272
		bodyModel[37] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 273
		bodyModel[38] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 274
		bodyModel[39] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 275
		bodyModel[40] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 276
		bodyModel[41] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 5
		bodyModel[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 143
		bodyModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 474, 108, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 4
		bodyModel[52] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 214
		bodyModel[54] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 209
		bodyModel[55] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 210
		bodyModel[56] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 211
		bodyModel[57] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 214
		bodyModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 215
		bodyModel[61] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 216
		bodyModel[62] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 217
		bodyModel[63] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 218
		bodyModel[64] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 219
		bodyModel[65] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 220
		bodyModel[66] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 221
		bodyModel[67] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 223
		bodyModel[68] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 333
		bodyModel[69] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 344
		bodyModel[70] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 345
		bodyModel[71] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 346
		bodyModel[72] = new ModelRendererTurbo(this, 51, 122, textureX, textureY); // Box 350
		bodyModel[73] = new ModelRendererTurbo(this, 452, 112, textureX, textureY); // Box 351
		bodyModel[74] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 352
		bodyModel[75] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 353
		bodyModel[76] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 265
		bodyModel[77] = new ModelRendererTurbo(this, 479, 91, textureX, textureY); // Box 357
		bodyModel[78] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 358
		bodyModel[79] = new ModelRendererTurbo(this, 136, 110, textureX, textureY); // Box 360
		bodyModel[80] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 362
		bodyModel[81] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 363
		bodyModel[82] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 364
		bodyModel[83] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 365
		bodyModel[84] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 366
		bodyModel[85] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 239
		bodyModel[86] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 242
		bodyModel[87] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 484
		bodyModel[88] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 486
		bodyModel[89] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 487
		bodyModel[90] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 488
		bodyModel[91] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 489
		bodyModel[92] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 490
		bodyModel[93] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 491
		bodyModel[94] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 492
		bodyModel[95] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 493
		bodyModel[96] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 38R
		bodyModel[97] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 176
		bodyModel[98] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 243
		bodyModel[99] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 250
		bodyModel[100] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 498
		bodyModel[101] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 499
		bodyModel[102] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 500
		bodyModel[103] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 503
		bodyModel[104] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 131
		bodyModel[105] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 132
		bodyModel[106] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 133
		bodyModel[107] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 134
		bodyModel[108] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 137
		bodyModel[111] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 138
		bodyModel[112] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 141
		bodyModel[115] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 142
		bodyModel[116] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 114
		bodyModel[117] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 74
		bodyModel[118] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 78
		bodyModel[119] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 875
		bodyModel[120] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 876
		bodyModel[121] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 877
		bodyModel[122] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 152
		bodyModel[123] = new ModelRendererTurbo(this, 157, 113, textureX, textureY); // Box 154
		bodyModel[124] = new ModelRendererTurbo(this, 150, 111, textureX, textureY); // Box 155
		bodyModel[125] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 160
		bodyModel[126] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 161
		bodyModel[127] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 89
		bodyModel[128] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 91
		bodyModel[129] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 101
		bodyModel[130] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 105
		bodyModel[131] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 172
		bodyModel[132] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 173
		bodyModel[133] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 176
		bodyModel[134] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 177
		bodyModel[135] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 178
		bodyModel[136] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 179
		bodyModel[137] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 180
		bodyModel[138] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 181
		bodyModel[139] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 182
		bodyModel[140] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 183
		bodyModel[141] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 184
		bodyModel[142] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 185
		bodyModel[143] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 186
		bodyModel[144] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 187
		bodyModel[145] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 188
		bodyModel[146] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 189
		bodyModel[147] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 190
		bodyModel[148] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 191
		bodyModel[149] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 196 winterization hatch
		bodyModel[150] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 197
		bodyModel[151] = new ModelRendererTurbo(this, 7, 122, textureX, textureY); // Box 198
		bodyModel[152] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 199
		bodyModel[153] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 200
		bodyModel[154] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 201
		bodyModel[155] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 207
		bodyModel[156] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 208
		bodyModel[157] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 209
		bodyModel[158] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 210
		bodyModel[159] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 216
		bodyModel[160] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 219
		bodyModel[161] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 222
		bodyModel[162] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 225
		bodyModel[163] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 227
		bodyModel[164] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 228
		bodyModel[165] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 230
		bodyModel[166] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 231
		bodyModel[167] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 232
		bodyModel[168] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 233
		bodyModel[169] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 234
		bodyModel[170] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 235
		bodyModel[171] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 236
		bodyModel[172] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 237
		bodyModel[173] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 237
		bodyModel[174] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 238
		bodyModel[175] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 239
		bodyModel[176] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 240
		bodyModel[177] = new ModelRendererTurbo(this, 11, 127, textureX, textureY); // Box 241
		bodyModel[178] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 242 extended tank
		bodyModel[179] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 243 extended tank
		bodyModel[180] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 244 extended tank
		bodyModel[181] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 245 extended tank
		bodyModel[182] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 247 extra stack
		bodyModel[183] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 248 extra stack
		bodyModel[184] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 254
		bodyModel[185] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 255
		bodyModel[186] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 256
		bodyModel[187] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 259
		bodyModel[188] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 287
		bodyModel[189] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 288 commander beacon 1
		bodyModel[190] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 162 commander beacon 2
		bodyModel[191] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 165
		bodyModel[192] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 162 commander beacon 3
		bodyModel[193] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 165
		bodyModel[194] = new ModelRendererTurbo(this, 44, 23, textureX, textureY); // Box 117 liveryimg 2
		bodyModel[195] = new ModelRendererTurbo(this, 55, 23, textureX, textureY); // Box 118 liveryimg 2
		bodyModel[196] = new ModelRendererTurbo(this, 22, 23, textureX, textureY); // Box 115 liveryimg 2
		bodyModel[197] = new ModelRendererTurbo(this, 33, 23, textureX, textureY); // Box 116 liveryimg 2
		bodyModel[198] = new ModelRendererTurbo(this, 67, 51, textureX, textureY); // Box 311
		bodyModel[199] = new ModelRendererTurbo(this, 467, 112, textureX, textureY); // Box 312
		bodyModel[200] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 313
		bodyModel[201] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 314
		bodyModel[202] = new ModelRendererTurbo(this, 60, 126, textureX, textureY); // Box 114
		bodyModel[203] = new ModelRendererTurbo(this, 60, 122, textureX, textureY); // Box 74
		bodyModel[204] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 78
		bodyModel[205] = new ModelRendererTurbo(this, 49, 128, textureX, textureY); // Box 245
		bodyModel[206] = new ModelRendererTurbo(this, 207, 163, textureX, textureY); // Box 304
		bodyModel[207] = new ModelRendererTurbo(this, 182, 163, textureX, textureY); // Box 305
		bodyModel[208] = new ModelRendererTurbo(this, 128, 160, textureX, textureY); // Box 306
		bodyModel[209] = new ModelRendererTurbo(this, 155, 160, textureX, textureY); // Box 307
		bodyModel[210] = new ModelRendererTurbo(this, 79, 163, textureX, textureY); // Box 308
		bodyModel[211] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 189 ditchlight front
		bodyModel[212] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 190 ditchlight front
		bodyModel[213] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 359 headlight rear 1
		bodyModel[214] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 221 headlight rear 3
		bodyModel[215] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 223 headlight rear 2
		bodyModel[216] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 224 headlight rear 1 gyra
		bodyModel[217] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 226 headlight rear 2 gyra
		bodyModel[218] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 240 ditchlight rear
		bodyModel[219] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241 ditchlight rear
		bodyModel[220] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 247 headlight front 3
		bodyModel[221] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 215 headlight front 1
		bodyModel[222] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 217 headlight front 2
		bodyModel[223] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 218 headlight front 1 gyra
		bodyModel[224] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 220 headlight front 2 gyra

		bodyModel[0].addBox(0F, 0F, 0F, 67, 2, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-33F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-37.01F, 1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 266
		bodyModel[2].setRotationPoint(-37F, 1F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[3].setRotationPoint(-37F, 1F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[4].setRotationPoint(-37F, 8F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[5].setRotationPoint(-37F, 5F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[6].setRotationPoint(-37F, 7F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[7].setRotationPoint(-37F, 4F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[8].setRotationPoint(-37F, 1F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[9].setRotationPoint(-37F, 8F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[10].setRotationPoint(-37F, 5F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[11].setRotationPoint(-37F, 3F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[12].setRotationPoint(-37F, 7F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[13].setRotationPoint(-37F, 4F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[14].setRotationPoint(-37.01F, -7F, -8F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[15].setRotationPoint(-37.01F, -7F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[16].setRotationPoint(-37F, -1F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[17].setRotationPoint(-37F, -1F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[18].setRotationPoint(-40F, 4F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[19].setRotationPoint(-37F, -1F, 4.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[20].setRotationPoint(-37F, -1F, -6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-40F, 7F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[22].setRotationPoint(-40F, 6F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[23].setRotationPoint(-40F, 8F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[24].setRotationPoint(-40F, 7F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[25].setRotationPoint(-40.5F, 6F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-40F, 8F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[27].setRotationPoint(-38F, 3.5F, -2F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[28].setRotationPoint(38.01F, 1F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 266
		bodyModel[29].setRotationPoint(34F, 1F, -7F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[30].setRotationPoint(34F, 1F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[31].setRotationPoint(34F, 8F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[32].setRotationPoint(34F, 5F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[33].setRotationPoint(34F, 3F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[34].setRotationPoint(34F, 7F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 271
		bodyModel[35].setRotationPoint(34F, 1F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[36].setRotationPoint(34F, 8F, 8F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[37].setRotationPoint(34F, 5F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[38].setRotationPoint(34F, 3F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[39].setRotationPoint(34F, 7F, 8F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[40].setRotationPoint(34F, 4F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[41].setRotationPoint(37F, 4F, -1.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[42].setRotationPoint(38.01F, -7F, -8F);
		bodyModel[42].rotateAngleY = -3.14159265F;

		bodyModel[43].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[43].setRotationPoint(38.02F, -1F, 10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[44].setRotationPoint(38.01F, -7F, 8F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[45].setRotationPoint(38.02F, -1F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[46].setRotationPoint(38F, 7F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[47].setRotationPoint(38F, 6F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[48].setRotationPoint(38F, 8F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[49].setRotationPoint(38F, 7F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[50].setRotationPoint(38.5F, 6F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[51].setRotationPoint(38F, 8F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[52].setRotationPoint(38F, 3.5F, -2F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 214
		bodyModel[53].setRotationPoint(34F, 4F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[54].setRotationPoint(-33F, 3F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 210
		bodyModel[55].setRotationPoint(-37F, 3F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[56].setRotationPoint(-33F, 3F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(-37F, 3F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[58].setRotationPoint(33F, 3F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[59].setRotationPoint(-37F, -7F, -8F);

		bodyModel[60].addBox(0F, 0F, 0F, 9, 13, 14, 0F); // Box 215
		bodyModel[60].setRotationPoint(-31F, -12F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[61].setRotationPoint(-34F, -12F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[62].setRotationPoint(-34F, -12F, 1F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[63].setRotationPoint(-34F, -12F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[64].setRotationPoint(32F, -19F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[65].setRotationPoint(32F, -19F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[66].setRotationPoint(32F, -19F, 1F);

		bodyModel[67].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[67].setRotationPoint(-10F, -19F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 67, 1, 14, 0F); // Box 333
		bodyModel[68].setRotationPoint(-33F, 3F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[69].setRotationPoint(-22F, -4F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 345
		bodyModel[70].setRotationPoint(-30F, -4F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 346
		bodyModel[71].setRotationPoint(-30F, -4F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 9, 7, 14, 0F); // Box 350
		bodyModel[72].setRotationPoint(-31F, -19F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[73].setRotationPoint(-34F, -19F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[74].setRotationPoint(-34F, -19F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[75].setRotationPoint(-34F, -19F, 1F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 265
		bodyModel[76].setRotationPoint(-34.5F, -13F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 357
		bodyModel[77].setRotationPoint(-32F, -18F, -7F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 358
		bodyModel[78].setRotationPoint(32F, -18F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[79].setRotationPoint(34.5F, -17F, -1F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[80].setRotationPoint(-10F, -4F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 363
		bodyModel[81].setRotationPoint(-10F, -4F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[82].setRotationPoint(38F, -7F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[83].setRotationPoint(34F, 3F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[84].setRotationPoint(34F, 3F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[85].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[86].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[87].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 484
		bodyModel[87].setRotationPoint(-8F, 3F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[88].setRotationPoint(-11F, 6F, -10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[89].setRotationPoint(-11F, 6F, 7.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 15, 3, 15, 0F); // Box 488
		bodyModel[90].setRotationPoint(-11F, 6F, -7.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 15, 2, 21, 0F); // Box 489
		bodyModel[91].setRotationPoint(-11F, 4F, -10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[92].setRotationPoint(-14F, 3F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 491
		bodyModel[93].setRotationPoint(-14F, 3F, 11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[94].setRotationPoint(12F, 3F, 11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[95].setRotationPoint(12F, 3F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 38R
		bodyModel[96].setRotationPoint(-1F, -7F, 11.01F);

		bodyModel[97].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 176
		bodyModel[97].setRotationPoint(-1F, -7F, -11.01F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 243
		bodyModel[98].setRotationPoint(34F, -7F, 9F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 250
		bodyModel[99].setRotationPoint(34F, -7F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[100].setRotationPoint(5F, 5F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 3, 20, 0F); // Box 499
		bodyModel[101].setRotationPoint(9F, 5F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[102].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[103].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 503
		bodyModel[103].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[104].setRotationPoint(-31.01F, -12F, -11.01F);
		bodyModel[104].rotateAngleY = -3.14159265F;

		bodyModel[105].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[105].setRotationPoint(-31F, -12F, -11.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[106].setRotationPoint(-34F, -6F, -11.01F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[107].setRotationPoint(-34F, -6F, 11.01F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 135
		bodyModel[108].setRotationPoint(-31.01F, -12F, 11.02F);
		bodyModel[108].rotateAngleY = -3.14159265F;

		bodyModel[109].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[109].setRotationPoint(-31F, -12F, 11.01F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[110].setRotationPoint(-32F, -1F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[111].setRotationPoint(-32F, -1F, 5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[112].setRotationPoint(-32F, -4F, -11.01F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[113].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[114].setRotationPoint(-31F, -4F, 11.01F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[115].setRotationPoint(-32F, -4F, 11.01F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[116].setRotationPoint(-36.5F, -19F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[117].setRotationPoint(-36.5F, -20F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[118].setRotationPoint(-36.25F, -18.5F, -0.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[119].setRotationPoint(-36.5F, -20F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[120].setRotationPoint(-36.5F, -20F, 1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[121].setRotationPoint(-36.25F, -20.25F, -1.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 152
		bodyModel[122].setRotationPoint(-32F, -11F, -7F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 154
		bodyModel[123].setRotationPoint(-39F, 9F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 155
		bodyModel[124].setRotationPoint(38F, 9F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160
		bodyModel[125].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[126].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[127].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89
		bodyModel[127].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[128].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[129].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[130].setRotationPoint(1.5F, -18F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[131].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[132].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[133].setRotationPoint(1.5F, -20F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[134].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[135].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[136].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[137].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[138].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[139].setRotationPoint(1.5F, -18F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[140].setRotationPoint(1.5F, -20F, -9F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[141].setRotationPoint(3F, -21F, -1.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[142].setRotationPoint(16F, -21F, -1.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[143].setRotationPoint(-3.5F, -20F, -2.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[144].setRotationPoint(-9.5F, -20F, -2.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[145].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[146].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[147].setRotationPoint(-32F, -19.5F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[148].setRotationPoint(31F, -19.5F, -1F);

		bodyModel[149].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 196 winterization hatch
		bodyModel[149].setRotationPoint(18F, -22F, -3F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 197
		bodyModel[150].setRotationPoint(-16.5F, -22F, 0F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 198
		bodyModel[151].setRotationPoint(-15.5F, -22F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[152].setRotationPoint(-15F, -21F, -1.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 200
		bodyModel[153].setRotationPoint(-16F, -21.75F, -2F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 201
		bodyModel[154].setRotationPoint(-15.5F, -21.75F, 1F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 207
		bodyModel[155].setRotationPoint(10F, -22F, -8F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 208
		bodyModel[156].setRotationPoint(11.25F, -21.85F, -9F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 209
		bodyModel[157].setRotationPoint(11.25F, -21.85F, -7F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 210
		bodyModel[158].setRotationPoint(12F, -21F, -8F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[159].setRotationPoint(-34.5F, -17F, -1F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219
		bodyModel[160].setRotationPoint(-35.5F, -18F, -1F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[161].setRotationPoint(34.5F, -15F, -1F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 225
		bodyModel[162].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227
		bodyModel[163].setRotationPoint(-2F, -18F, -9F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 228
		bodyModel[164].setRotationPoint(-1.75F, -18F, -8F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 230
		bodyModel[165].setRotationPoint(-11F, 3F, 10F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 231
		bodyModel[166].setRotationPoint(8F, 3F, 10F);

		bodyModel[167].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 232
		bodyModel[167].setRotationPoint(-8F, 3F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 233
		bodyModel[168].setRotationPoint(-11F, 3F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 234
		bodyModel[169].setRotationPoint(8F, 3F, -11F);

		bodyModel[170].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 235
		bodyModel[170].setRotationPoint(4F, 4F, -7F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 236
		bodyModel[171].setRotationPoint(30F, -21F, 5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		bodyModel[172].setRotationPoint(30.25F, -20F, 5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[173].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[174].setRotationPoint(-4F, -4F, 11.01F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 239
		bodyModel[175].setRotationPoint(19.5F, -24F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[176].setRotationPoint(18F, -24F, 0F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[177].setRotationPoint(19.5F, -23F, -0.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242 extended tank
		bodyModel[178].setRotationPoint(4F, 6F, -10.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 8, 3, 15, 0F); // Box 243 extended tank
		bodyModel[179].setRotationPoint(4F, 6F, -7.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 244 extended tank
		bodyModel[180].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 8, 2, 21, 0F); // Box 245 extended tank
		bodyModel[181].setRotationPoint(4F, 4F, -10.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[182].setRotationPoint(3F, -23F, -1.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[183].setRotationPoint(16F, -23F, -1.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 254
		bodyModel[184].setRotationPoint(1F, -21.5F, -1F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 255
		bodyModel[185].setRotationPoint(0.5F, -21.5F, 0F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 256
		bodyModel[186].setRotationPoint(1.5F, -20.5F, -0.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 259
		bodyModel[187].setRotationPoint(-30F, -21F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 287
		bodyModel[188].setRotationPoint(-29.32F, -20F, -0.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 288 commander beacon 1
		bodyModel[189].setRotationPoint(-29.47F, -20F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon 2
		bodyModel[190].setRotationPoint(-21.53F, -21F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[191].setRotationPoint(-21.37F, -21F, -0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon 3
		bodyModel[192].setRotationPoint(-11.53F, -21F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[193].setRotationPoint(-11.37F, -21F, -0.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[194].setRotationPoint(-31.51F, -16.5F, -6F);
		bodyModel[194].rotateAngleY = 0.4712389F;

		bodyModel[195].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[195].setRotationPoint(-31.51F, -16.5F, 6F);
		bodyModel[195].rotateAngleY = -0.4712389F;

		bodyModel[196].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[196].setRotationPoint(32.51F, -16.5F, -6F);
		bodyModel[196].rotateAngleY = -0.4712389F;

		bodyModel[197].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[197].setRotationPoint(32.51F, -16.5F, 6F);
		bodyModel[197].rotateAngleY = 0.4712389F;

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[198].setRotationPoint(-34.5F, -15F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 312
		bodyModel[199].setRotationPoint(34.5F, -13F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[200].setRotationPoint(-5F, -12F, -11.01F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[201].setRotationPoint(-5F, -12F, 11.01F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[202].setRotationPoint(0.5F, -17.5F, 7.7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[203].setRotationPoint(0.5F, -18.5F, 7.7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[204].setRotationPoint(0.75F, -17F, 7.95F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[205].setRotationPoint(0.5F, -19.5F, 6.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 304
		bodyModel[206].setRotationPoint(-22F, -12F, 11.01F);

		bodyModel[207].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 305
		bodyModel[207].setRotationPoint(-22F, -12F, -11.01F);

		bodyModel[208].addBox(0F, 0F, 0F, 12, 15, 1, 0F); // Box 306
		bodyModel[208].setRotationPoint(-22F, -19F, -7F);

		bodyModel[209].addBox(0F, 0F, 0F, 12, 15, 1, 0F); // Box 307
		bodyModel[209].setRotationPoint(-22F, -19F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 308
		bodyModel[210].setRotationPoint(-22F, -20F, -6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[211].setRotationPoint(-37.25F, -1F, 4.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[212].setRotationPoint(-37.25F, -1F, -6.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[213].setRotationPoint(34.75F, -17F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 221 headlight rear 3
		bodyModel[214].setRotationPoint(34.75F, -13F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[215].setRotationPoint(34.75F, -15F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 headlight rear 1 gyra
		bodyModel[216].setRotationPoint(35.75F, -18F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 headlight rear 2 gyra
		bodyModel[217].setRotationPoint(35.75F, -16F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[218].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[219].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 3
		bodyModel[220].setRotationPoint(-35.25F, -13F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[221].setRotationPoint(-35.25F, -17F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[222].setRotationPoint(-35.25F, -15F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 headlight front 1 gyra
		bodyModel[223].setRotationPoint(-36.25F, -18F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 headlight front 2 gyra
		bodyModel[224].setRotationPoint(-36.25F, -16F, -1F);
	}
}