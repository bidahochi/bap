//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.01.2019 - 08:38:43
// Last changed on: 31.01.2019 - 08:38:43

package ebf.bap.models.rollingstock; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBilevelCar extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelBilevelCar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[213];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 29 door swing left
		bodyModel[28] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 46 door swing right
		bodyModel[41] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 62
		bodyModel[53] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 63
		bodyModel[54] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 64
		bodyModel[55] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 65
		bodyModel[56] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 66
		bodyModel[57] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 75 liveryimg 1
		bodyModel[63] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 76 liveryimg 1
		bodyModel[64] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 114
		bodyModel[65] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 75
		bodyModel[67] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 76
		bodyModel[68] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 77
		bodyModel[69] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 78
		bodyModel[70] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 84
		bodyModel[71] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 85
		bodyModel[72] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 93
		bodyModel[78] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 94
		bodyModel[79] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 97
		bodyModel[82] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 100 liveryimg 2
		bodyModel[84] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 101
		bodyModel[85] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 102 door slide 6
		bodyModel[86] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 103
		bodyModel[87] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 104
		bodyModel[88] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 105
		bodyModel[89] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 108
		bodyModel[91] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 109
		bodyModel[92] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 110
		bodyModel[93] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 111
		bodyModel[94] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 113
		bodyModel[95] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 115
		bodyModel[96] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 116 door slide -6
		bodyModel[97] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 117 door slide -6
		bodyModel[98] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 118 door slide 6
		bodyModel[99] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 105
		bodyModel[102] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 107
		bodyModel[104] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 108
		bodyModel[105] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 109
		bodyModel[106] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 111
		bodyModel[108] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 113
		bodyModel[110] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 115
		bodyModel[112] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 116
		bodyModel[113] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 117
		bodyModel[114] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 118
		bodyModel[115] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 120
		bodyModel[116] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 121
		bodyModel[117] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 122
		bodyModel[118] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 123
		bodyModel[119] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 124
		bodyModel[120] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 125
		bodyModel[121] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 126
		bodyModel[122] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 127
		bodyModel[123] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 129
		bodyModel[125] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 131
		bodyModel[127] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 132
		bodyModel[128] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 133
		bodyModel[129] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 134
		bodyModel[130] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 135
		bodyModel[131] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 136
		bodyModel[132] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 137
		bodyModel[133] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 138
		bodyModel[134] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 139
		bodyModel[135] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 140
		bodyModel[136] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 141
		bodyModel[137] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 142
		bodyModel[138] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 143
		bodyModel[139] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 143
		bodyModel[140] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 144
		bodyModel[141] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 145
		bodyModel[142] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 146
		bodyModel[143] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 147
		bodyModel[144] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 148
		bodyModel[145] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 149
		bodyModel[146] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 150
		bodyModel[147] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 151
		bodyModel[148] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 152
		bodyModel[149] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 153
		bodyModel[150] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 154
		bodyModel[151] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 156
		bodyModel[152] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 157
		bodyModel[153] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 158
		bodyModel[154] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 159
		bodyModel[155] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 160
		bodyModel[156] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 161
		bodyModel[157] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 162
		bodyModel[158] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 163
		bodyModel[159] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 164
		bodyModel[160] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 165
		bodyModel[161] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 166
		bodyModel[162] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 167
		bodyModel[163] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 168
		bodyModel[164] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 169
		bodyModel[165] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 170
		bodyModel[166] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 171
		bodyModel[167] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 172
		bodyModel[168] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 173
		bodyModel[169] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 174
		bodyModel[170] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 175
		bodyModel[171] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 176
		bodyModel[172] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 178
		bodyModel[173] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 179
		bodyModel[174] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 180
		bodyModel[175] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 190 lamp
		bodyModel[176] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 205 lamp
		bodyModel[177] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 206 lamp
		bodyModel[178] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 207 lamp
		bodyModel[179] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 190 lamp
		bodyModel[180] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 209 lamp
		bodyModel[181] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 210
		bodyModel[182] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 211
		bodyModel[183] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 4
		bodyModel[184] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 4
		bodyModel[185] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 4
		bodyModel[186] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 4
		bodyModel[187] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 389
		bodyModel[188] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 390
		bodyModel[189] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 391
		bodyModel[190] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 162 beacon
		bodyModel[191] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 165
		bodyModel[192] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 356
		bodyModel[193] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 357
		bodyModel[194] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 358
		bodyModel[195] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 359
		bodyModel[196] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 360 beacon
		bodyModel[197] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 290 texture optional
		bodyModel[198] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 291
		bodyModel[199] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 292
		bodyModel[200] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 293
		bodyModel[201] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 294
		bodyModel[202] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 295
		bodyModel[203] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 296
		bodyModel[204] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 297
		bodyModel[205] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 298
		bodyModel[206] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 299
		bodyModel[207] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 300
		bodyModel[208] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 301
		bodyModel[209] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 302
		bodyModel[210] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 303
		bodyModel[211] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 304
		bodyModel[212] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 305 lamp

		bodyModel[0].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-56F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 28, 3, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(-59F, 0F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 118, 9, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-59F, -20F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-60F, -22F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-60F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 58, 1, 22, 0F); // Box 5
		bodyModel[5].setRotationPoint(-29F, 6F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 2, 10, 0F); // Box 6
		bodyModel[6].setRotationPoint(-60F, -22F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-60F, -22F, 5F);

		bodyModel[8].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(-59F, -11F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-60F, 2F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 10
		bodyModel[10].setRotationPoint(-63F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-56F, 2F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[12].setRotationPoint(56F, 2F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(56F, 2F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(54F, -22F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 2, 10, 0F); // Box 17
		bodyModel[15].setRotationPoint(54F, -22F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(54F, -22F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 19
		bodyModel[17].setRotationPoint(-58F, 6F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-60F, 3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 21
		bodyModel[19].setRotationPoint(-59F, 6F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 22
		bodyModel[20].setRotationPoint(-62F, -15F, -4F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 23
		bodyModel[21].setRotationPoint(-62F, -15F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-62F, -16F, -4F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 25
		bodyModel[23].setRotationPoint(-62F, 0F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-60F, -15F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-60F, -15F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(-60F, -20F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 29 door swing left
		bodyModel[27].setRotationPoint(-60F, -15F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(29F, 2F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[29].setRotationPoint(-29F, 3F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[30].setRotationPoint(28F, 3F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(29F, 2F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 28, 3, 20, 0F); // Box 38
		bodyModel[32].setRotationPoint(31F, 0F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(55F, 3F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F); // Box 40
		bodyModel[34].setRotationPoint(56F, 6F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		bodyModel[35].setRotationPoint(58F, 6F, -10F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 42
		bodyModel[36].setRotationPoint(60F, 3F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[37].setRotationPoint(59F, -15F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(59F, -20F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[39].setRotationPoint(59F, -15F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 46 door swing right
		bodyModel[40].setRotationPoint(59F, -15F, -3F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 47
		bodyModel[41].setRotationPoint(60F, -15F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[42].setRotationPoint(60F, -16F, -4F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 49
		bodyModel[43].setRotationPoint(60F, -15F, 3F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 50
		bodyModel[44].setRotationPoint(59F, 0F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 51
		bodyModel[45].setRotationPoint(43F, 3F, -1F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 53
		bodyModel[46].setRotationPoint(-45F, 3F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F,0F, -5F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-54F, -25F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 58, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[48].setRotationPoint(-29F, -25F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 59
		bodyModel[49].setRotationPoint(-60F, 1F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 60
		bodyModel[50].setRotationPoint(-60F, 2F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 61
		bodyModel[51].setRotationPoint(59F, 2F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 62
		bodyModel[52].setRotationPoint(59F, 1F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 63
		bodyModel[53].setRotationPoint(59F, -20F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[54].setRotationPoint(59F, -20F, 5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65
		bodyModel[55].setRotationPoint(-60F, -20F, 5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 66
		bodyModel[56].setRotationPoint(-60F, -20F, -5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 70
		bodyModel[57].setRotationPoint(-60.01F, -1.5F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 71
		bodyModel[58].setRotationPoint(-60.01F, -1.5F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 72
		bodyModel[59].setRotationPoint(-60.01F, -5.5F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 73
		bodyModel[60].setRotationPoint(-60.01F, -5.5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[61].setRotationPoint(-61F, -18.5F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75 liveryimg 1
		bodyModel[62].setRotationPoint(-60.8F, -18.5F, 6F);
		bodyModel[62].rotateAngleY = -0.15707963F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 76 liveryimg 1
		bodyModel[63].setRotationPoint(-60F, -18.5F, -10F);
		bodyModel[63].rotateAngleY = 0.15707963F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[64].setRotationPoint(-59F, -24F, -5.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[65].setRotationPoint(-59F, -25F, -5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 75
		bodyModel[66].setRotationPoint(-59.25F, -26F, -6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[67].setRotationPoint(-59.25F, -25.5F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		bodyModel[68].setRotationPoint(-59.25F, -25.5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[69].setRotationPoint(-58.75F, -23.5F, -5.25F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 84
		bodyModel[70].setRotationPoint(-59.5F, -24F, -0.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[71].setRotationPoint(-59.5F, -24F, 0.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
		bodyModel[72].setRotationPoint(-59F, -23F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 58, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[73].setRotationPoint(-29F, -25F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F,0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[74].setRotationPoint(-54F, -25F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 25, 4, 5, 0F,0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[75].setRotationPoint(-54F, -25F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 25, 4, 5, 0F,0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[76].setRotationPoint(54F, -25F, 5F);
		bodyModel[76].rotateAngleY = -3.14159265F;

		bodyModel[77].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 93
		bodyModel[77].setRotationPoint(-31F, -11F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 58, 1, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[78].setRotationPoint(-29F, -26F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 58, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[79].setRotationPoint(-29F, -26F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 25, 4, 5, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[80].setRotationPoint(-54F, -25F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 25, 4, 5, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[81].setRotationPoint(54F, -25F, 0F);
		bodyModel[81].rotateAngleY = -3.14159265F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[82].setRotationPoint(-61F, -22F, -4.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 100 liveryimg 2
		bodyModel[83].setRotationPoint(-61F, -22F, -0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 101
		bodyModel[84].setRotationPoint(-61F, -22F, 0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102 door slide 6
		bodyModel[85].setRotationPoint(16F, -11F, 10F);

		bodyModel[86].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 103
		bodyModel[86].setRotationPoint(23F, 2F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 104
		bodyModel[87].setRotationPoint(-29F, 2F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Box 105
		bodyModel[88].setRotationPoint(23F, -11F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 106
		bodyModel[89].setRotationPoint(-16F, -11F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 118, 9, 1, 0F); // Box 108
		bodyModel[90].setRotationPoint(-59F, -20F, 10F);

		bodyModel[91].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 109
		bodyModel[91].setRotationPoint(-16F, -11F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Box 110
		bodyModel[92].setRotationPoint(-59F, -11F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 111
		bodyModel[93].setRotationPoint(-29F, 2F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 36, 13, 1, 0F); // Box 113
		bodyModel[94].setRotationPoint(23F, -11F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 115
		bodyModel[95].setRotationPoint(23F, 2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 7, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 116 door slide -6
		bodyModel[96].setRotationPoint(-23F, -11F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117 door slide -6
		bodyModel[97].setRotationPoint(-23F, -11F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118 door slide 6
		bodyModel[98].setRotationPoint(16F, -11F, -10.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 9, 1, 9, 0F); // Box 103
		bodyModel[99].setRotationPoint(-47F, -4F, -10F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 104
		bodyModel[100].setRotationPoint(-43F, -9F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 105
		bodyModel[101].setRotationPoint(-44F, -3F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 106
		bodyModel[102].setRotationPoint(-51F, -9F, 2F);

		bodyModel[103].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 107
		bodyModel[103].setRotationPoint(-55F, -4F, 2F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 108
		bodyModel[104].setRotationPoint(-60F, -15F, 3F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 109
		bodyModel[105].setRotationPoint(-60F, -15F, -5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 110
		bodyModel[106].setRotationPoint(59F, -15F, 3F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 111
		bodyModel[107].setRotationPoint(59F, -15F, -5F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 112
		bodyModel[108].setRotationPoint(-54F, -3F, 6F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 113
		bodyModel[109].setRotationPoint(-33F, -10F, 3F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 114
		bodyModel[110].setRotationPoint(-35F, -8F, 3F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 115
		bodyModel[111].setRotationPoint(-37F, -6F, 3F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 116
		bodyModel[112].setRotationPoint(-39F, -4F, 3F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 117
		bodyModel[113].setRotationPoint(-41F, -2F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[114].setRotationPoint(-50F, -20F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[115].setRotationPoint(-59F, -7F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,1F, -11F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -11F, 0F, -1F, 1F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 1F, 0F); // Box 121
		bodyModel[116].setRotationPoint(-41F, -11F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,1F, -11F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -11F, 0F, -1F, 1F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 1F, 0F); // Box 122
		bodyModel[117].setRotationPoint(41F, -11F, 3F);
		bodyModel[117].rotateAngleY = -3.14159265F;

		bodyModel[118].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 123
		bodyModel[118].setRotationPoint(38F, -2F, 3F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 124
		bodyModel[119].setRotationPoint(36F, -4F, 3F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 125
		bodyModel[120].setRotationPoint(34F, -6F, 3F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 126
		bodyModel[121].setRotationPoint(32F, -8F, 3F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 127
		bodyModel[122].setRotationPoint(31F, -10F, 3F);

		bodyModel[123].addBox(0F, 0F, 0F, 9, 1, 9, 0F); // Box 128
		bodyModel[123].setRotationPoint(-22F, -15F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 129
		bodyModel[124].setRotationPoint(-19F, -14F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 130
		bodyModel[125].setRotationPoint(-18F, -20F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 131
		bodyModel[126].setRotationPoint(-5F, -14F, -10F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 132
		bodyModel[127].setRotationPoint(-4F, -20F, -10F);

		bodyModel[128].addBox(0F, 0F, 0F, 9, 1, 9, 0F); // Box 133
		bodyModel[128].setRotationPoint(-8F, -15F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 134
		bodyModel[129].setRotationPoint(10F, -14F, -10F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 135
		bodyModel[130].setRotationPoint(11F, -20F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 9, 1, 9, 0F); // Box 136
		bodyModel[131].setRotationPoint(7F, -15F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 137
		bodyModel[132].setRotationPoint(26F, -20F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 138
		bodyModel[133].setRotationPoint(24F, -14F, -10F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 139
		bodyModel[134].setRotationPoint(22F, -15F, -10F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 140
		bodyModel[135].setRotationPoint(-31F, -20F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 141
		bodyModel[136].setRotationPoint(-31F, -15F, -10F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 142
		bodyModel[137].setRotationPoint(-31F, -14F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 56, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 143
		bodyModel[138].setRotationPoint(-28F, -25F, -10F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 143
		bodyModel[139].setRotationPoint(-28F, 5F, -10F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 144
		bodyModel[140].setRotationPoint(-30F, 3F, -10F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 145
		bodyModel[141].setRotationPoint(-31F, 1F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F); // Box 146
		bodyModel[142].setRotationPoint(-31F, 1F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 147
		bodyModel[143].setRotationPoint(-5F, 3F, -10F);

		bodyModel[144].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 148
		bodyModel[144].setRotationPoint(-7F, 2F, -10F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 149
		bodyModel[145].setRotationPoint(-3F, -3F, -10F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 150
		bodyModel[146].setRotationPoint(-19F, 3F, -10F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 151
		bodyModel[147].setRotationPoint(-19F, 2F, -10F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 152
		bodyModel[148].setRotationPoint(-19F, -3F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 153
		bodyModel[149].setRotationPoint(18F, -10F, -7F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 154
		bodyModel[150].setRotationPoint(18F, -10F, 7F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 156
		bodyModel[151].setRotationPoint(56F, -9F, -10F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 157
		bodyModel[152].setRotationPoint(52F, -4F, -10F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 158
		bodyModel[153].setRotationPoint(54F, -3F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[154].setRotationPoint(-29F, -25F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[155].setRotationPoint(29F, -25F, 10F);
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[156].setRotationPoint(29F, -25F, -5F);
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 56, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 162
		bodyModel[157].setRotationPoint(28F, -25F, 10F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[158].setRotationPoint(-29F, -25F, 5F);

		bodyModel[159].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 164
		bodyModel[159].setRotationPoint(42F, -4F, -10F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 165
		bodyModel[160].setRotationPoint(42F, -3F, -10F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 166
		bodyModel[161].setRotationPoint(42F, -9F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 167
		bodyModel[162].setRotationPoint(29F, 1F, -10F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 168
		bodyModel[163].setRotationPoint(27F, 3F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 169
		bodyModel[164].setRotationPoint(25F, 5F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F); // Box 170
		bodyModel[165].setRotationPoint(31F, 1F, -2F);
		bodyModel[165].rotateAngleY = -3.14159265F;

		bodyModel[166].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 171
		bodyModel[166].setRotationPoint(-1F, -10F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 172
		bodyModel[167].setRotationPoint(-1F, 0F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 173
		bodyModel[168].setRotationPoint(-16F, -10F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[169].setRotationPoint(-16F, -10F, 8F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 175
		bodyModel[170].setRotationPoint(30F, -10F, -2F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 176
		bodyModel[171].setRotationPoint(-31F, -10F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[172].setRotationPoint(-59.5F, -24F, -1.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[173].setRotationPoint(-59.5F, -23.5F, 1.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[174].setRotationPoint(-59.5F, -23.5F, -2.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[175].setRotationPoint(-60.25F, -1.5F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 205 lamp
		bodyModel[176].setRotationPoint(-60.25F, -1.5F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 206 lamp
		bodyModel[177].setRotationPoint(-60.25F, -5.5F, 8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 207 lamp
		bodyModel[178].setRotationPoint(-60.25F, -5.5F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[179].setRotationPoint(-60.75F, -18.5F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 209 lamp
		bodyModel[180].setRotationPoint(-60.75F, -18.5F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F,0F, 0F, -1F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[181].setRotationPoint(29F, -25F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 25, 5, 6, 0F,0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[182].setRotationPoint(29F, -25F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[183].setRotationPoint(-62F, 6F, 2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[184].setRotationPoint(-62F, 7F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[185].setRotationPoint(-62.5F, 6F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[186].setRotationPoint(-62F, 7F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[187].setRotationPoint(-57.5F, -21.5F, -9F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 390
		bodyModel[188].setRotationPoint(-57.5F, -21.5F, -9F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[189].setRotationPoint(-57.5F, -21.5F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 beacon
		bodyModel[190].setRotationPoint(-56.97F, -23.5F, -8.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[191].setRotationPoint(-56.82F, -22.5F, -8.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 356
		bodyModel[192].setRotationPoint(-57.5F, -21.5F, 7F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 357
		bodyModel[193].setRotationPoint(-57.5F, -21.5F, 7F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 358
		bodyModel[194].setRotationPoint(-57.5F, -21.5F, 9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 359
		bodyModel[195].setRotationPoint(-56.82F, -22.5F, 7.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 360 beacon
		bodyModel[196].setRotationPoint(-56.97F, -23.5F, 7.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 5, 4, 20, 0F); // Box 290 texture optional
		bodyModel[197].setRotationPoint(54F, 3F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F, 0F); // Box 291
		bodyModel[198].setRotationPoint(-59F, -9F, 6F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 292
		bodyModel[199].setRotationPoint(-47F, 3F, -2F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 293
		bodyModel[200].setRotationPoint(-42F, 3F, -2F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 294
		bodyModel[201].setRotationPoint(46F, 3F, -2F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 295
		bodyModel[202].setRotationPoint(41F, 3F, -2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 296
		bodyModel[203].setRotationPoint(-59F, -12F, 3F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 297
		bodyModel[204].setRotationPoint(-59F, -8F, 4F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 298
		bodyModel[205].setRotationPoint(-57F, -6F, 4F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // Box 299
		bodyModel[206].setRotationPoint(-59F, -5F, 4F);

		bodyModel[207].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Box 300
		bodyModel[207].setRotationPoint(-57F, -4F, -10F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 301
		bodyModel[208].setRotationPoint(-56F, -3F, -10F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 302
		bodyModel[209].setRotationPoint(-57F, -9F, -10F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 303
		bodyModel[210].setRotationPoint(-58F, -11F, 11F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 304
		bodyModel[211].setRotationPoint(-58F, -11F, -12F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 305 lamp
		bodyModel[212].setRotationPoint(-61.1F, -21.5F, -1F);
	}
}