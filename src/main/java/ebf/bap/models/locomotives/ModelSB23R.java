//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.04.2021 - 10:02:01
// Last changed on: 04.04.2021 - 10:02:01

package ebf.bap.models.locomotives; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSB23R extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSB23R() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[252];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 230, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 3, 185, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 118, 107, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 52, 154, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 51, 184, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 303, 201, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 176, 191, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 328, 200, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 198, 229, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 247, 241, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 261, 236, textureX, textureY); // Box 32
		bodyModel[11] = new ModelRendererTurbo(this, 247, 231, textureX, textureY); // Box 33
		bodyModel[12] = new ModelRendererTurbo(this, 283, 229, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 283, 238, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 312, 239, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 325, 239, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 2, 157, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 65, 172, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 1, 163, textureX, textureY); // Box 156
		bodyModel[19] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 157
		bodyModel[20] = new ModelRendererTurbo(this, 1, 168, textureX, textureY); // Box 158
		bodyModel[21] = new ModelRendererTurbo(this, 78, 171, textureX, textureY); // Box 195
		bodyModel[22] = new ModelRendererTurbo(this, 87, 173, textureX, textureY); // Box 196
		bodyModel[23] = new ModelRendererTurbo(this, 89, 162, textureX, textureY); // Box 197
		bodyModel[24] = new ModelRendererTurbo(this, 87, 176, textureX, textureY); // Box 198
		bodyModel[25] = new ModelRendererTurbo(this, 91, 157, textureX, textureY); // Box 199
		bodyModel[26] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 200
		bodyModel[27] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 201
		bodyModel[28] = new ModelRendererTurbo(this, 97, 159, textureX, textureY); // Box 202
		bodyModel[29] = new ModelRendererTurbo(this, 98, 157, textureX, textureY); // Box 203
		bodyModel[30] = new ModelRendererTurbo(this, 97, 159, textureX, textureY); // Box 204
		bodyModel[31] = new ModelRendererTurbo(this, 96, 162, textureX, textureY); // Box 205
		bodyModel[32] = new ModelRendererTurbo(this, 92, 154, textureX, textureY); // Box 215
		bodyModel[33] = new ModelRendererTurbo(this, 88, 170, textureX, textureY); // Box 218
		bodyModel[34] = new ModelRendererTurbo(this, 76, 171, textureX, textureY); // Box 220
		bodyModel[35] = new ModelRendererTurbo(this, 2, 157, textureX, textureY); // Box 230
		bodyModel[36] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 155, 117, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 122, 102, textureX, textureY); // Box 80
		bodyModel[39] = new ModelRendererTurbo(this, 7, 211, textureX, textureY); // Box 251
		bodyModel[40] = new ModelRendererTurbo(this, 311, 246, textureX, textureY); // Box 252
		bodyModel[41] = new ModelRendererTurbo(this, 165, 107, textureX, textureY); // Box 256
		bodyModel[42] = new ModelRendererTurbo(this, 202, 117, textureX, textureY); // Box 259
		bodyModel[43] = new ModelRendererTurbo(this, 169, 102, textureX, textureY); // Box 267
		bodyModel[44] = new ModelRendererTurbo(this, 166, 117, textureX, textureY); // Box 269
		bodyModel[45] = new ModelRendererTurbo(this, 299, 250, textureX, textureY); // Box 281
		bodyModel[46] = new ModelRendererTurbo(this, 6, 91, textureX, textureY); // Box 285
		bodyModel[47] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 288
		bodyModel[48] = new ModelRendererTurbo(this, 6, 80, textureX, textureY); // Box 300
		bodyModel[49] = new ModelRendererTurbo(this, 38, 81, textureX, textureY); // Box 303
		bodyModel[50] = new ModelRendererTurbo(this, 208, 116, textureX, textureY); // Box 296
		bodyModel[51] = new ModelRendererTurbo(this, 176, 191, textureX, textureY); // Box 19
		bodyModel[52] = new ModelRendererTurbo(this, 176, 191, textureX, textureY); // Box 19
		bodyModel[53] = new ModelRendererTurbo(this, 176, 191, textureX, textureY); // Box 19
		bodyModel[54] = new ModelRendererTurbo(this, 176, 191, textureX, textureY); // Box 19
		bodyModel[55] = new ModelRendererTurbo(this, 176, 191, textureX, textureY); // Box 19
		bodyModel[56] = new ModelRendererTurbo(this, 105, 173, textureX, textureY); // Box 305
		bodyModel[57] = new ModelRendererTurbo(this, 56, 171, textureX, textureY); // Box 440
		bodyModel[58] = new ModelRendererTurbo(this, 56, 171, textureX, textureY); // Box 441
		bodyModel[59] = new ModelRendererTurbo(this, 354, 197, textureX, textureY); // Box 293
		bodyModel[60] = new ModelRendererTurbo(this, 114, 174, textureX, textureY); // Box 19
		bodyModel[61] = new ModelRendererTurbo(this, 114, 174, textureX, textureY); // Box 19
		bodyModel[62] = new ModelRendererTurbo(this, 44, 179, textureX, textureY); // Box 114
		bodyModel[63] = new ModelRendererTurbo(this, 44, 176, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 44, 182, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 44, 171, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 56, 189, textureX, textureY); // Box 2603
		bodyModel[67] = new ModelRendererTurbo(this, 56, 176, textureX, textureY); // Box 261
		bodyModel[68] = new ModelRendererTurbo(this, 110, 192, textureX, textureY); // Box 263
		bodyModel[69] = new ModelRendererTurbo(this, 123, 191, textureX, textureY); // Box 264
		bodyModel[70] = new ModelRendererTurbo(this, 87, 173, textureX, textureY); // Box 193
		bodyModel[71] = new ModelRendererTurbo(this, 318, 246, textureX, textureY); // Box 190 ditchlight f
		bodyModel[72] = new ModelRendererTurbo(this, 87, 173, textureX, textureY); // Box 273
		bodyModel[73] = new ModelRendererTurbo(this, 304, 247, textureX, textureY); // Box 276 ditchlight r
		bodyModel[74] = new ModelRendererTurbo(this, 17, 155, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 17, 155, textureX, textureY); // Box 267
		bodyModel[76] = new ModelRendererTurbo(this, 110, 179, textureX, textureY); // Box 270434
		bodyModel[77] = new ModelRendererTurbo(this, 123, 178, textureX, textureY); // Box 271
		bodyModel[78] = new ModelRendererTurbo(this, 213, 117, textureX, textureY); // Box 280
		bodyModel[79] = new ModelRendererTurbo(this, 227, 117, textureX, textureY); // Box 281
		bodyModel[80] = new ModelRendererTurbo(this, 230, 116, textureX, textureY); // Box 282
		bodyModel[81] = new ModelRendererTurbo(this, 29, 81, textureX, textureY); // Box 296
		bodyModel[82] = new ModelRendererTurbo(this, 29, 91, textureX, textureY); // Box 297
		bodyModel[83] = new ModelRendererTurbo(this, 115, 157, textureX, textureY); // Box 310
		bodyModel[84] = new ModelRendererTurbo(this, 137, 184, textureX, textureY); // Box 318
		bodyModel[85] = new ModelRendererTurbo(this, 119, 173, textureX, textureY); // Box 319
		bodyModel[86] = new ModelRendererTurbo(this, 163, 114, textureX, textureY); // Box 320
		bodyModel[87] = new ModelRendererTurbo(this, 116, 114, textureX, textureY); // Box 321
		bodyModel[88] = new ModelRendererTurbo(this, 440, 181, textureX, textureY); // Box 144
		bodyModel[89] = new ModelRendererTurbo(this, 440, 186, textureX, textureY); // Box 145
		bodyModel[90] = new ModelRendererTurbo(this, 440, 177, textureX, textureY); // Box 292
		bodyModel[91] = new ModelRendererTurbo(this, 440, 173, textureX, textureY); // Box 294
		bodyModel[92] = new ModelRendererTurbo(this, 354, 197, textureX, textureY); // Box 343
		bodyModel[93] = new ModelRendererTurbo(this, 338, 192, textureX, textureY); // Box 345
		bodyModel[94] = new ModelRendererTurbo(this, 349, 190, textureX, textureY); // Box 346
		bodyModel[95] = new ModelRendererTurbo(this, 349, 190, textureX, textureY); // Box 347
		bodyModel[96] = new ModelRendererTurbo(this, 338, 192, textureX, textureY); // Box 348
		bodyModel[97] = new ModelRendererTurbo(this, 329, 192, textureX, textureY); // Box 349
		bodyModel[98] = new ModelRendererTurbo(this, 329, 192, textureX, textureY); // Box 350
		bodyModel[99] = new ModelRendererTurbo(this, 75, 152, textureX, textureY); // Box 277
		bodyModel[100] = new ModelRendererTurbo(this, 75, 152, textureX, textureY); // Box 278
		bodyModel[101] = new ModelRendererTurbo(this, 25, 207, textureX, textureY); // Box 253
		bodyModel[102] = new ModelRendererTurbo(this, 38, 207, textureX, textureY); // Box 280
		bodyModel[103] = new ModelRendererTurbo(this, 440, 208, textureX, textureY); // Box 283
		bodyModel[104] = new ModelRendererTurbo(this, 440, 191, textureX, textureY); // Box 284
		bodyModel[105] = new ModelRendererTurbo(this, 435, 149, textureX, textureY); // Box 292
		bodyModel[106] = new ModelRendererTurbo(this, 442, 152, textureX, textureY); // Box 293
		bodyModel[107] = new ModelRendererTurbo(this, 442, 156, textureX, textureY); // Box 294
		bodyModel[108] = new ModelRendererTurbo(this, 442, 149, textureX, textureY); // Box 295
		bodyModel[109] = new ModelRendererTurbo(this, 442, 149, textureX, textureY); // Box 296
		bodyModel[110] = new ModelRendererTurbo(this, 158, 117, textureX, textureY); // Box 298
		bodyModel[111] = new ModelRendererTurbo(this, 116, 117, textureX, textureY); // Box 299
		bodyModel[112] = new ModelRendererTurbo(this, 163, 117, textureX, textureY); // Box 300
		bodyModel[113] = new ModelRendererTurbo(this, 205, 117, textureX, textureY); // Box 301
		bodyModel[114] = new ModelRendererTurbo(this, 378, 192, textureX, textureY); // Box 403
		bodyModel[115] = new ModelRendererTurbo(this, 378, 181, textureX, textureY); // Box 404
		bodyModel[116] = new ModelRendererTurbo(this, 447, 156, textureX, textureY); // Box 406
		bodyModel[117] = new ModelRendererTurbo(this, 449, 152, textureX, textureY); // Box 407
		bodyModel[118] = new ModelRendererTurbo(this, 447, 149, textureX, textureY); // Box 408
		bodyModel[119] = new ModelRendererTurbo(this, 447, 149, textureX, textureY); // Box 409
		bodyModel[120] = new ModelRendererTurbo(this, 452, 149, textureX, textureY); // Box 410
		bodyModel[121] = new ModelRendererTurbo(this, 99, 154, textureX, textureY); // Box 411
		bodyModel[122] = new ModelRendererTurbo(this, 92, 154, textureX, textureY); // Box 412
		bodyModel[123] = new ModelRendererTurbo(this, 92, 154, textureX, textureY); // Box 413
		bodyModel[124] = new ModelRendererTurbo(this, 99, 154, textureX, textureY); // Box 414
		bodyModel[125] = new ModelRendererTurbo(this, 270, 163, textureX, textureY); // Box 364 prime base
		bodyModel[126] = new ModelRendererTurbo(this, 279, 163, textureX, textureY); // Box 6 PRIME1-1
		bodyModel[127] = new ModelRendererTurbo(this, 279, 163, textureX, textureY); // Box 7 PRIME1-3
		bodyModel[128] = new ModelRendererTurbo(this, 279, 163, textureX, textureY); // Box 8 PRIME1-2
		bodyModel[129] = new ModelRendererTurbo(this, 279, 163, textureX, textureY); // Box 9 PRIME1-4
		bodyModel[130] = new ModelRendererTurbo(this, 99, 149, textureX, textureY); // Box 431
		bodyModel[131] = new ModelRendererTurbo(this, 92, 149, textureX, textureY); // Box 432
		bodyModel[132] = new ModelRendererTurbo(this, 92, 149, textureX, textureY); // Box 433
		bodyModel[133] = new ModelRendererTurbo(this, 99, 149, textureX, textureY); // Box 434
		bodyModel[134] = new ModelRendererTurbo(this, 299, 250, textureX, textureY); // Box 442
		bodyModel[135] = new ModelRendererTurbo(this, 304, 247, textureX, textureY); // Box 443 ditchlight r
		bodyModel[136] = new ModelRendererTurbo(this, 318, 246, textureX, textureY); // Box 446 ditchlight f
		bodyModel[137] = new ModelRendererTurbo(this, 311, 246, textureX, textureY); // Box 447
		bodyModel[138] = new ModelRendererTurbo(this, 96, 162, textureX, textureY); // Box 448
		bodyModel[139] = new ModelRendererTurbo(this, 97, 159, textureX, textureY); // Box 449
		bodyModel[140] = new ModelRendererTurbo(this, 97, 159, textureX, textureY); // Box 450
		bodyModel[141] = new ModelRendererTurbo(this, 98, 157, textureX, textureY); // Box 451
		bodyModel[142] = new ModelRendererTurbo(this, 89, 162, textureX, textureY); // Box 452
		bodyModel[143] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 453
		bodyModel[144] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 454
		bodyModel[145] = new ModelRendererTurbo(this, 91, 157, textureX, textureY); // Box 455
		bodyModel[146] = new ModelRendererTurbo(this, 313, 173, textureX, textureY); // Box 350
		bodyModel[147] = new ModelRendererTurbo(this, 316, 173, textureX, textureY); // Box 321
		bodyModel[148] = new ModelRendererTurbo(this, 110, 182, textureX, textureY); // Box 322
		bodyModel[149] = new ModelRendererTurbo(this, 110, 182, textureX, textureY); // Box 323
		bodyModel[150] = new ModelRendererTurbo(this, 256, 160, textureX, textureY); // Box 334 commander beacon r
		bodyModel[151] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 335
		bodyModel[152] = new ModelRendererTurbo(this, 261, 160, textureX, textureY); // Box 334 commander beacon l
		bodyModel[153] = new ModelRendererTurbo(this, 261, 164, textureX, textureY); // Box 335
		bodyModel[154] = new ModelRendererTurbo(this, 319, 174, textureX, textureY); // Box 338 cull
		bodyModel[155] = new ModelRendererTurbo(this, 319, 168, textureX, textureY); // Box 339 cull
		bodyModel[156] = new ModelRendererTurbo(this, 428, 225, textureX, textureY); // Box 5
		bodyModel[157] = new ModelRendererTurbo(this, 352, 203, textureX, textureY); // Box 19
		bodyModel[158] = new ModelRendererTurbo(this, 352, 212, textureX, textureY); // Box 20
		bodyModel[159] = new ModelRendererTurbo(this, 339, 225, textureX, textureY); // Box 343
		bodyModel[160] = new ModelRendererTurbo(this, 316, 195, textureX, textureY); // Box 344
		bodyModel[161] = new ModelRendererTurbo(this, 169, 170, textureX, textureY); // Box 53
		bodyModel[162] = new ModelRendererTurbo(this, 182, 173, textureX, textureY); // Box 54
		bodyModel[163] = new ModelRendererTurbo(this, 202, 163, textureX, textureY); // Box 55
		bodyModel[164] = new ModelRendererTurbo(this, 325, 251, textureX, textureY); // Box 71 glow markerlight
		bodyModel[165] = new ModelRendererTurbo(this, 189, 170, textureX, textureY); // Box 235
		bodyModel[166] = new ModelRendererTurbo(this, 325, 251, textureX, textureY); // Box 124 glow markerlight
		bodyModel[167] = new ModelRendererTurbo(this, 169, 156, textureX, textureY); // Box 125
		bodyModel[168] = new ModelRendererTurbo(this, 204, 170, textureX, textureY); // Box 143
		bodyModel[169] = new ModelRendererTurbo(this, 472, 160, textureX, textureY); // Box 338
		bodyModel[170] = new ModelRendererTurbo(this, 467, 160, textureX, textureY); // Box 340
		bodyModel[171] = new ModelRendererTurbo(this, 467, 158, textureX, textureY); // Box 344
		bodyModel[172] = new ModelRendererTurbo(this, 236, 210, textureX, textureY); // Box 52 door swing right
		bodyModel[173] = new ModelRendererTurbo(this, 230, 184, textureX, textureY); // Box 68
		bodyModel[174] = new ModelRendererTurbo(this, 246, 177, textureX, textureY); // Box 69
		bodyModel[175] = new ModelRendererTurbo(this, 276, 197, textureX, textureY); // Box 70
		bodyModel[176] = new ModelRendererTurbo(this, 209, 155, textureX, textureY); // Box 74
		bodyModel[177] = new ModelRendererTurbo(this, 220, 152, textureX, textureY); // Box 75
		bodyModel[178] = new ModelRendererTurbo(this, 194, 152, textureX, textureY); // Box 76
		bodyModel[179] = new ModelRendererTurbo(this, 324, 213, textureX, textureY); // Box 72
		bodyModel[180] = new ModelRendererTurbo(this, 247, 213, textureX, textureY); // Box 190
		bodyModel[181] = new ModelRendererTurbo(this, 236, 144, textureX, textureY); // Box 117 liveryimg 2 glow
		bodyModel[182] = new ModelRendererTurbo(this, 236, 144, textureX, textureY); // Box 118 liveryimg 2 glow
		bodyModel[183] = new ModelRendererTurbo(this, 325, 246, textureX, textureY); // Box 186 lamp headlight f
		bodyModel[184] = new ModelRendererTurbo(this, 325, 246, textureX, textureY); // Box 187 lamp headlight f
		bodyModel[185] = new ModelRendererTurbo(this, 201, 198, textureX, textureY); // Box 313
		bodyModel[186] = new ModelRendererTurbo(this, 313, 210, textureX, textureY); // Box 314 door swing right
		bodyModel[187] = new ModelRendererTurbo(this, 227, 153, textureX, textureY); // Box 332
		bodyModel[188] = new ModelRendererTurbo(this, 248, 149, textureX, textureY); // Box 333
		bodyModel[189] = new ModelRendererTurbo(this, 246, 204, textureX, textureY); // Box 67
		bodyModel[190] = new ModelRendererTurbo(this, 415, 221, textureX, textureY); // Box 377
		bodyModel[191] = new ModelRendererTurbo(this, 415, 230, textureX, textureY); // Box 378
		bodyModel[192] = new ModelRendererTurbo(this, 120, 120, textureX, textureY); // Box 139
		bodyModel[193] = new ModelRendererTurbo(this, 167, 120, textureX, textureY); // Box 386
		bodyModel[194] = new ModelRendererTurbo(this, 140, 147, textureX, textureY); // Box 132
		bodyModel[195] = new ModelRendererTurbo(this, 127, 143, textureX, textureY); // Box 133
		bodyModel[196] = new ModelRendererTurbo(this, 153, 155, textureX, textureY); // Box 389
		bodyModel[197] = new ModelRendererTurbo(this, 140, 159, textureX, textureY); // Box 390
		bodyModel[198] = new ModelRendererTurbo(this, 327, 232, textureX, textureY); // Box 74
		bodyModel[199] = new ModelRendererTurbo(this, 312, 229, textureX, textureY); // Box 75
		bodyModel[200] = new ModelRendererTurbo(this, 338, 229, textureX, textureY); // Box 76
		bodyModel[201] = new ModelRendererTurbo(this, 236, 141, textureX, textureY); // Box 117 liveryimg 2 glow
		bodyModel[202] = new ModelRendererTurbo(this, 236, 141, textureX, textureY); // Box 118 liveryimg 2 glow
		bodyModel[203] = new ModelRendererTurbo(this, 332, 246, textureX, textureY); // Box 186 lamp headlight r
		bodyModel[204] = new ModelRendererTurbo(this, 332, 246, textureX, textureY); // Box 187 lamp headlight r
		bodyModel[205] = new ModelRendererTurbo(this, 332, 251, textureX, textureY); // Box 402 glow markerlight
		bodyModel[206] = new ModelRendererTurbo(this, 332, 251, textureX, textureY); // Box 403 glow markerlight
		bodyModel[207] = new ModelRendererTurbo(this, 194, 143, textureX, textureY); // Box 408
		bodyModel[208] = new ModelRendererTurbo(this, 209, 146, textureX, textureY); // Box 409
		bodyModel[209] = new ModelRendererTurbo(this, 218, 143, textureX, textureY); // Box 410
		bodyModel[210] = new ModelRendererTurbo(this, 278, 149, textureX, textureY); // Box 415
		bodyModel[211] = new ModelRendererTurbo(this, 280, 135, textureX, textureY); // Box 416 cull
		bodyModel[212] = new ModelRendererTurbo(this, 275, 191, textureX, textureY); // Box 334
		bodyModel[213] = new ModelRendererTurbo(this, 275, 185, textureX, textureY); // Box 335
		bodyModel[214] = new ModelRendererTurbo(this, 280, 142, textureX, textureY); // Box 419 cull
		bodyModel[215] = new ModelRendererTurbo(this, 318, 181, textureX, textureY); // box64
		bodyModel[216] = new ModelRendererTurbo(this, 318, 185, textureX, textureY); // box65
		bodyModel[217] = new ModelRendererTurbo(this, 273, 134, textureX, textureY); // Box 287
		bodyModel[218] = new ModelRendererTurbo(this, 269, 150, textureX, textureY); // Box 423
		bodyModel[219] = new ModelRendererTurbo(this, 265, 142, textureX, textureY); // Box 424
		bodyModel[220] = new ModelRendererTurbo(this, 310, 157, textureX, textureY); // Box 425
		bodyModel[221] = new ModelRendererTurbo(this, 277, 136, textureX, textureY); // Box 426
		bodyModel[222] = new ModelRendererTurbo(this, 296, 151, textureX, textureY); // Box 427
		bodyModel[223] = new ModelRendererTurbo(this, 263, 137, textureX, textureY); // Box 428
		bodyModel[224] = new ModelRendererTurbo(this, 302, 170, textureX, textureY); // Box 412
		bodyModel[225] = new ModelRendererTurbo(this, 280, 172, textureX, textureY); // Box 413
		bodyModel[226] = new ModelRendererTurbo(this, 290, 162, textureX, textureY); // Box 86
		bodyModel[227] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 280
		bodyModel[228] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 281
		bodyModel[229] = new ModelRendererTurbo(this, 48, 139, textureX, textureY); // Box 282
		bodyModel[230] = new ModelRendererTurbo(this, 61, 136, textureX, textureY); // Box 283
		bodyModel[231] = new ModelRendererTurbo(this, 14, 141, textureX, textureY); // Box 284
		bodyModel[232] = new ModelRendererTurbo(this, 11, 132, textureX, textureY); // Box 285
		bodyModel[233] = new ModelRendererTurbo(this, 27, 141, textureX, textureY); // Box 414
		bodyModel[234] = new ModelRendererTurbo(this, 38, 139, textureX, textureY); // Box 415
		bodyModel[235] = new ModelRendererTurbo(this, 75, 117, textureX, textureY); // Box 280
		bodyModel[236] = new ModelRendererTurbo(this, 27, 118, textureX, textureY); // Box 281
		bodyModel[237] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 282
		bodyModel[238] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 283
		bodyModel[239] = new ModelRendererTurbo(this, 40, 120, textureX, textureY); // Box 284
		bodyModel[240] = new ModelRendererTurbo(this, 85, 115, textureX, textureY); // Box 285
		bodyModel[241] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 414
		bodyModel[242] = new ModelRendererTurbo(this, 64, 118, textureX, textureY); // Box 415
		bodyModel[243] = new ModelRendererTurbo(this, 105, 173, textureX, textureY); // Box 884
		bodyModel[244] = new ModelRendererTurbo(this, 326, 160, textureX, textureY); // Box 418
		bodyModel[245] = new ModelRendererTurbo(this, 331, 154, textureX, textureY); // Box 419
		bodyModel[246] = new ModelRendererTurbo(this, 330, 157, textureX, textureY); // Box 420
		bodyModel[247] = new ModelRendererTurbo(this, 331, 160, textureX, textureY); // Box 421
		bodyModel[248] = new ModelRendererTurbo(this, 309, 189, textureX, textureY); // Box 397
		bodyModel[249] = new ModelRendererTurbo(this, 304, 193, textureX, textureY); // Box 398
		bodyModel[250] = new ModelRendererTurbo(this, 334, 179, textureX, textureY); // Box 3 cull aww
		bodyModel[251] = new ModelRendererTurbo(this, 336, 174, textureX, textureY); // Box 5

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-12F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-42F, -1F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 18, 3, 22, 0F); // Box 10
		bodyModel[4].setRotationPoint(-12F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[5].setRotationPoint(6.5F, -18.5F, -3F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(10F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 21
		bodyModel[7].setRotationPoint(2F, -18F, -3.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[8].setRotationPoint(-32F, -5F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 31
		bodyModel[9].setRotationPoint(-35F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 32
		bodyModel[10].setRotationPoint(-36F, -3F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 33
		bodyModel[11].setRotationPoint(-36F, -5F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 35
		bodyModel[12].setRotationPoint(-19F, -5F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 36
		bodyModel[13].setRotationPoint(-19F, -5F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 37
		bodyModel[14].setRotationPoint(-9F, -3F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 38
		bodyModel[15].setRotationPoint(-9F, -3F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[16].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[17].setRotationPoint(-38F, 1F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 29, 1, 3, 0F); // Box 156
		bodyModel[18].setRotationPoint(-38F, 1F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[19].setRotationPoint(-12F, 5F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[20].setRotationPoint(-12F, 5F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[21].setRotationPoint(-39F, -1F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[22].setRotationPoint(-39F, 7F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[23].setRotationPoint(-42F, 8F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[24].setRotationPoint(-39F, 7F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[25].setRotationPoint(-42F, -1F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[26].setRotationPoint(-42F, 2F, 7F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[27].setRotationPoint(-42F, 5F, 7F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[28].setRotationPoint(-42F, 5F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[29].setRotationPoint(-42F, -1F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[30].setRotationPoint(-42F, 2F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[31].setRotationPoint(-42F, 8F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[32].setRotationPoint(38F, -1F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[33].setRotationPoint(38F, 7F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[34].setRotationPoint(38F, 7F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[35].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[36].setRotationPoint(-42F, -3F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[37].setRotationPoint(-42F, -3F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[38].setRotationPoint(-42F, -9F, -8F);

		bodyModel[39].addBox(0F, 0F, 0F, 76, 2, 16, 0F); // Box 251
		bodyModel[39].setRotationPoint(-38F, 1F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[40].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[41].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[42].setRotationPoint(42.01F, -3F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[43].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[44].setRotationPoint(42.01F, -3F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[45].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[46].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 285
		bodyModel[46].setRotationPoint(-19F, -13F, 11.01F);

		bodyModel[47].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 288
		bodyModel[47].setRotationPoint(-4F, -9F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 300
		bodyModel[48].setRotationPoint(-19F, -13F, -11.01F);

		bodyModel[49].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 303
		bodyModel[49].setRotationPoint(-4F, -9F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[50].setRotationPoint(39F, -9F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[51].setRotationPoint(11F, 4F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[52].setRotationPoint(9F, 4F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[53].setRotationPoint(7F, 4F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[54].setRotationPoint(8F, 4F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[55].setRotationPoint(6F, 4F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 305
		bodyModel[56].setRotationPoint(7F, 1F, -9.01F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[57].setRotationPoint(-25.5F, 3F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[58].setRotationPoint(23.5F, 3F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 293
		bodyModel[59].setRotationPoint(-17F, -15.5F, -7.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[60].setRotationPoint(4F, 1F, -11.75F);
		bodyModel[60].rotateAngleX = 0.71558499F;

		bodyModel[61].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[61].setRotationPoint(4F, 1F, 11.75F);
		bodyModel[61].rotateAngleX = -0.71558499F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[62].setRotationPoint(8.5F, 3F, 9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[63].setRotationPoint(8.5F, 2F, 9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[64].setRotationPoint(8.75F, 3.5F, 9.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[65].setRotationPoint(8.75F, 1F, 7.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[66].setRotationPoint(-38F, 1F, 7F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[67].setRotationPoint(-39F, -1F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[68].setRotationPoint(36F, 1F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[69].setRotationPoint(38F, -1F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[70].setRotationPoint(-42F, 1F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[71].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[72].setRotationPoint(37F, 1F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r
		bodyModel[73].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[74].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[75].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[76].setRotationPoint(36F, 1F, 7F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[77].setRotationPoint(38F, -1F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[78].setRotationPoint(39F, -5F, -11.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[79].setRotationPoint(39F, -5F, 10.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[80].setRotationPoint(39F, -9F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[81].setRotationPoint(-8F, -13F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[82].setRotationPoint(-8F, -13F, 11F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 310
		bodyModel[83].setRotationPoint(6F, 3F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 318
		bodyModel[84].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[85].setRotationPoint(-26.5F, 1F, 8F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[86].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[87].setRotationPoint(-42F, 7F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		bodyModel[88].setRotationPoint(17F, -16F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[89].setRotationPoint(17F, -16F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 292
		bodyModel[90].setRotationPoint(17F, -14F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 294
		bodyModel[91].setRotationPoint(17F, -14F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 343
		bodyModel[92].setRotationPoint(-17F, -15.5F, 6.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 345
		bodyModel[93].setRotationPoint(25F, -7.5F, 6.75F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 346
		bodyModel[94].setRotationPoint(29.5F, -7F, 6.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 347
		bodyModel[95].setRotationPoint(29.5F, -7F, -7.75F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 348
		bodyModel[96].setRotationPoint(25F, -7.5F, -7.75F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 349
		bodyModel[97].setRotationPoint(21F, -7.5F, 6.75F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 350
		bodyModel[98].setRotationPoint(21F, -7.5F, -7.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 277
		bodyModel[99].setRotationPoint(-43F, -1F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 278
		bodyModel[100].setRotationPoint(42F, -1F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[101].setRotationPoint(-31F, 1F, 9F);
		bodyModel[101].rotateAngleZ = -0.27925268F;

		bodyModel[102].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[102].setRotationPoint(-36F, 1F, 9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 27, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 283
		bodyModel[103].setRotationPoint(11F, -16F, -7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 27, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[104].setRotationPoint(11F, -16F, 6.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 292
		bodyModel[105].setRotationPoint(-35F, -13F, -11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[106].setRotationPoint(-39F, -5F, -11.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[107].setRotationPoint(-39F, -10F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 295
		bodyModel[108].setRotationPoint(-37F, -13F, -11.01F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 296
		bodyModel[109].setRotationPoint(-37F, -10F, -11F);
		bodyModel[109].rotateAngleY = 1.11701072F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[110].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[110].rotateAngleY = -3.14159265F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[111].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[111].rotateAngleY = -3.14159265F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[112].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[112].rotateAngleY = -3.14159265F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[113].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[114].setRotationPoint(17F, -17F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 21, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[115].setRotationPoint(17F, -17F, 0F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[116].setRotationPoint(-39F, -10F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[117].setRotationPoint(-39F, -5F, 10.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 408
		bodyModel[118].setRotationPoint(-37F, -10F, 11F);
		bodyModel[118].rotateAngleY = 2.02458193F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 409
		bodyModel[119].setRotationPoint(-37F, -13F, 10.99F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 410
		bodyModel[120].setRotationPoint(-35F, -13F, 10.99F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[121].setRotationPoint(-42F, 6F, -8F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[122].setRotationPoint(-42F, 6F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[123].setRotationPoint(39F, 6F, 8F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[124].setRotationPoint(39F, 6F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 364 prime base
		bodyModel[125].setRotationPoint(-31F, -23.5F, 6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[126].setRotationPoint(-31F, -24.5F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[127].setRotationPoint(-31F, -24.5F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[128].setRotationPoint(-31F, -24.5F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[129].setRotationPoint(-31F, -24.5F, 6F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 431
		bodyModel[130].setRotationPoint(-42F, 1F, -7F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 432
		bodyModel[131].setRotationPoint(-42F, 1F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 433
		bodyModel[132].setRotationPoint(39F, 1F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 434
		bodyModel[133].setRotationPoint(39F, 1F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[134].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r
		bodyModel[135].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f
		bodyModel[136].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[137].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[138].setRotationPoint(39F, 8F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[139].setRotationPoint(39F, 5F, -9F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[140].setRotationPoint(39F, 2F, -9F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[141].setRotationPoint(39F, -1F, -8F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[142].setRotationPoint(39F, 8F, 8F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[143].setRotationPoint(39F, 5F, 7F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[144].setRotationPoint(39F, 2F, 7F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[145].setRotationPoint(39F, -1F, 7F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[146].setRotationPoint(-30.01F, -17F, -12F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[147].setRotationPoint(-30.01F, -17F, 11F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[148].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[149].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[150].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon r
		bodyModel[150].setRotationPoint(-22.5F, -24F, 9.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[151].setRotationPoint(-22.5F, -24F, 9.5F);

		bodyModel[152].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon l
		bodyModel[152].setRotationPoint(-22.5F, -24F, -10.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[153].setRotationPoint(-22.5F, -24F, -10.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 338 cull
		bodyModel[154].setRotationPoint(43F, -1F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 339 cull
		bodyModel[155].setRotationPoint(-45F, -1F, -2F);

		bodyModel[156].addBox(0F, 0F, 0F, 27, 15, 14, 0F); // Box 5
		bodyModel[156].setRotationPoint(11F, -16F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[157].setRotationPoint(11F, -17F, 7F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[158].setRotationPoint(11F, -17F, 0F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addBox(0F, 0F, 0F, 30, 15, 14, 0F); // Box 343
		bodyModel[159].setRotationPoint(-19F, -16F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[160].setRotationPoint(6.5F, -23.5F, -3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[161].setRotationPoint(-39F, -14F, 1F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[162].setRotationPoint(-39F, -14F, -1F);

		bodyModel[163].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[163].setRotationPoint(-38F, -14F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 71 glow markerlight
		bodyModel[164].setRotationPoint(-38.5F, -13F, -5.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[165].setRotationPoint(-39F, -14F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 glow markerlight
		bodyModel[166].setRotationPoint(-38.5F, -13F, 3.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[167].setRotationPoint(-38F, -15F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[168].setRotationPoint(-38.5F, -14.5F, -1F);

		bodyModel[169].addBox(0F, 0F, 0F, 6, 12, 0, 0F); // Box 338
		bodyModel[169].setRotationPoint(-38.5F, -15F, -5.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 340
		bodyModel[170].setRotationPoint(-38.5F, -15F, 5.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[171].setRotationPoint(-35.5F, -15F, 5.5F);
		bodyModel[171].rotateAngleY = -0.78539816F;

		bodyModel[172].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[172].setRotationPoint(-31.5F, -19F, -9.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 13, 1, 18, 0F); // Box 68
		bodyModel[173].setRotationPoint(-32F, -23F, -9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[174].setRotationPoint(-32F, -23F, 9F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[175].setRotationPoint(-20F, -19F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[176].setRotationPoint(-35F, -23F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[177].setRotationPoint(-34F, -23F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[178].setRotationPoint(-34F, -23F, 1F);

		bodyModel[179].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 72
		bodyModel[179].setRotationPoint(-32F, -19F, 10F);

		bodyModel[180].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 190
		bodyModel[180].setRotationPoint(-32F, -19F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[181].setRotationPoint(-32.05F, -22F, -6F);
		bodyModel[181].rotateAngleY = 0.38397244F;

		bodyModel[182].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[182].setRotationPoint(-32.05F, -22F, 6F);
		bodyModel[182].rotateAngleY = -0.38397244F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp headlight f
		bodyModel[183].setRotationPoint(-34.75F, -23F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp headlight f
		bodyModel[184].setRotationPoint(-34.75F, -21F, -1F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[185].setRotationPoint(-32F, -19F, -6F);

		bodyModel[186].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[186].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[187].setRotationPoint(-32F, -22F, -9F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[188].setRotationPoint(-20F, -22F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[189].setRotationPoint(-32F, -23F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 377
		bodyModel[190].setRotationPoint(11F, -17F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[191].setRotationPoint(11F, -17F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 139
		bodyModel[192].setRotationPoint(-42F, 8F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 386
		bodyModel[193].setRotationPoint(42F, 8F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[194].setRotationPoint(-44F, 6F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[195].setRotationPoint(-44F, 6F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[196].setRotationPoint(42F, 6F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[197].setRotationPoint(42F, 6F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[198].setRotationPoint(38F, -17F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[199].setRotationPoint(38F, -17F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[200].setRotationPoint(38F, -17F, 1F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[201].setRotationPoint(-18.95F, -22.5F, -6F);
		bodyModel[201].rotateAngleY = -0.38397244F;

		bodyModel[202].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[202].setRotationPoint(-18.95F, -22.5F, 6F);
		bodyModel[202].rotateAngleY = 0.38397244F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp headlight r
		bodyModel[203].setRotationPoint(39.75F, -17F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp headlight r
		bodyModel[204].setRotationPoint(39.75F, -15F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 402 glow markerlight
		bodyModel[205].setRotationPoint(37.25F, -13F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 403 glow markerlight
		bodyModel[206].setRotationPoint(37.25F, -13F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[207].setRotationPoint(-19F, -23F, -6F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 409
		bodyModel[208].setRotationPoint(-19F, -23F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[209].setRotationPoint(-19F, -23F, 1F);

		bodyModel[210].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 415
		bodyModel[210].setRotationPoint(-30F, -24.5F, -4F);

		bodyModel[211].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 416 cull
		bodyModel[211].setRotationPoint(-27F, -23F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[212].setRotationPoint(-31F, -22F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 335
		bodyModel[213].setRotationPoint(-31F, -22F, -9F);

		bodyModel[214].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 419 cull
		bodyModel[214].setRotationPoint(-27F, -23F, 9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[215].setRotationPoint(-29F, -19F, 11F);
		bodyModel[215].rotateAngleX = 0.26179939F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[216].setRotationPoint(-29F, -19.25F, -11.97F);
		bodyModel[216].rotateAngleX = -0.26179939F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[217].setRotationPoint(-26.5F, -24F, -10F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 423
		bodyModel[218].setRotationPoint(-24F, -24.5F, -7F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 424
		bodyModel[219].setRotationPoint(-24F, -24.5F, -2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[220].setRotationPoint(-24F, -25.5F, -5F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 426
		bodyModel[221].setRotationPoint(-27F, -26F, 6F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 427
		bodyModel[222].setRotationPoint(-23F, -23.5F, -3F);

		bodyModel[223].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 428
		bodyModel[223].setRotationPoint(-25F, -24F, 5F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[224].setRotationPoint(-31F, -14F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[225].setRotationPoint(-31.1F, -13F, 1F);
		bodyModel[225].rotateAngleY = -0.38397244F;

		bodyModel[226].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[226].setRotationPoint(-29.5F, -15F, 1F);
		bodyModel[226].rotateAngleY = -0.38397244F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[227].setRotationPoint(-45F, 4F, 3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[228].setRotationPoint(-45F, 6F, 0F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[229].setRotationPoint(-46F, 7F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[230].setRotationPoint(-46F, 7F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[231].setRotationPoint(-45F, 6F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, -2F, 1, 1, 7, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 285
		bodyModel[232].setRotationPoint(-45F, 4F, -8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 414
		bodyModel[233].setRotationPoint(-43F, 5F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[234].setRotationPoint(-43F, 5F, 2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 280
		bodyModel[235].setRotationPoint(44F, 4F, 3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 281
		bodyModel[236].setRotationPoint(44F, 6F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 282
		bodyModel[237].setRotationPoint(45F, 7F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 283
		bodyModel[238].setRotationPoint(45F, 7F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 284
		bodyModel[239].setRotationPoint(44F, 6F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, -2F, 1, 1, 7, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 285
		bodyModel[240].setRotationPoint(44F, 4F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 414
		bodyModel[241].setRotationPoint(42F, 5F, -10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 0F, -0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[242].setRotationPoint(42F, 5F, 2F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 884
		bodyModel[243].setRotationPoint(7F, 1F, 9.01F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[244].setRotationPoint(10.5F, -17.5F, -6.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[245].setRotationPoint(9F, -18.25F, -5.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[246].setRotationPoint(8F, -18.5F, -6.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[247].setRotationPoint(9.5F, -18.25F, -7.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 397
		bodyModel[248].setRotationPoint(-20.51F, -14F, -10F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398
		bodyModel[249].setRotationPoint(-20.5F, -12F, -8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[250].setRotationPoint(-30F, -18F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[251].setRotationPoint(-30F, -19F, 10F);
	}
}