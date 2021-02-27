//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.10.2020 - 12:06:33
// Last changed on: 04.10.2020 - 12:06:33

package ebf.bap.models.locomotives; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSD40T2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40T2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[343];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 112
		bodyModel[5] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 246
		bodyModel[8] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 247
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 259
		bodyModel[10] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 262
		bodyModel[11] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 264
		bodyModel[12] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 265
		bodyModel[13] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 261
		bodyModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		bodyModel[15] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 98
		bodyModel[20] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 197
		bodyModel[21] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 144
		bodyModel[23] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 145
		bodyModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 147
		bodyModel[25] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 148
		bodyModel[26] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 159
		bodyModel[34] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 246
		bodyModel[36] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 266
		bodyModel[37] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 179
		bodyModel[41] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 193
		bodyModel[49] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 52 door swing right
		bodyModel[50] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 72
		bodyModel[52] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 190
		bodyModel[53] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 313
		bodyModel[54] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 314 door swing right
		bodyModel[55] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 316
		bodyModel[56] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 201
		bodyModel[57] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 202
		bodyModel[58] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 207
		bodyModel[59] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 11
		bodyModel[60] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 210
		bodyModel[61] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 211
		bodyModel[62] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 48 lamp
		bodyModel[63] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 43
		bodyModel[64] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 44
		bodyModel[65] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 117 liveryimg 2 glow
		bodyModel[66] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 118 liveryimg 2 glow
		bodyModel[67] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 186 headlight front
		bodyModel[68] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 187 headlight front
		bodyModel[69] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 219
		bodyModel[70] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 220
		bodyModel[71] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 221
		bodyModel[72] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 222
		bodyModel[73] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 223
		bodyModel[74] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 224
		bodyModel[75] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 225
		bodyModel[76] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 226
		bodyModel[77] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 227
		bodyModel[78] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 229
		bodyModel[79] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 230
		bodyModel[80] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 231
		bodyModel[81] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 232
		bodyModel[82] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 233
		bodyModel[83] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 234
		bodyModel[84] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 235
		bodyModel[85] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 236
		bodyModel[86] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 255
		bodyModel[89] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 256
		bodyModel[90] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 241
		bodyModel[91] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 242
		bodyModel[92] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 244
		bodyModel[94] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 245
		bodyModel[95] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 246
		bodyModel[96] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 81
		bodyModel[97] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 81
		bodyModel[98] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 176
		bodyModel[99] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 177
		bodyModel[100] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 271
		bodyModel[101] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 274
		bodyModel[102] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 258
		bodyModel[103] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 259
		bodyModel[104] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 260
		bodyModel[105] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 261
		bodyModel[106] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 262
		bodyModel[107] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 263
		bodyModel[108] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 264
		bodyModel[109] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 265
		bodyModel[110] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 266
		bodyModel[111] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 267
		bodyModel[112] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 268
		bodyModel[113] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 269
		bodyModel[114] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 270
		bodyModel[115] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 271
		bodyModel[116] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 272
		bodyModel[117] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 273
		bodyModel[118] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 274
		bodyModel[119] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 275
		bodyModel[120] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 278
		bodyModel[121] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 280
		bodyModel[122] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 281
		bodyModel[123] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 282
		bodyModel[124] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 283
		bodyModel[125] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 284
		bodyModel[126] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 285
		bodyModel[127] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 286
		bodyModel[128] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 288
		bodyModel[129] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 291
		bodyModel[130] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 292
		bodyModel[131] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 293
		bodyModel[132] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 294
		bodyModel[133] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 295
		bodyModel[134] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 296
		bodyModel[135] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 302
		bodyModel[136] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 303
		bodyModel[137] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 304
		bodyModel[138] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 308
		bodyModel[139] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 309
		bodyModel[140] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 310
		bodyModel[141] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 311
		bodyModel[142] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 312
		bodyModel[143] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 313
		bodyModel[144] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 314
		bodyModel[145] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 315
		bodyModel[146] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 316
		bodyModel[147] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 317
		bodyModel[148] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 319
		bodyModel[149] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 176 glow
		bodyModel[150] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 176 glow
		bodyModel[151] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 43
		bodyModel[152] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 43
		bodyModel[153] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 43
		bodyModel[154] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 43
		bodyModel[155] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 43
		bodyModel[156] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 345
		bodyModel[157] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 346 cover
		bodyModel[158] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 100
		bodyModel[159] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 101
		bodyModel[160] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 102
		bodyModel[161] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 103
		bodyModel[162] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 104
		bodyModel[163] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 105
		bodyModel[164] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 355
		bodyModel[165] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 356
		bodyModel[166] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 379
		bodyModel[167] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 380
		bodyModel[168] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 381
		bodyModel[169] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 384
		bodyModel[170] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 385
		bodyModel[171] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 386
		bodyModel[172] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 387
		bodyModel[173] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 388
		bodyModel[174] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 389
		bodyModel[175] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 390
		bodyModel[176] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 391
		bodyModel[177] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 162 commander beacon
		bodyModel[178] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 165
		bodyModel[179] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 114
		bodyModel[180] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 74
		bodyModel[181] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 78
		bodyModel[182] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 78
		bodyModel[183] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 188
		bodyModel[184] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 189 ditchlight front a
		bodyModel[185] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 190 ditchlight front a
		bodyModel[186] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 239
		bodyModel[187] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 240 ditchlight rear a
		bodyModel[188] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 241ditchlight rear a
		bodyModel[189] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 242
		bodyModel[190] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 409
		bodyModel[191] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 410 commander beacon
		bodyModel[192] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 411
		bodyModel[193] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 412
		bodyModel[194] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 413
		bodyModel[195] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 414
		bodyModel[196] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 415
		bodyModel[197] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 416 ditchlight front b
		bodyModel[198] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 417
		bodyModel[199] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 418 ditchlight front b
		bodyModel[200] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 419
		bodyModel[201] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // box64
		bodyModel[202] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // box65
		bodyModel[203] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 350
		bodyModel[204] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 351
		bodyModel[205] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 336
		bodyModel[206] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 337 lamp
		bodyModel[207] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 338 lamp
		bodyModel[208] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 327
		bodyModel[209] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 328
		bodyModel[210] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 329
		bodyModel[211] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 330
		bodyModel[212] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 331
		bodyModel[213] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 332
		bodyModel[214] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 439
		bodyModel[215] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 86
		bodyModel[216] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 87
		bodyModel[217] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 86
		bodyModel[218] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 87
		bodyModel[219] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 451
		bodyModel[220] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 452
		bodyModel[221] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 326
		bodyModel[222] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 327
		bodyModel[223] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 329
		bodyModel[224] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 330
		bodyModel[225] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 19
		bodyModel[226] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 334
		bodyModel[227] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 340 commander beacon
		bodyModel[228] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 341
		bodyModel[229] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 629
		bodyModel[230] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 630
		bodyModel[231] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 726
		bodyModel[232] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 727
		bodyModel[233] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 369
		bodyModel[234] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 370
		bodyModel[235] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 371
		bodyModel[236] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 372
		bodyModel[237] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 373
		bodyModel[238] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 374
		bodyModel[239] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 364
		bodyModel[240] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 365
		bodyModel[241] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 366
		bodyModel[242] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 367
		bodyModel[243] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 368
		bodyModel[244] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 369
		bodyModel[245] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 370
		bodyModel[246] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 372
		bodyModel[247] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 373
		bodyModel[248] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 374
		bodyModel[249] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 375
		bodyModel[250] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 376
		bodyModel[251] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 448
		bodyModel[252] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 449
		bodyModel[253] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 448
		bodyModel[254] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 449
		bodyModel[255] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 381 sp mount
		bodyModel[256] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 382
		bodyModel[257] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 31 sp mount
		bodyModel[258] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 247 lamp gyralight rear
		bodyModel[259] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 248 lamp gyralight rear
		bodyModel[260] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 386 lamp rear
		bodyModel[261] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 387lamp rear
		bodyModel[262] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 388 light red gyralight rear
		bodyModel[263] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 389 sp mount
		bodyModel[264] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 390
		bodyModel[265] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 391
		bodyModel[266] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 392
		bodyModel[267] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 393
		bodyModel[268] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 42
		bodyModel[269] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 45
		bodyModel[270] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 42
		bodyModel[271] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 48 lamp
		bodyModel[272] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 294 lamp drgw
		bodyModel[273] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 295 lamp drgw
		bodyModel[274] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 296 nose cover
		bodyModel[275] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 298
		bodyModel[276] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 299 nose cover
		bodyModel[277] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 318
		bodyModel[278] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 319
		bodyModel[279] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 314 lamp sp
		bodyModel[280] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 315 lamp sp
		bodyModel[281] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 316 lamp sp gyralight
		bodyModel[282] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 317
		bodyModel[283] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 20
		bodyModel[284] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 297
		bodyModel[285] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 298 drgw mount
		bodyModel[286] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 299 lamp drgw rear
		bodyModel[287] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 300 lamp drgw rear
		bodyModel[288] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 409
		bodyModel[289] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 410 commander beacon
		bodyModel[290] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 303
		bodyModel[291] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 304
		bodyModel[292] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 305
		bodyModel[293] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 306
		bodyModel[294] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 307
		bodyModel[295] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 308
		bodyModel[296] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 309
		bodyModel[297] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 310
		bodyModel[298] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 311
		bodyModel[299] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 312
		bodyModel[300] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 313 drgw mount
		bodyModel[301] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 314
		bodyModel[302] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 320
		bodyModel[303] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 321
		bodyModel[304] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 323
		bodyModel[305] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 324
		bodyModel[306] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 272
		bodyModel[307] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 273
		bodyModel[308] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 275
		bodyModel[309] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 276
		bodyModel[310] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 329
		bodyModel[311] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 330
		bodyModel[312] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 331
		bodyModel[313] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 332
		bodyModel[314] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 333
		bodyModel[315] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 334
		bodyModel[316] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 335
		bodyModel[317] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 336
		bodyModel[318] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 337 ditchlight rear b
		bodyModel[319] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 338
		bodyModel[320] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 339
		bodyModel[321] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 340 ditchlight rear b
		bodyModel[322] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 341
		bodyModel[323] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 342
		bodyModel[324] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 114
		bodyModel[325] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 74
		bodyModel[326] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 78
		bodyModel[327] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 245
		bodyModel[328] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 260
		bodyModel[329] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 264
		bodyModel[330] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 268
		bodyModel[331] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 274
		bodyModel[332] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 283
		bodyModel[333] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 284
		bodyModel[334] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 291
		bodyModel[335] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 292
		bodyModel[336] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 293
		bodyModel[337] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 294
		bodyModel[338] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 295
		bodyModel[339] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 296
		bodyModel[340] = new ModelRendererTurbo(this, 469, 124, textureX, textureY); // Box 340
		bodyModel[341] = new ModelRendererTurbo(this, 415, 141, textureX, textureY); // Box 341
		bodyModel[342] = new ModelRendererTurbo(this, 469, 124, textureX, textureY); // Box 342

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-44F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 90, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-46F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[2].setRotationPoint(-19F, -2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 64, 21, 14, 0F); // Box 34
		bodyModel[3].setRotationPoint(-19F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 24, 6, 16, 0F); // Box 112
		bodyModel[4].setRotationPoint(-12.5F, 3F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(-45F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[6].setRotationPoint(-49.01F, 0F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[7].setRotationPoint(-49F, 2F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 247
		bodyModel[8].setRotationPoint(-49F, 2F, 9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[9].setRotationPoint(-45F, 2F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[10].setRotationPoint(-45F, 0F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[11].setRotationPoint(-45F, 5F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[12].setRotationPoint(-45F, 5F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[13].setRotationPoint(-45F, 0F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[14].setRotationPoint(-49.01F, -8F, -8F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[15].setRotationPoint(-49.01F, -8F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[16].setRotationPoint(-49F, -2F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[17].setRotationPoint(-49F, -2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[18].setRotationPoint(-53F, 4F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[19].setRotationPoint(-53.01F, 0F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 14, 0F); // Box 197
		bodyModel[20].setRotationPoint(-49F, 0F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[21].setRotationPoint(-49F, -8F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[22].setRotationPoint(-49F, -8F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[23].setRotationPoint(-50F, -8F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[24].setRotationPoint(-49F, -8F, 4F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[25].setRotationPoint(-49F, -8F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-52F, 7F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[27].setRotationPoint(-52F, 4F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[28].setRotationPoint(-52F, 8F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-52F, 7F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(-52.5F, 4F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-52F, 8F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(-50F, 3.5F, -2F);

		bodyModel[33].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 159
		bodyModel[33].setRotationPoint(-44F, 0F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[34].setRotationPoint(48F, 0F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 246
		bodyModel[35].setRotationPoint(48.01F, 2F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 3, 18, 0F); // Box 266
		bodyModel[36].setRotationPoint(44F, 0F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[37].setRotationPoint(43F, 2F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[38].setRotationPoint(48F, 4F, -1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 80
		bodyModel[39].setRotationPoint(50.01F, -8F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[40].setRotationPoint(49F, 0F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[41].setRotationPoint(48F, 7F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(48F, 4F, 2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[43].setRotationPoint(48F, 8F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[44].setRotationPoint(48F, 7F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[45].setRotationPoint(48.5F, 4F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[46].setRotationPoint(48F, 8F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[47].setRotationPoint(48F, 3.5F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[48].setRotationPoint(-49F, 2F, -3F);

		bodyModel[49].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[49].setRotationPoint(-30.5F, -18F, -10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[50].setRotationPoint(-20F, -18F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[51].setRotationPoint(-30F, -18F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[52].setRotationPoint(-30F, -18F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[53].setRotationPoint(-31F, -18F, -7F);

		bodyModel[54].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[54].setRotationPoint(-19.5F, -18F, 10.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[55].setRotationPoint(-31F, -4F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 201
		bodyModel[56].setRotationPoint(48.01F, 2F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 202
		bodyModel[57].setRotationPoint(48F, 0F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[58].setRotationPoint(48F, 7F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[59].setRotationPoint(-31F, -21F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[60].setRotationPoint(-20F, -21F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[61].setRotationPoint(-31F, -21F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 lamp
		bodyModel[62].setRotationPoint(-33F, -21F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[63].setRotationPoint(-33F, -21F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[64].setRotationPoint(-33F, -21F, 1F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[65].setRotationPoint(-31.05F, -19.5F, -6F);
		bodyModel[65].rotateAngleY = 0.38397244F;

		bodyModel[66].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[66].setRotationPoint(-31.05F, -19.5F, 6F);
		bodyModel[66].rotateAngleY = -0.38397244F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[67].setRotationPoint(-33.5F, -21F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[68].setRotationPoint(-33.5F, -19F, -1F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[69].setRotationPoint(-20F, -21F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[70].setRotationPoint(-30F, -21F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[71].setRotationPoint(-30F, -21F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[72].setRotationPoint(-30F, -21F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[73].setRotationPoint(-20F, -21F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[74].setRotationPoint(-31F, -21F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[75].setRotationPoint(48F, 8F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[76].setRotationPoint(-49F, 8F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[77].setRotationPoint(-49F, 7F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[78].setRotationPoint(-44F, 1F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[79].setRotationPoint(-44F, 1F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 231
		bodyModel[80].setRotationPoint(13F, 1F, 7F);

		bodyModel[81].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 232
		bodyModel[81].setRotationPoint(13F, 1F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 24, 4, 3, 0F); // Box 233
		bodyModel[82].setRotationPoint(-12.5F, 3F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[83].setRotationPoint(-12.5F, 7F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 24, 4, 3, 0F); // Box 235
		bodyModel[84].setRotationPoint(-12.5F, 3F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 236
		bodyModel[85].setRotationPoint(-12.5F, 7F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[86].setRotationPoint(-7F, 1F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[87].setRotationPoint(-7F, 2F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[88].setRotationPoint(-7F, 2F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[89].setRotationPoint(-7F, 1F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[90].setRotationPoint(-14F, 1F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[91].setRotationPoint(-14F, 1F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[92].setRotationPoint(12F, 1F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[93].setRotationPoint(12F, 1F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[94].setRotationPoint(-38F, -4F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[95].setRotationPoint(-38F, -4F, 7F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[96].setRotationPoint(-45F, -8F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[97].setRotationPoint(-45F, -6F, -11.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[98].setRotationPoint(-45F, -6F, 10.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[99].setRotationPoint(-45F, -8F, 9F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[100].setRotationPoint(-49F, 1F, -8F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[101].setRotationPoint(-49F, 3F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 258
		bodyModel[102].setRotationPoint(-45F, -8F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 259
		bodyModel[103].setRotationPoint(-43F, -7F, -11F);

		bodyModel[104].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 260
		bodyModel[104].setRotationPoint(-37F, -12F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[105].setRotationPoint(-41F, -8F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 262
		bodyModel[106].setRotationPoint(-36F, -11F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 263
		bodyModel[107].setRotationPoint(-36F, -11F, 11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 264
		bodyModel[108].setRotationPoint(-43F, -7F, 11F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 265
		bodyModel[109].setRotationPoint(-45F, -8F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[110].setRotationPoint(-41F, -8F, 11F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 267
		bodyModel[111].setRotationPoint(-37F, -12F, 11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[112].setRotationPoint(-51F, 0F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[113].setRotationPoint(-51F, 0F, 0F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[114].setRotationPoint(-19F, -10F, -10F);

		bodyModel[115].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[115].setRotationPoint(-16F, -13F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[116].setRotationPoint(-16F, -15F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[117].setRotationPoint(-17F, -22F, -6F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[118].setRotationPoint(-8F, -22.5F, -2.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[119].setRotationPoint(-9F, -21.5F, -4F);

		bodyModel[120].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[120].setRotationPoint(-3F, -22F, -3F);

		bodyModel[121].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[121].setRotationPoint(4F, -22F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[122].setRotationPoint(-39F, -4F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[123].setRotationPoint(-40F, -4F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[124].setRotationPoint(-40F, -4F, 11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[125].setRotationPoint(-39F, -4F, 11F);

		bodyModel[126].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[126].setRotationPoint(-18F, -20.5F, -7.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[127].setRotationPoint(-18F, -20.5F, 6.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 288
		bodyModel[128].setRotationPoint(44F, 2F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 59, 8, 0, 0F); // Box 291
		bodyModel[129].setRotationPoint(-15F, -8F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[130].setRotationPoint(-19F, -4F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[131].setRotationPoint(-17F, -4F, 11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[132].setRotationPoint(-16F, -4F, 11F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[133].setRotationPoint(-19F, -12F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[134].setRotationPoint(-18F, -10F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[135].setRotationPoint(-50F, 0F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[136].setRotationPoint(-50F, 0F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[137].setRotationPoint(-50F, 0F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[138].setRotationPoint(-19F, -21F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[139].setRotationPoint(-9F, -21F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[140].setRotationPoint(-19F, -21F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[141].setRotationPoint(-9F, -21F, 7F);

		bodyModel[142].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 312
		bodyModel[142].setRotationPoint(-16F, -10F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[143].setRotationPoint(-18F, -12F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[144].setRotationPoint(-19F, -12F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[145].setRotationPoint(20F, -10F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 22, 8, 0, 0F); // Box 316
		bodyModel[146].setRotationPoint(22F, -8F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[147].setRotationPoint(12F, -22F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 319
		bodyModel[148].setRotationPoint(-42F, -13.5F, -0.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[149].setRotationPoint(-41.9F, -11.5F, 5.5F);
		bodyModel[149].rotateAngleY = -0.43633231F;

		bodyModel[150].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[150].setRotationPoint(-41.9F, -11.5F, -5.5F);
		bodyModel[150].rotateAngleY = 0.43633231F;

		bodyModel[151].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[151].setRotationPoint(-41F, -13F, -7F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[152].setRotationPoint(-40F, -13F, -6F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[153].setRotationPoint(-40F, -13F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[154].setRotationPoint(-39.5F, -8.5F, -7F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[155].setRotationPoint(-39F, -6.5F, -7F);

		bodyModel[156].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[156].setRotationPoint(-38F, -13F, -7F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[157].setRotationPoint(-40F, -9F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[158].setRotationPoint(-3F, -21F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[159].setRotationPoint(-3F, -21F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[160].setRotationPoint(-8F, -21F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[161].setRotationPoint(10F, -21F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[162].setRotationPoint(10F, -21F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[163].setRotationPoint(-8F, -21F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[164].setRotationPoint(-40F, -12F, -7.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[165].setRotationPoint(-39F, -11F, -7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[166].setRotationPoint(12F, -22.5F, -6F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[167].setRotationPoint(11F, -23.5F, -5.75F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[168].setRotationPoint(10F, -23.5F, -4.25F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[169].setRotationPoint(-33.75F, -23F, -1.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[170].setRotationPoint(-32.25F, -23F, -0.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[171].setRotationPoint(-33F, -23F, 0.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[172].setRotationPoint(-32F, -22.5F, -0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 388
		bodyModel[173].setRotationPoint(-28F, -22.5F, -4F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[174].setRotationPoint(-30F, -22F, -9F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 390
		bodyModel[175].setRotationPoint(-30F, -22F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[176].setRotationPoint(-30F, -22F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[177].setRotationPoint(-29.5F, -24F, -8.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[178].setRotationPoint(-29.32F, -23F, -8.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[179].setRotationPoint(-15F, 3F, -10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[180].setRotationPoint(-15F, 2F, -10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[181].setRotationPoint(-14.75F, 3.5F, -10.25F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[182].setRotationPoint(-49F, -2F, 4.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[183].setRotationPoint(-49F, -2F, -6.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[184].setRotationPoint(-49.25F, -2F, 4.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[185].setRotationPoint(-49.25F, -2F, -6.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[186].setRotationPoint(49F, -2F, -6.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[187].setRotationPoint(49.25F, -2F, -6.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241ditchlight rear a
		bodyModel[188].setRotationPoint(49.25F, -2F, 4.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[189].setRotationPoint(49F, -2F, 4.75F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[190].setRotationPoint(-30.32F, -22F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[191].setRotationPoint(-30.5F, -23F, -0.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[192].setRotationPoint(-30F, 2F, -11F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[193].setRotationPoint(-30F, 2F, 7F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[194].setRotationPoint(27F, 2F, 7F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[195].setRotationPoint(27F, 2F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[196].setRotationPoint(-27F, -22F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight front b
		bodyModel[197].setRotationPoint(-49.75F, 1F, -5.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[198].setRotationPoint(-49.5F, 1F, -5.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight front b
		bodyModel[199].setRotationPoint(-49.75F, 1F, 3.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[200].setRotationPoint(-49.5F, 1F, 3.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[201].setRotationPoint(-29F, -18F, 11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[202].setRotationPoint(-29F, -18F, -12F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[203].setRotationPoint(-28F, -16F, -12F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[204].setRotationPoint(-28F, -16F, 11F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[205].setRotationPoint(-33F, -23F, -2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[206].setRotationPoint(-33.75F, -23F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[207].setRotationPoint(-33.75F, -23F, -2F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[208].setRotationPoint(3.5F, -22.5F, -8.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[209].setRotationPoint(4.5F, -22.25F, -7.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[210].setRotationPoint(4F, -22.25F, -9.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[211].setRotationPoint(6F, -21.5F, -8.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[212].setRotationPoint(5F, -23.5F, -7.75F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[213].setRotationPoint(5F, -23.5F, -9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[214].setRotationPoint(-15F, -23F, -3F);

		bodyModel[215].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[215].setRotationPoint(-30.1F, -12F, -5F);
		bodyModel[215].rotateAngleY = -0.38397244F;

		bodyModel[216].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[216].setRotationPoint(-30F, -13F, -4F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[217].setRotationPoint(-27F, -14F, -5.5F);
		bodyModel[217].rotateAngleY = -0.38397244F;

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[218].setRotationPoint(-29F, -13.75F, -4F);
		bodyModel[218].rotateAngleY = -0.38397244F;

		bodyModel[219].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[219].setRotationPoint(-49F, 3F, 7F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 452
		bodyModel[220].setRotationPoint(-49F, 1F, 7F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[221].setRotationPoint(44F, 8F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[222].setRotationPoint(44F, 5.5F, -11F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[223].setRotationPoint(44F, 3F, -11F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 330
		bodyModel[224].setRotationPoint(44F, 0F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[225].setRotationPoint(-9.5F, 2F, -11.5F);
		bodyModel[225].rotateAngleX = 0.87266463F;

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[226].setRotationPoint(-9.5F, 3.5F, 8.75F);
		bodyModel[226].rotateAngleX = 0.87266463F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 commander beacon
		bodyModel[227].setRotationPoint(-26.5F, -23F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[228].setRotationPoint(-26.32F, -22F, -0.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[229].setRotationPoint(-28F, 4F, -1F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[230].setRotationPoint(-35F, 4F, -1F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[231].setRotationPoint(32F, 4F, -1F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[232].setRotationPoint(25F, 4F, -1F);

		bodyModel[233].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[233].setRotationPoint(-20F, -23F, 2F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[234].setRotationPoint(-20F, -23F, 2F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[235].setRotationPoint(-20F, -23F, 6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[236].setRotationPoint(-20F, -24F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[237].setRotationPoint(-17F, -23F, 6F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[238].setRotationPoint(-17F, -23F, 2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 364
		bodyModel[239].setRotationPoint(49F, 0F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[240].setRotationPoint(21F, -21F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		bodyModel[241].setRotationPoint(21F, -21F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[242].setRotationPoint(21F, -23F, -8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[243].setRotationPoint(21F, -23F, 0F);

		bodyModel[244].addBox(0F, 0F, 0F, 19, 8, 1, 0F); // Box 369
		bodyModel[244].setRotationPoint(25F, -8.5F, -7.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 19, 8, 1, 0F); // Box 370
		bodyModel[245].setRotationPoint(25F, -8.5F, 6.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 372
		bodyModel[246].setRotationPoint(44F, 5.5F, 9F);

		bodyModel[247].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 373
		bodyModel[247].setRotationPoint(44F, 2F, 9F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 374
		bodyModel[248].setRotationPoint(44F, 3F, 9F);

		bodyModel[249].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 375
		bodyModel[249].setRotationPoint(44F, 0F, 9F);

		bodyModel[250].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 376
		bodyModel[250].setRotationPoint(44F, 8F, 9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[251].setRotationPoint(48F, 5F, 2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 449
		bodyModel[252].setRotationPoint(48F, 5F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[253].setRotationPoint(-52F, 5F, 2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[254].setRotationPoint(-52F, 5F, -10F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 381 sp mount
		bodyModel[255].setRotationPoint(44F, -22F, -2F);

		bodyModel[256].addBox(0F, 0F, 0F, 23, 1, 16, 0F); // Box 382
		bodyModel[256].setRotationPoint(21F, -22F, -8F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[257].setRotationPoint(46F, -20F, -2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[258].setRotationPoint(46.25F, -20F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[259].setRotationPoint(46.25F, -20F, 0F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp rear
		bodyModel[260].setRotationPoint(45.25F, -18F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387lamp rear
		bodyModel[261].setRotationPoint(45.25F, -18F, -2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[262].setRotationPoint(46.25F, -22F, -1F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[263].setRotationPoint(46F, -22F, -1F);

		bodyModel[264].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 390
		bodyModel[264].setRotationPoint(48F, -8F, -11F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 391
		bodyModel[265].setRotationPoint(48F, -8F, 11F);

		bodyModel[266].addBox(-0.5F, 0F, -1F, 1, 2, 2, 0F); // Box 392
		bodyModel[266].setRotationPoint(45F, -16F, -6.25F);
		bodyModel[266].rotateAngleY = -0.36651914F;

		bodyModel[267].addBox(-0.5F, 0F, -1F, 1, 2, 2, 0F); // Box 393
		bodyModel[267].setRotationPoint(45F, -16F, 6.25F);
		bodyModel[267].rotateAngleY = 0.36651914F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[268].setRotationPoint(-44F, -8F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[269].setRotationPoint(-44F, -8F, 0F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[270].setRotationPoint(-44F, -10F, 1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48 lamp
		bodyModel[271].setRotationPoint(-42.98F, -13F, -1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp drgw
		bodyModel[272].setRotationPoint(-44F, -10F, -1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp drgw
		bodyModel[273].setRotationPoint(-44F, -12F, -1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[274].setRotationPoint(-44F, -13F, 0F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[275].setRotationPoint(-44F, -10F, -7F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[276].setRotationPoint(-44F, -13F, -1F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[277].setRotationPoint(-44F, -13F, 1F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[278].setRotationPoint(-44F, -13F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp
		bodyModel[279].setRotationPoint(-43.75F, -12F, -2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp
		bodyModel[280].setRotationPoint(-43.75F, -12F, 0F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp gyralight
		bodyModel[281].setRotationPoint(-43.75F, -14F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[282].setRotationPoint(-42.98F, -14F, -1.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[283].setRotationPoint(-43.15F, -13F, -2F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 297
		bodyModel[284].setRotationPoint(-29F, -23F, 0F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 298 drgw mount
		bodyModel[285].setRotationPoint(45F, -21F, -1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 299 lamp drgw rear
		bodyModel[286].setRotationPoint(45.25F, -21F, -1F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 300 lamp drgw rear
		bodyModel[287].setRotationPoint(45.25F, -19F, -1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[288].setRotationPoint(-32.32F, -22F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[289].setRotationPoint(-32.5F, -23F, -0.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 303
		bodyModel[290].setRotationPoint(-30.5F, -23F, 2.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 304
		bodyModel[291].setRotationPoint(-30.25F, -22.5F, 2.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 305
		bodyModel[292].setRotationPoint(-31.25F, -23F, 3.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 306
		bodyModel[293].setRotationPoint(-32F, -23F, 1.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 307
		bodyModel[294].setRotationPoint(14F, -23F, -1.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 308
		bodyModel[295].setRotationPoint(15.5F, -23F, -0.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 309
		bodyModel[296].setRotationPoint(15.75F, -22.5F, -0.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 310
		bodyModel[297].setRotationPoint(14.75F, -23F, 0.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[298].setRotationPoint(44F, -22F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[299].setRotationPoint(44F, -22F, 0F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 313 drgw mount
		bodyModel[300].setRotationPoint(43.5F, -22F, -1.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 314
		bodyModel[301].setRotationPoint(48F, 7F, -9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[302].setRotationPoint(-30F, -22.5F, -6F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[303].setRotationPoint(-30F, -23.5F, -6F);

		bodyModel[304].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 323
		bodyModel[304].setRotationPoint(-29.5F, -24F, -5.75F);

		bodyModel[305].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 324
		bodyModel[305].setRotationPoint(-29.5F, -23F, -3.75F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[306].setRotationPoint(-49F, 8F, -11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[307].setRotationPoint(-49F, 5F, -10F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[308].setRotationPoint(-49F, 7F, -9F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[309].setRotationPoint(-49F, 4F, -8F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 329
		bodyModel[310].setRotationPoint(44F, 7F, -9F);

		bodyModel[311].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 330
		bodyModel[311].setRotationPoint(44F, 4.5F, -9F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 331
		bodyModel[312].setRotationPoint(44F, 4.5F, 9F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[313].setRotationPoint(44F, 7F, 9F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 333
		bodyModel[314].setRotationPoint(-49F, 7F, 9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[315].setRotationPoint(-49F, 8F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[316].setRotationPoint(-49F, 5F, 8F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 336
		bodyModel[317].setRotationPoint(-49F, 4F, 8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ditchlight rear b
		bodyModel[318].setRotationPoint(47.75F, 2F, 3.75F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 338
		bodyModel[319].setRotationPoint(47.5F, 2F, 3.75F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
		bodyModel[320].setRotationPoint(47.5F, 2F, -5.75F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 340 ditchlight rear b
		bodyModel[321].setRotationPoint(47.75F, 2F, -5.75F);

		bodyModel[322].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 341
		bodyModel[322].setRotationPoint(43F, -23.5F, 5.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 342
		bodyModel[323].setRotationPoint(43.5F, -22.5F, 5.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[324].setRotationPoint(13.5F, -19.5F, 7.7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[325].setRotationPoint(13.5F, -20.5F, 7.7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[326].setRotationPoint(13.75F, -19F, 7.95F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[327].setRotationPoint(13.5F, -21.5F, 6.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[328].setRotationPoint(-25F, -28F, 6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[329].setRotationPoint(-25F, -28F, 8F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[330].setRotationPoint(-25F, -27F, 5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[331].setRotationPoint(-25F, -27F, 8F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[332].setRotationPoint(-25F, -25F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[333].setRotationPoint(-25F, -25F, 5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[334].setRotationPoint(-25F, -25F, -8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[335].setRotationPoint(-25F, -25F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[336].setRotationPoint(-25F, -27F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[337].setRotationPoint(-25F, -27F, -8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[338].setRotationPoint(-25F, -28F, -8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[339].setRotationPoint(-25F, -28F, -9F);

		bodyModel[340].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 340
		bodyModel[340].setRotationPoint(25F, -9F, -7F);

		bodyModel[341].addBox(0F, 0F, 0F, 19, 0, 14, 0F); // Box 341
		bodyModel[341].setRotationPoint(25F, -9F, -7F);

		bodyModel[342].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 342
		bodyModel[342].setRotationPoint(44F, -9F, -7F);
	}
}