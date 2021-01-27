//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.07.2019 - 17:40:11
// Last changed on: 10.07.2019 - 17:40:11

package ebf.bap.models.locomotives; //Path where the model is located

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTankenstein extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTankenstein() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[159];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 89
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 93
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 94
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 95
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 96
		bodyModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 97
		bodyModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 98
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 114
		bodyModel[41] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 74
		bodyModel[42] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 113
		bodyModel[44] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 114
		bodyModel[45] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 115
		bodyModel[46] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 116
		bodyModel[47] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 117
		bodyModel[48] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 257, 41, textureX, textureY, StaticModelAnimator.tagWheel); // Box 63 wheel
		bodyModel[56] = new ModelRendererTurbo(this, 281, 41, textureX, textureY, StaticModelAnimator.tagWheel); // Box 64 wheel
		bodyModel[57] = new ModelRendererTurbo(this, 305, 41, textureX, textureY, StaticModelAnimator.tagWheel); // Box 65 wheel
		bodyModel[58] = new ModelRendererTurbo(this, 329, 41, textureX, textureY, StaticModelAnimator.tagWheel); // Box 66 wheel
		bodyModel[59] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 67
		bodyModel[60] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 97
		bodyModel[64] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 107
		bodyModel[65] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 109
		bodyModel[67] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 110
		bodyModel[68] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 105
		bodyModel[69] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 106
		bodyModel[70] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 107
		bodyModel[71] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 108
		bodyModel[72] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 109
		bodyModel[73] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 110
		bodyModel[74] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 111
		bodyModel[75] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 112
		bodyModel[76] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 113
		bodyModel[77] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 114
		bodyModel[78] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 115
		bodyModel[79] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 116
		bodyModel[80] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 117
		bodyModel[81] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 118
		bodyModel[82] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 119
		bodyModel[83] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 122
		bodyModel[84] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 123
		bodyModel[85] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 124
		bodyModel[86] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 125
		bodyModel[87] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 126
		bodyModel[88] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 127
		bodyModel[89] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 140
		bodyModel[90] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 141
		bodyModel[91] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 142
		bodyModel[92] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 143
		bodyModel[93] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 144
		bodyModel[94] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 145
		bodyModel[95] = new ModelRendererTurbo(this, 465, 33, textureX, textureY, StaticModelAnimator.tagLamp(0, 1)); // Box 146 lamp
		bodyModel[96] = new ModelRendererTurbo(this, 97, 9, textureX, textureY, StaticModelAnimator.tagSmoke(1)); // Box 147 smoke
		bodyModel[97] = new ModelRendererTurbo(this, 169, 9, textureX, textureY, StaticModelAnimator.tagSteam(1)); // Box 150 steam
		bodyModel[98] = new ModelRendererTurbo(this, 297, 9, textureX, textureY, StaticModelAnimator.tagSteam(1)); // Box 151 steam
		bodyModel[99] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 155
		bodyModel[100] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 156
		bodyModel[101] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 157
		bodyModel[102] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 158
		bodyModel[103] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 159
		bodyModel[104] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 160
		bodyModel[105] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 161
		bodyModel[106] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 162
		bodyModel[107] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 163
		bodyModel[108] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 164
		bodyModel[109] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 165
		bodyModel[110] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 86
		bodyModel[111] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		bodyModel[112] = new ModelRendererTurbo(this, 273, 57, textureX, textureY, StaticModelAnimator.tagGlow); // Box 175 glow
		bodyModel[113] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 176
		bodyModel[114] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 177
		bodyModel[115] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 178
		bodyModel[116] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 179
		bodyModel[117] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 180
		bodyModel[118] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 181
		bodyModel[119] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 182
		bodyModel[120] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 183
		bodyModel[121] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 184
		bodyModel[122] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 185
		bodyModel[123] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 186
		bodyModel[124] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 187
		bodyModel[125] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 188
		bodyModel[126] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 189
		bodyModel[127] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 190
		bodyModel[128] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 192
		bodyModel[129] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 193
		bodyModel[130] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 195
		bodyModel[131] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 196
		bodyModel[132] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 197
		bodyModel[133] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 199
		bodyModel[134] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 200
		bodyModel[135] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 201
		bodyModel[136] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 202
		bodyModel[137] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 203
		bodyModel[138] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 204
		bodyModel[139] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 205
		bodyModel[140] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 206
		bodyModel[141] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 207
		bodyModel[142] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 208
		bodyModel[143] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 209
		bodyModel[144] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 210
		bodyModel[145] = new ModelRendererTurbo(this, 265, 65, textureX, textureY, StaticModelAnimator.tagSteam(1)); // Box 211 steam
		bodyModel[146] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 212
		bodyModel[147] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 217 mountpoint
		bodyModel[148] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 154 liveryimg 1
		bodyModel[149] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 155 liveryimg 1
		bodyModel[150] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 156 liveryimg 2
		bodyModel[151] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 157 liveryimg 2
		bodyModel[152] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 158
		bodyModel[153] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 93
		bodyModel[154] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 98
		bodyModel[155] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 99
		bodyModel[156] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 100
		bodyModel[157] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 101
		bodyModel[158] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 164

		bodyModel[0].addBox(0F, 0F, 0F, 19, 1, 8, 0F); // Box 88
		bodyModel[0].setRotationPoint(9F, -19.5F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[1].setRotationPoint(10F, -19.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[2].setRotationPoint(9F, -17.5F, 9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[3].setRotationPoint(9F, -17.5F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 95
		bodyModel[4].setRotationPoint(10F, -18.5F, -4F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 96
		bodyModel[5].setRotationPoint(10F, -17.5F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 97
		bodyModel[6].setRotationPoint(10F, -16.5F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 98
		bodyModel[7].setRotationPoint(10F, -16.5F, 9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(10F, -19.5F, 4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 15
		bodyModel[9].setRotationPoint(9F, -19.5F, 4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[10].setRotationPoint(9F, -19.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 18
		bodyModel[11].setRotationPoint(27F, -19.5F, 4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(27F, -19.5F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 39, 6, 14, 0F); // Box 20
		bodyModel[13].setRotationPoint(-23F, -10.5F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 39, 4, 6, 0F); // Box 21
		bodyModel[14].setRotationPoint(-23F, -14.5F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 29, 4, 6, 0F); // Box 22
		bodyModel[15].setRotationPoint(-23F, -4.5F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 39, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-23F, -14.5F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 39, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-23F, -14.5F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 29, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-23F, -4.5F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 29, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(-23F, -4.5F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 7, 8, 0F); // Box 28
		bodyModel[20].setRotationPoint(-19F, -1.5F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
		bodyModel[21].setRotationPoint(6F, -4.5F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 30
		bodyModel[22].setRotationPoint(-22.5F, -20.5F, -1.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 31
		bodyModel[23].setRotationPoint(-23F, -21.5F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 32
		bodyModel[24].setRotationPoint(18F, -20.5F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 33
		bodyModel[25].setRotationPoint(10F, -2.5F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 34
		bodyModel[26].setRotationPoint(-17.5F, -15.5F, -4F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 35
		bodyModel[27].setRotationPoint(-17.5F, -17.5F, -2.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 32, 0, 2, 0F); // Box 36
		bodyModel[28].setRotationPoint(-22F, -13F, 4.5F);
		bodyModel[28].rotateAngleX = 0.78539816F;

		bodyModel[29].addBox(0F, 0F, -2F, 32, 0, 2, 0F); // Box 37
		bodyModel[29].setRotationPoint(-22F, -13F, -4.5F);
		bodyModel[29].rotateAngleX = -0.78539816F;

		bodyModel[30].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 38
		bodyModel[30].setRotationPoint(-17F, -10.5F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-17F, -16.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(-17F, -17.5F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(-17.5F, -19.5F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(-17F, -16.5F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 43
		bodyModel[35].setRotationPoint(-5F, -15.5F, -2.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 44
		bodyModel[36].setRotationPoint(-4.5F, -17.5F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(-4.5F, -19.5F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 46
		bodyModel[38].setRotationPoint(3F, -15.5F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(3F, -16.5F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[40].setRotationPoint(-9F, -17.5F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[41].setRotationPoint(-9F, -18.5F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[42].setRotationPoint(-8.75F, -17F, -0.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[43].setRotationPoint(-9F, -15.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[44].setRotationPoint(-9F, -18.5F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[45].setRotationPoint(-9F, -18.5F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[46].setRotationPoint(-9F, -19F, -1F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[47].setRotationPoint(-9F, -15F, -1F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 56
		bodyModel[48].setRotationPoint(-25.5F, -18.5F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 57
		bodyModel[49].setRotationPoint(-24F, -15.5F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 14, 14, 0F); // Box 58
		bodyModel[50].setRotationPoint(-23.01F, -14.5F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 31, 1, 20, 0F); // Box 59
		bodyModel[51].setRotationPoint(-21F, -5.5F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 60
		bodyModel[52].setRotationPoint(-17F, -10.5F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 61
		bodyModel[53].setRotationPoint(-20F, 3.5F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 62
		bodyModel[54].setRotationPoint(-9.5F, 5F, -6F);

		bodyModel[55].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 63 wheel
		bodyModel[55].setRotationPoint(-8.5F, 6F, -6F);

		bodyModel[56].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 64 wheel
		bodyModel[56].setRotationPoint(-8.5F, 6F, 6F);

		bodyModel[57].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 65 wheel
		bodyModel[57].setRotationPoint(1.5F, 6F, 6F);

		bodyModel[58].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 66 wheel
		bodyModel[58].setRotationPoint(1.5F, 6F, -6F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 67
		bodyModel[59].setRotationPoint(0.5F, 5F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 76
		bodyModel[60].setRotationPoint(-20F, 3.5F, 6F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 79
		bodyModel[61].setRotationPoint(-19F, 1.5F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 80
		bodyModel[62].setRotationPoint(-19F, 1.5F, 6F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 2, 12, 0F); // Box 97
		bodyModel[63].setRotationPoint(-19F, 5.5F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 107
		bodyModel[64].setRotationPoint(-23F, -2.5F, -9.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 108
		bodyModel[65].setRotationPoint(-21F, -4.5F, -9.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 109
		bodyModel[66].setRotationPoint(-21F, -4.5F, 7.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 110
		bodyModel[67].setRotationPoint(-23F, -2.5F, 7.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 105
		bodyModel[68].setRotationPoint(-6F, -7.5F, -9F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 106
		bodyModel[69].setRotationPoint(-3.5F, -7.5F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 107
		bodyModel[70].setRotationPoint(-3.5F, -10.5F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 108
		bodyModel[71].setRotationPoint(-6F, -10.5F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 109
		bodyModel[72].setRotationPoint(-5.5F, -8.5F, -8.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		bodyModel[73].setRotationPoint(-3F, -8.5F, -8.5F);

		bodyModel[74].addBox(0F, -1F, -1F, 9, 2, 2, 0F); // Box 111
		bodyModel[74].setRotationPoint(-15.5F, -3.5F, -7F);
		bodyModel[74].rotateAngleX = 0.78539816F;

		bodyModel[75].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Box 112
		bodyModel[75].setRotationPoint(-1.25F, -3.5F, -7F);
		bodyModel[75].rotateAngleX = 0.78539816F;

		bodyModel[76].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Box 113
		bodyModel[76].setRotationPoint(-2F, -3.5F, 7F);
		bodyModel[76].rotateAngleX = 0.78539816F;

		bodyModel[77].addBox(0F, -1F, -1F, 9, 2, 2, 0F); // Box 114
		bodyModel[77].setRotationPoint(-14F, -3.5F, 7F);
		bodyModel[77].rotateAngleX = 0.78539816F;

		bodyModel[78].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 115
		bodyModel[78].setRotationPoint(-14F, 4.25F, -5.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 116
		bodyModel[79].setRotationPoint(5F, 4.5F, -4.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 117
		bodyModel[80].setRotationPoint(-14F, 4.25F, 4.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 118
		bodyModel[81].setRotationPoint(-6.5F, -4F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 119
		bodyModel[82].setRotationPoint(-5F, -4F, 6F);

		bodyModel[83].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 122
		bodyModel[83].setRotationPoint(-8.5F, 7.5F, -7F);

		bodyModel[84].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 123
		bodyModel[84].setRotationPoint(-6F, 5F, -8F);

		bodyModel[85].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 124
		bodyModel[85].setRotationPoint(-6F, 3.5F, -8F);

		bodyModel[86].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 125
		bodyModel[86].setRotationPoint(-6F, 6.5F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 126
		bodyModel[87].setRotationPoint(-8F, 3.5F, -8.25F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 127
		bodyModel[88].setRotationPoint(-6F, 5F, -8F);
		bodyModel[88].rotateAngleZ = -0.27925268F;

		bodyModel[89].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 140
		bodyModel[89].setRotationPoint(-8.5F, 7.5F, 6F);

		bodyModel[90].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 141
		bodyModel[90].setRotationPoint(-6F, 5F, 7F);
		bodyModel[90].rotateAngleZ = -0.27925268F;

		bodyModel[91].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 142
		bodyModel[91].setRotationPoint(-8F, 3.5F, 7.25F);

		bodyModel[92].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 143
		bodyModel[92].setRotationPoint(-6F, 6.5F, 7F);

		bodyModel[93].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 144
		bodyModel[93].setRotationPoint(-6F, 5F, 7F);

		bodyModel[94].addBox(-7F, 0F, 0F, 8, 1, 1, 0F); // Box 145
		bodyModel[94].setRotationPoint(-6F, 3.5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146 lamp
		bodyModel[95].setRotationPoint(-26F, -18.5F, -1.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147 smoke
		bodyModel[96].setRotationPoint(-21.5F, -21.5F, -0.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 150 steam
		bodyModel[97].setRotationPoint(-15F, 2.5F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 151 steam
		bodyModel[98].setRotationPoint(-15F, 2.5F, -8F);

		bodyModel[99].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 155
		bodyModel[99].setRotationPoint(7F, 3.25F, 4.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 156
		bodyModel[100].setRotationPoint(16F, -1.5F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 157
		bodyModel[101].setRotationPoint(11F, 4.25F, 4.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[102].setRotationPoint(7F, 4.25F, 4.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 159
		bodyModel[103].setRotationPoint(6F, 3.25F, -5.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 160
		bodyModel[104].setRotationPoint(11F, 4.25F, -5.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 161
		bodyModel[105].setRotationPoint(7F, 3.25F, -5.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[106].setRotationPoint(7F, 4.25F, -5.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 163
		bodyModel[107].setRotationPoint(16F, 3.25F, -4.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		bodyModel[108].setRotationPoint(9F, -0.5F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 165
		bodyModel[109].setRotationPoint(0F, -1.5F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 86
		bodyModel[110].setRotationPoint(4F, -17.5F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 87
		bodyModel[111].setRotationPoint(4F, -16.5F, -0.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 175 glow
		bodyModel[112].setRotationPoint(15.5F, -6.5F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 176
		bodyModel[113].setRotationPoint(10F, -2.5F, 6F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Box 177
		bodyModel[114].setRotationPoint(23F, -16.5F, -10F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 178
		bodyModel[115].setRotationPoint(23F, -17.5F, -9F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Box 179
		bodyModel[116].setRotationPoint(23F, -16.5F, 6F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 180
		bodyModel[117].setRotationPoint(23F, -17.5F, 6F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 181
		bodyModel[118].setRotationPoint(15.5F, -9.5F, 3F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 182
		bodyModel[119].setRotationPoint(15.5F, -9.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[120].setRotationPoint(15.5F, -13.5F, -1F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 184
		bodyModel[121].setRotationPoint(15.5F, -12.5F, 1F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 185
		bodyModel[122].setRotationPoint(15F, -16.5F, 0F);
		bodyModel[122].rotateAngleY = 0.52359878F;

		bodyModel[123].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 186
		bodyModel[123].setRotationPoint(15.5F, -9.5F, 5F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 187
		bodyModel[124].setRotationPoint(16.51F, -13F, 0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[125].setRotationPoint(-21F, -8.5F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 189
		bodyModel[126].setRotationPoint(-20F, -6.5F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[127].setRotationPoint(-16F, -6.5F, -8F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[128].setRotationPoint(-17F, -6.5F, -9F);

		bodyModel[129].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 193
		bodyModel[129].setRotationPoint(-13F, -6.5F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 195
		bodyModel[130].setRotationPoint(-16F, -6.5F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 196
		bodyModel[131].setRotationPoint(-17F, -6.5F, 6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 197
		bodyModel[132].setRotationPoint(-20F, -6.5F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 199
		bodyModel[133].setRotationPoint(-21F, -8.5F, 7F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 200
		bodyModel[134].setRotationPoint(-17F, -6.5F, 8F);

		bodyModel[135].addBox(-1F, -1F, 0F, 2, 2, 2, 0F); // Box 201
		bodyModel[135].setRotationPoint(9F, -15.5F, -1F);
		bodyModel[135].rotateAngleZ = 0.78539816F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[136].setRotationPoint(8F, -20.5F, -0.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 203
		bodyModel[137].setRotationPoint(-7F, -13.5F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 204
		bodyModel[138].setRotationPoint(-6F, -13.5F, 5F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 205
		bodyModel[139].setRotationPoint(6F, -6F, 7F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 206
		bodyModel[140].setRotationPoint(6F, -8.5F, 7F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 207
		bodyModel[141].setRotationPoint(6.25F, -8.51F, 8.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 208
		bodyModel[142].setRotationPoint(8.75F, -8.51F, 8.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 209
		bodyModel[143].setRotationPoint(-4F, -7.5F, 7F);

		bodyModel[144].addBox(0F, 0F, 0F, 10, 2, 3, 0F); // Box 210
		bodyModel[144].setRotationPoint(17F, 3.5F, -1.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211 steam
		bodyModel[145].setRotationPoint(8F, -20.5F, -0.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 212
		bodyModel[146].setRotationPoint(15.5F, -10.5F, 8F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 217 mountpoint
		bodyModel[147].setRotationPoint(8F, 4.25F, -0.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 154 liveryimg 1
		bodyModel[148].setRotationPoint(-25F, -18F, -1.51F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 155 liveryimg 1
		bodyModel[149].setRotationPoint(-25F, -18F, 1.51F);

		bodyModel[150].addBox(0F, 0F, 0F, 10, 3, 0, 0F); // Box 156 liveryimg 2
		bodyModel[150].setRotationPoint(12F, -6.5F, -10.01F);

		bodyModel[151].addBox(0F, 0F, 0F, 10, 3, 0, 0F); // Box 157 liveryimg 2
		bodyModel[151].setRotationPoint(12F, -6.5F, 10.01F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 158
		bodyModel[152].setRotationPoint(-22F, -15.5F, -2F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 93
		bodyModel[153].setRotationPoint(-24F, 2.5F, -9F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 98
		bodyModel[154].setRotationPoint(-27F, 3.5F, -1.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 99
		bodyModel[155].setRotationPoint(-26F, 7.5F, -9F);

		bodyModel[156].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 100
		bodyModel[156].setRotationPoint(-24F, 6.5F, -5F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 101
		bodyModel[157].setRotationPoint(-24F, 6.5F, 4F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 4, 8, 0F); // Box 164
		bodyModel[158].setRotationPoint(-23F, 2.5F, -4F);
	}
}