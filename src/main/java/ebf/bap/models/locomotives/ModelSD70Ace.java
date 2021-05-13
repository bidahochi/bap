//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.02.2021 - 12:45:27
// Last changed on: 04.02.2021 - 12:45:27

package ebf.bap.models.locomotives; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSD70Ace extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD70Ace() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[247];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 34
		bodyModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 81
		bodyModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 96
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 97
		bodyModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 100
		bodyModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 138
		bodyModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 122
		bodyModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 125
		bodyModel[9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 128
		bodyModel[10] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 76
		bodyModel[11] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 85
		bodyModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 85
		bodyModel[13] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 138
		bodyModel[14] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 119
		bodyModel[15] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 131
		bodyModel[17] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 69 door engineer side
		bodyModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 135
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 138
		bodyModel[20] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 139
		bodyModel[21] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 137
		bodyModel[22] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 136
		bodyModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 138
		bodyModel[24] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 148
		bodyModel[25] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 154
		bodyModel[26] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 155
		bodyModel[27] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 158
		bodyModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 166
		bodyModel[29] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 171
		bodyModel[30] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Exhaust
		bodyModel[31] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 119
		bodyModel[32] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 131
		bodyModel[33] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 140
		bodyModel[37] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 147
		bodyModel[38] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 173
		bodyModel[41] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 174
		bodyModel[42] = new ModelRendererTurbo(this, 6, 149, textureX, textureY); // Box 175
		bodyModel[43] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 176
		bodyModel[44] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 188
		bodyModel[45] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 189
		bodyModel[46] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 191
		bodyModel[47] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 192
		bodyModel[48] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 346
		bodyModel[49] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 218
		bodyModel[50] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 219
		bodyModel[51] = new ModelRendererTurbo(this, 6, 159, textureX, textureY); // Box 220
		bodyModel[52] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 221
		bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 162
		bodyModel[54] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 163
		bodyModel[55] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 164
		bodyModel[56] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 193
		bodyModel[57] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 197
		bodyModel[58] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 198
		bodyModel[59] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 199
		bodyModel[60] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 211
		bodyModel[61] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 212
		bodyModel[62] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 347
		bodyModel[63] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 222
		bodyModel[64] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 223
		bodyModel[65] = new ModelRendererTurbo(this, 6, 159, textureX, textureY); // Box 224
		bodyModel[66] = new ModelRendererTurbo(this, 5, 155, textureX, textureY); // Box 225
		bodyModel[67] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 226
		bodyModel[68] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 227
		bodyModel[69] = new ModelRendererTurbo(this, 6, 149, textureX, textureY); // Box 228
		bodyModel[70] = new ModelRendererTurbo(this, 5, 145, textureX, textureY); // Box 229
		bodyModel[71] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 204
		bodyModel[72] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 205
		bodyModel[73] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 206
		bodyModel[74] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 207
		bodyModel[75] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 212
		bodyModel[76] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 232
		bodyModel[77] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 233
		bodyModel[78] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 234
		bodyModel[79] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 31
		bodyModel[80] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 247 lamp cab headlight
		bodyModel[81] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 248 lamp cab headlight
		bodyModel[82] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 223
		bodyModel[83] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 224
		bodyModel[84] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 226
		bodyModel[85] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 228
		bodyModel[86] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 234
		bodyModel[87] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 122
		bodyModel[88] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 154 lamp nose light
		bodyModel[89] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 155 lamp nose light
		bodyModel[90] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 314 door swing right
		bodyModel[91] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 254
		bodyModel[92] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 78
		bodyModel[93] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 189 lamp ditchlight front up
		bodyModel[94] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 150 lamp ditchlight front up
		bodyModel[95] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 151
		bodyModel[96] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 129
		bodyModel[97] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 131
		bodyModel[98] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 132
		bodyModel[99] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 231
		bodyModel[100] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 214
		bodyModel[101] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 215
		bodyModel[102] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 265
		bodyModel[103] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 266
		bodyModel[104] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 267
		bodyModel[105] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 268
		bodyModel[106] = new ModelRendererTurbo(this, 113, 166, textureX, textureY); // Box 131
		bodyModel[107] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 272
		bodyModel[108] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 209
		bodyModel[109] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 210
		bodyModel[110] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 211 lamp ditchlight back up
		bodyModel[111] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 213 lamp ditchlight back up
		bodyModel[113] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 214
		bodyModel[114] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 162 glowey boi
		bodyModel[115] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 165
		bodyModel[116] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 218 FR
		bodyModel[117] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 221 FR
		bodyModel[118] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 222 FR
		bodyModel[119] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 355
		bodyModel[120] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 356
		bodyModel[121] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 381
		bodyModel[122] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 238
		bodyModel[123] = new ModelRendererTurbo(this, 8, 162, textureX, textureY); // Box 279
		bodyModel[124] = new ModelRendererTurbo(this, 8, 162, textureX, textureY); // Box 280
		bodyModel[125] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 282
		bodyModel[126] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 243
		bodyModel[127] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 244
		bodyModel[128] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 245
		bodyModel[129] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 246
		bodyModel[130] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 248
		bodyModel[131] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 249
		bodyModel[132] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 253
		bodyModel[133] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 256
		bodyModel[134] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 257
		bodyModel[135] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 258
		bodyModel[136] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 262
		bodyModel[137] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 263
		bodyModel[138] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 264
		bodyModel[139] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 265
		bodyModel[140] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 267
		bodyModel[141] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 269
		bodyModel[142] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 270
		bodyModel[143] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 271
		bodyModel[144] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 273
		bodyModel[145] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 274
		bodyModel[146] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 275
		bodyModel[147] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 276
		bodyModel[148] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 277
		bodyModel[149] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 351 sandcap
		bodyModel[150] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 279
		bodyModel[151] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 280
		bodyModel[152] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 281
		bodyModel[153] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 282
		bodyModel[154] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 283
		bodyModel[155] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 284
		bodyModel[156] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 285
		bodyModel[157] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 237
		bodyModel[158] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 287
		bodyModel[159] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 288
		bodyModel[160] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 289
		bodyModel[161] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 280
		bodyModel[162] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 281
		bodyModel[163] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 282
		bodyModel[164] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 283
		bodyModel[165] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 284
		bodyModel[166] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 285
		bodyModel[167] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 296
		bodyModel[168] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 297
		bodyModel[169] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 298
		bodyModel[170] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 299
		bodyModel[171] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 300
		bodyModel[172] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 301
		bodyModel[173] = new ModelRendererTurbo(this, 8, 162, textureX, textureY); // Box 302
		bodyModel[174] = new ModelRendererTurbo(this, 8, 162, textureX, textureY); // Box 303
		bodyModel[175] = new ModelRendererTurbo(this, 8, 153, textureX, textureY); // Box 304
		bodyModel[176] = new ModelRendererTurbo(this, 8, 153, textureX, textureY); // Box 305
		bodyModel[177] = new ModelRendererTurbo(this, 8, 153, textureX, textureY); // Box 306
		bodyModel[178] = new ModelRendererTurbo(this, 8, 153, textureX, textureY); // Box 307
		bodyModel[179] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 308
		bodyModel[180] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 309
		bodyModel[181] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 310
		bodyModel[182] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 311
		bodyModel[183] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 312
		bodyModel[184] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 130
		bodyModel[185] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 220
		bodyModel[186] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 31
		bodyModel[187] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 247 lamp headlight rear
		bodyModel[188] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 248 lampheadlight rear
		bodyModel[189] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 233
		bodyModel[190] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 325
		bodyModel[191] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 326
		bodyModel[192] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 327
		bodyModel[193] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 328
		bodyModel[194] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 329
		bodyModel[195] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 330
		bodyModel[196] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 331
		bodyModel[197] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 332
		bodyModel[198] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 333
		bodyModel[199] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 334
		bodyModel[200] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 335
		bodyModel[201] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 336
		bodyModel[202] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 337
		bodyModel[203] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 338
		bodyModel[204] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 339
		bodyModel[205] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 340
		bodyModel[206] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 341
		bodyModel[207] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 342
		bodyModel[208] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 343
		bodyModel[209] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 344
		bodyModel[210] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 345
		bodyModel[211] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 346
		bodyModel[212] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 347
		bodyModel[213] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 348
		bodyModel[214] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 349
		bodyModel[215] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 350
		bodyModel[216] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 296
		bodyModel[217] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 280
		bodyModel[218] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 281
		bodyModel[219] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 282
		bodyModel[220] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 355 numberboard
		bodyModel[221] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 356 numberboard
		bodyModel[222] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 114
		bodyModel[223] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 74
		bodyModel[224] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 78
		bodyModel[225] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 877
		bodyModel[226] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 361
		bodyModel[227] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 362
		bodyModel[228] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 363
		bodyModel[229] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 364
		bodyModel[230] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 365
		bodyModel[231] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 366
		bodyModel[232] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 367
		bodyModel[233] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 368
		bodyModel[234] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 369
		bodyModel[235] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 370 up 4141 bit
		bodyModel[236] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 370 up 4141 bit
		bodyModel[237] = new ModelRendererTurbo(this, 404, 65, textureX, textureY); // Box 239
		bodyModel[238] = new ModelRendererTurbo(this, 313, 131, textureX, textureY); // Box 240
		bodyModel[239] = new ModelRendererTurbo(this, 392, 124, textureX, textureY); // Box 241
		bodyModel[240] = new ModelRendererTurbo(this, 90, 172, textureX, textureY); // Box 413
		bodyModel[241] = new ModelRendererTurbo(this, 88, 165, textureX, textureY); // Box 86
		bodyModel[242] = new ModelRendererTurbo(this, 125, 170, textureX, textureY); // Box 244
		bodyModel[243] = new ModelRendererTurbo(this, 116, 182, textureX, textureY); // Box 245
		bodyModel[244] = new ModelRendererTurbo(this, 113, 166, textureX, textureY); // Box 246
		bodyModel[245] = new ModelRendererTurbo(this, 125, 158, textureX, textureY); // Box 247
		bodyModel[246] = new ModelRendererTurbo(this, 130, 172, textureX, textureY); // Box 248

		bodyModel[0].addBox(0F, 0F, 0F, 91, 1, 4, 0F); // Box 31
		bodyModel[0].setRotationPoint(-46F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 91, 1, 4, 0F); // Box 34
		bodyModel[1].setRotationPoint(-46F, -1F, 7F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 81
		bodyModel[2].setRotationPoint(31F, 1F, -11F);

		bodyModel[3].addBox(-1F, 0F, 0F, 24, 22, 14, 0F); // Box 96
		bodyModel[3].setRotationPoint(-23F, -23F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 19, 19, 14, 0F); // Box 97
		bodyModel[4].setRotationPoint(0F, -20F, -7F);

		bodyModel[5].addShapeBox(3F, 0F, 0F, 1, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[5].setRotationPoint(-28F, -21F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[6].setRotationPoint(-24F, -6F, 7F);

		bodyModel[7].addBox(0F, 0F, 0F, 57, 8, 0, 0F); // Box 122
		bodyModel[7].setRotationPoint(-11F, -9F, 11.01F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[8].setRotationPoint(-16F, -14F, 11.01F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 54, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[9].setRotationPoint(-8F, -9F, -11.01F);

		bodyModel[10].addBox(0F, 0F, -9F, 31, 2, 4, 0F); // Box 76
		bodyModel[10].setRotationPoint(-16F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, -1F, -9F, 31, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 85
		bodyModel[11].setRotationPoint(-16F, 8F, -1.5F);

		bodyModel[12].addShapeBox(0F, -2F, -9F, 31, 2, 24, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 85
		bodyModel[12].setRotationPoint(-16F, 7F, -3F);

		bodyModel[13].addBox(0F, 0F, 0F, 31, 2, 4, 0F); // Box 138
		bodyModel[13].setRotationPoint(-16F, 3F, 7F);

		bodyModel[14].addBox(3F, 0F, 0F, 10, 8, 1, 0F); // Box 119
		bodyModel[14].setRotationPoint(-38F, -21F, -11F);

		bodyModel[15].addBox(3F, 0F, 0F, 11, 7, 1, 0F); // Box 121
		bodyModel[15].setRotationPoint(-39F, -13F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 9, 22, 0F); // Box 131
		bodyModel[16].setRotationPoint(-37F, -15F, -11F);

		bodyModel[17].addTrapezoid(0F, 0F, 0.2F, 1, 15, 5, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 69 door engineer side
		bodyModel[17].setRotationPoint(-49.25F, -16F, 1.1F);
		bodyModel[17].rotateAngleY = -0.29670597F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[18].setRotationPoint(-38F, 1F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 138
		bodyModel[19].setRotationPoint(16F, 0F, 9F);

		bodyModel[20].addBox(0F, 0F, -9F, 31, 2, 14, 0F); // Box 139
		bodyModel[20].setRotationPoint(-16F, 3F, 2F);

		bodyModel[21].addBox(0F, 0F, 0F, 13, 5, 22, 0F); // Box 137
		bodyModel[21].setRotationPoint(-37F, -6F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[22].setRotationPoint(-26F, 2F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[23].setRotationPoint(-22F, 0F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 14, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[24].setRotationPoint(-43F, -15F, 6F);

		bodyModel[25].addBox(0F, 0F, 0F, 13, 3, 14, 0F); // Box 154
		bodyModel[25].setRotationPoint(-37F, -24F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 11, 7, 1, 0F); // Box 155
		bodyModel[26].setRotationPoint(-36F, -13F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 15, 22, 14, 0F); // Box 158
		bodyModel[27].setRotationPoint(19F, -23F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Box 166
		bodyModel[28].setRotationPoint(20.5F, -25F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[29].setRotationPoint(38.5F, -23.5F, -3.5F);

		bodyModel[30].addTrapezoid(0F, 0F, 0F, 3, 1, 6, 0F, 0F, ModelRendererTurbo.MR_TOP); // Exhaust
		bodyModel[30].setRotationPoint(-4F, -24.5F, -3F);

		bodyModel[31].addBox(3F, 0F, 0F, 10, 8, 1, 0F); // Box 119
		bodyModel[31].setRotationPoint(-38F, -21F, 10F);

		bodyModel[32].addShapeBox(3F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[32].setRotationPoint(-25F, -23F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 101, 4, 14, 0F); // Box 33
		bodyModel[33].setRotationPoint(-51F, -1F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 45
		bodyModel[34].setRotationPoint(-51F, -8F, -6F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 139
		bodyModel[35].setRotationPoint(-51F, -1F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 140
		bodyModel[36].setRotationPoint(-51F, -1F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 147
		bodyModel[37].setRotationPoint(-51.01F, -1F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[38].setRotationPoint(-55F, 3F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[39].setRotationPoint(-52F, 2.5F, -2F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 173
		bodyModel[40].setRotationPoint(-51F, 8F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 174
		bodyModel[41].setRotationPoint(-51F, 5.5F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 175
		bodyModel[42].setRotationPoint(-51F, 3F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 176
		bodyModel[43].setRotationPoint(-51F, 1F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 188
		bodyModel[44].setRotationPoint(-51F, -8F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 189
		bodyModel[45].setRotationPoint(-52.5F, -9F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 191
		bodyModel[46].setRotationPoint(-51F, -9F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[47].setRotationPoint(-51F, -9F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[48].setRotationPoint(-51F, 1F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 218
		bodyModel[49].setRotationPoint(-51F, 5.5F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 219
		bodyModel[50].setRotationPoint(-51F, 8F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 220
		bodyModel[51].setRotationPoint(-51F, 3F, 7F);

		bodyModel[52].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 221
		bodyModel[52].setRotationPoint(-51F, 1F, 5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[53].setRotationPoint(-53F, -1F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[54].setRotationPoint(-53F, -1F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[55].setRotationPoint(-53F, -1F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[56].setRotationPoint(45F, -1F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 197
		bodyModel[57].setRotationPoint(50.01F, -1F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[58].setRotationPoint(50F, -1F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[59].setRotationPoint(50F, -1F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[60].setRotationPoint(50F, 2.5F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 212
		bodyModel[61].setRotationPoint(51F, 3F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 347
		bodyModel[62].setRotationPoint(45F, 1F, -3F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 222
		bodyModel[63].setRotationPoint(45F, 8F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 223
		bodyModel[64].setRotationPoint(45F, 5.5F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 224
		bodyModel[65].setRotationPoint(45F, 3F, 7F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 225
		bodyModel[66].setRotationPoint(45F, 1F, 5F);

		bodyModel[67].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 226
		bodyModel[67].setRotationPoint(45F, 8F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 227
		bodyModel[68].setRotationPoint(45F, 5.5F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 228
		bodyModel[69].setRotationPoint(45F, 3F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 229
		bodyModel[70].setRotationPoint(45F, 1F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[71].setRotationPoint(50F, -1F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, -1F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[72].setRotationPoint(50F, -1F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[73].setRotationPoint(50F, -1F, -6F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 207
		bodyModel[74].setRotationPoint(51.5F, -9F, -3F);

		bodyModel[75].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 212
		bodyModel[75].setRotationPoint(-15F, -23F, -7.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 232
		bodyModel[76].setRotationPoint(-34F, -25F, 1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[77].setRotationPoint(-34F, -25F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[78].setRotationPoint(-34F, -25F, -6F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[79].setRotationPoint(-39.25F, -24.25F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 lamp cab headlight
		bodyModel[80].setRotationPoint(-39.5F, -24.25F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 lamp cab headlight
		bodyModel[81].setRotationPoint(-39.5F, -24.25F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[82].setRotationPoint(-34F, -25F, -5F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 224
		bodyModel[83].setRotationPoint(-29F, -25F, -6F);

		bodyModel[84].addBox(0F, 0F, 0F, 16, 14, 4, 0F); // Box 226
		bodyModel[84].setRotationPoint(-24F, -15F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 228
		bodyModel[85].setRotationPoint(-22F, -22F, -8F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 234
		bodyModel[86].setRotationPoint(-15F, -23F, 6.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[87].setRotationPoint(-49.5F, -16F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154 lamp nose light
		bodyModel[88].setRotationPoint(-49.25F, -16F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 155 lamp nose light
		bodyModel[89].setRotationPoint(-49.25F, -14F, -1F);

		bodyModel[90].addBox(-0.5F, 0F, -3.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[90].setRotationPoint(-24.5F, -21F, 10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 254
		bodyModel[91].setRotationPoint(-52.5F, 4F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[92].setRotationPoint(-52F, -3F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp ditchlight front up
		bodyModel[93].setRotationPoint(-52.5F, -3F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 150 lamp ditchlight front up
		bodyModel[94].setRotationPoint(-52.5F, -3F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[95].setRotationPoint(-52F, -3F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[96].setRotationPoint(8.5F, -24F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[97].setRotationPoint(9F, -24F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[98].setRotationPoint(9F, -24F, 1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[99].setRotationPoint(8.5F, -25F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[100].setRotationPoint(8F, -25F, -1.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[101].setRotationPoint(10.5F, -25F, 1.75F);
		bodyModel[101].rotateAngleY = -3.14159265F;

		bodyModel[102].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 265
		bodyModel[102].setRotationPoint(50.01F, 7F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
		bodyModel[103].setRotationPoint(50.01F, 8F, -10F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 267
		bodyModel[104].setRotationPoint(-51.01F, 7F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 268
		bodyModel[105].setRotationPoint(-51.01F, 8F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[106].setRotationPoint(-36F, -17F, 3F);

		bodyModel[107].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 272
		bodyModel[107].setRotationPoint(-24F, -14F, 11.01F);

		bodyModel[108].addBox(0F, 0F, -2F, 9, 0, 2, 0F); // Box 209
		bodyModel[108].setRotationPoint(-34F, -21F, -11F);
		bodyModel[108].rotateAngleX = 0.87266463F;

		bodyModel[109].addBox(0F, 0F, 0F, 9, 0, 2, 0F); // Box 210
		bodyModel[109].setRotationPoint(-34F, -21F, 11F);
		bodyModel[109].rotateAngleX = -0.87266463F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 211 lamp ditchlight back up
		bodyModel[110].setRotationPoint(50.25F, -3F, -6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 212
		bodyModel[111].setRotationPoint(49.75F, -3F, -6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 213 lamp ditchlight back up
		bodyModel[112].setRotationPoint(50.25F, -3F, 4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 214
		bodyModel[113].setRotationPoint(49.75F, -3F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glowey boi
		bodyModel[114].setRotationPoint(-34.47F, -25F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[115].setRotationPoint(-34.32F, -25F, -0.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 218 FR
		bodyModel[116].setRotationPoint(19F, -23F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 FR
		bodyModel[117].setRotationPoint(19F, -23F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 18, 1, 14, 0F); // Box 222 FR
		bodyModel[118].setRotationPoint(20F, -23.5F, -7F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[119].setRotationPoint(35F, -13F, 6F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[120].setRotationPoint(36F, -12F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 381
		bodyModel[121].setRotationPoint(-16F, 0F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 238
		bodyModel[122].setRotationPoint(4F, 0F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 279
		bodyModel[123].setRotationPoint(-51F, 7F, 8F);

		bodyModel[124].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 280
		bodyModel[124].setRotationPoint(-51F, 4.5F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 282
		bodyModel[125].setRotationPoint(-51F, 1F, 6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[126].setRotationPoint(-15F, -6F, 11F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 244
		bodyModel[127].setRotationPoint(-15F, -4F, 11F);

		bodyModel[128].addBox(0F, 0F, 0F, 10, 16, 12, 0F); // Box 245
		bodyModel[128].setRotationPoint(-47F, -17F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[129].setRotationPoint(-35F, -23F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 248
		bodyModel[130].setRotationPoint(-48F, -17F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 249
		bodyModel[131].setRotationPoint(-48F, -17F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 253
		bodyModel[132].setRotationPoint(-39F, -21F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[133].setRotationPoint(-35F, -23F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F); // Box 257
		bodyModel[134].setRotationPoint(-39F, -24F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1.09F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.09F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[135].setRotationPoint(-36F, -22F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-1.91F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[136].setRotationPoint(-39F, -24F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[137].setRotationPoint(-39F, -21F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1.09F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.09F, 0F, 0F); // Box 264
		bodyModel[138].setRotationPoint(-36F, -22F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[139].setRotationPoint(-37F, -16F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[140].setRotationPoint(-43F, -15F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 269
		bodyModel[141].setRotationPoint(-45F, -15F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270
		bodyModel[142].setRotationPoint(-45F, -16F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 271
		bodyModel[143].setRotationPoint(-46F, -16F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 14, 5, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[144].setRotationPoint(-45F, -15F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 2F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[145].setRotationPoint(-46F, -16F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[146].setRotationPoint(-45F, -16F, 6F);

		bodyModel[147].addShapeBox(0F, 0F, 1F, 1, 2, 3, 0F,-1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[147].setRotationPoint(-39.25F, -24.25F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 1F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 277
		bodyModel[148].setRotationPoint(-39.25F, -24.25F, 1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[149].setRotationPoint(-45.75F, -16.5F, 6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 279
		bodyModel[150].setRotationPoint(-45.75F, -16.5F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 280
		bodyModel[151].setRotationPoint(-51F, -8F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[152].setRotationPoint(-51F, -9F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[153].setRotationPoint(-51F, -9F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 283
		bodyModel[154].setRotationPoint(-51F, -8F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[155].setRotationPoint(-22F, 0F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[156].setRotationPoint(1F, 0F, 10F);

		bodyModel[157].addBox(0F, 0F, -1F, 1, 1, 4, 0F); // Box 237
		bodyModel[157].setRotationPoint(-0.5F, 2.5F, 8F);
		bodyModel[157].rotateAngleX = 0.43633231F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[158].setRotationPoint(-26F, 0F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 288
		bodyModel[159].setRotationPoint(-26F, 1F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[160].setRotationPoint(-25.5F, 2F, 8.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[161].setRotationPoint(-54F, 3F, 2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[162].setRotationPoint(-54F, 5F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[163].setRotationPoint(-55F, 7F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[164].setRotationPoint(-55F, 7F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[165].setRotationPoint(-54F, 5F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[166].setRotationPoint(-54F, 3F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 296
		bodyModel[167].setRotationPoint(-52.5F, 4F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[168].setRotationPoint(-37F, -16F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 298
		bodyModel[169].setRotationPoint(-37F, -17F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[170].setRotationPoint(-38F, 1F, -11F);

		bodyModel[171].addBox(0F, 0F, -3F, 1, 1, 4, 0F); // Box 300
		bodyModel[171].setRotationPoint(-0.5F, 2.5F, -8F);
		bodyModel[171].rotateAngleX = -0.43633231F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[172].setRotationPoint(1F, 0F, -11F);

		bodyModel[173].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 302
		bodyModel[173].setRotationPoint(45F, 7F, 8F);

		bodyModel[174].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 303
		bodyModel[174].setRotationPoint(45F, 4.5F, 7F);

		bodyModel[175].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 304
		bodyModel[175].setRotationPoint(45F, 7F, -8F);

		bodyModel[176].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 305
		bodyModel[176].setRotationPoint(45F, 4.5F, -7F);

		bodyModel[177].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 306
		bodyModel[177].setRotationPoint(-51F, 4.5F, -7F);

		bodyModel[178].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 307
		bodyModel[178].setRotationPoint(-51F, 7F, -8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 17, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[179].setRotationPoint(-24F, -21F, -11.01F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 12, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[180].setRotationPoint(-7F, -21F, -11.01F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
		bodyModel[181].setRotationPoint(0F, -21F, -6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 311
		bodyModel[182].setRotationPoint(0F, -22F, -4F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[183].setRotationPoint(8.5F, -23F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 22, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[184].setRotationPoint(45F, -23F, 2F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 22, 4, 0F); // Box 220
		bodyModel[185].setRotationPoint(45F, -23F, -2F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[186].setRotationPoint(47.25F, -19F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp headlight rear
		bodyModel[187].setRotationPoint(47.5F, -19F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lampheadlight rear
		bodyModel[188].setRotationPoint(47.5F, -19F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 22, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[189].setRotationPoint(45F, -23F, -7F);

		bodyModel[190].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Box 325
		bodyModel[190].setRotationPoint(19F, -22F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 20, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[191].setRotationPoint(19F, -19F, -11F);

		bodyModel[192].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Box 327
		bodyModel[192].setRotationPoint(29.5F, -25F, -4F);

		bodyModel[193].addBox(-1F, 0F, 0F, 16, 1, 14, 0F); // Box 328
		bodyModel[193].setRotationPoint(-23F, -24F, -7F);

		bodyModel[194].addShapeBox(-1F, 0F, 0F, 6, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[194].setRotationPoint(-5F, -24F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 330
		bodyModel[195].setRotationPoint(50F, -9F, -5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[196].setRotationPoint(50F, -9F, -7F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 332
		bodyModel[197].setRotationPoint(50F, -8F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 333
		bodyModel[198].setRotationPoint(50F, -8F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[199].setRotationPoint(50F, -9F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[200].setRotationPoint(50F, -9F, 5F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 336
		bodyModel[201].setRotationPoint(50F, -8F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 337
		bodyModel[202].setRotationPoint(50F, -8F, 6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[203].setRotationPoint(19F, -23F, 8F);

		bodyModel[204].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 339
		bodyModel[204].setRotationPoint(19F, -23F, 7F);

		bodyModel[205].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Box 340
		bodyModel[205].setRotationPoint(19F, -22F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 20, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 341
		bodyModel[206].setRotationPoint(19F, -19F, 7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[207].setRotationPoint(34F, 1F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[208].setRotationPoint(34F, 1F, 7F);

		bodyModel[209].addBox(0F, 0F, 0F, 6, 22, 14, 0F); // Box 344
		bodyModel[209].setRotationPoint(39F, -23F, -7F);

		bodyModel[210].addBox(0F, 0F, 0F, 5, 13, 12, 0F); // Box 345
		bodyModel[210].setRotationPoint(34F, -14F, -7F);

		bodyModel[211].addBox(0F, 0F, 0F, 5, 9, 14, 0F); // Box 346
		bodyModel[211].setRotationPoint(34F, -23F, -7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[212].setRotationPoint(34F, -7F, 5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[213].setRotationPoint(45F, -1F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[214].setRotationPoint(-47F, -1F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 350
		bodyModel[215].setRotationPoint(-47F, -1F, 7F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[216].setRotationPoint(46F, -9F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[217].setRotationPoint(46F, -7F, -11.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[218].setRotationPoint(46F, -7F, 10.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[219].setRotationPoint(46F, -9F, 9F);

		bodyModel[220].addShapeBox(0F, 0F, 1F, 0, 2, 3, 0F,-1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355 numberboard
		bodyModel[220].setRotationPoint(-39.26F, -24.25F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 1F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 356 numberboard
		bodyModel[221].setRotationPoint(-39.26F, -24.25F, 1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[222].setRotationPoint(-40F, -23.25F, -0.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[223].setRotationPoint(-40F, -24.25F, -0.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[224].setRotationPoint(-39.75F, -22.75F, -0.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[225].setRotationPoint(-39.75F, -24.75F, -1.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 361
		bodyModel[226].setRotationPoint(-47F, -8F, 6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[227].setRotationPoint(-47F, -9F, 5F);

		bodyModel[228].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 363
		bodyModel[228].setRotationPoint(-47F, -1F, 10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[229].setRotationPoint(-47F, -9F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 365
		bodyModel[230].setRotationPoint(-47F, -8F, -7F);

		bodyModel[231].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 366
		bodyModel[231].setRotationPoint(-47F, -1F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 367
		bodyModel[232].setRotationPoint(-25.5F, 1F, 9.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[233].setRotationPoint(-25.5F, 0F, 9.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 369
		bodyModel[234].setRotationPoint(-25.25F, 1.5F, 9.75F);

		bodyModel[235].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 370 up 4141 bit
		bodyModel[235].setRotationPoint(-42F, -8F, 10.25F);

		bodyModel[236].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 370 up 4141 bit
		bodyModel[236].setRotationPoint(-42F, -8F, -11.25F);

		bodyModel[237].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 239
		bodyModel[237].setRotationPoint(-25.5F, -24.5F, -5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[238].setRotationPoint(-37F, -25F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[239].setRotationPoint(-35.5F, -25F, -1F);

		bodyModel[240].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[240].setRotationPoint(-37.1F, -16F, 1F);
		bodyModel[240].rotateAngleY = -0.38397244F;

		bodyModel[241].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[241].setRotationPoint(-35.5F, -18F, 1F);
		bodyModel[241].rotateAngleY = -0.38397244F;

		bodyModel[242].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 244
		bodyModel[242].setRotationPoint(-36.1F, -15F, 2F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 245
		bodyModel[243].setRotationPoint(-36.1F, -15F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[244].setRotationPoint(-36F, -17F, -9F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 247
		bodyModel[245].setRotationPoint(-36.1F, -15F, -4F);

		bodyModel[246].addBox(0F, 0F, 0F, 11, 2, 20, 0F); // Box 248
		bodyModel[246].setRotationPoint(-36F, -8F, -10F);
	}
}