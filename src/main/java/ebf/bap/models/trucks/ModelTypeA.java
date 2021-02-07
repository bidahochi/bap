//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.02.2020 - 16:03:07
// Last changed on: 23.02.2020 - 16:03:07

package ebf.bap.models.trucks; //Path where the model is located

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTypeA extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTypeA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[78];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 56
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 57
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 60
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 65
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 66
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 67
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 71
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 96
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 46 wheel
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 47 wheel
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 48 wheel
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 47
		bodyModel[19] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 64
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 69
		bodyModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 70
		bodyModel[24] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 73
		bodyModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 75
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 76
		bodyModel[28] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		bodyModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 79
		bodyModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 81
		bodyModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 82
		bodyModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 82
		bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 84
		bodyModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 85
		bodyModel[36] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 87
		bodyModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 88
		bodyModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 89
		bodyModel[39] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 90
		bodyModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 91
		bodyModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 92
		bodyModel[42] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 93
		bodyModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 94
		bodyModel[44] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 95
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 96
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 97
		bodyModel[47] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 98
		bodyModel[48] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 99
		bodyModel[49] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 100
		bodyModel[50] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 101
		bodyModel[51] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 102
		bodyModel[52] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 103
		bodyModel[53] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 104
		bodyModel[54] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 105
		bodyModel[55] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 107
		bodyModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 108
		bodyModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 109
		bodyModel[59] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 110
		bodyModel[60] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 111
		bodyModel[61] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 112
		bodyModel[62] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 113
		bodyModel[63] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 114
		bodyModel[64] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 115
		bodyModel[65] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 116
		bodyModel[66] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 117
		bodyModel[67] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 118
		bodyModel[68] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 119
		bodyModel[69] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 120
		bodyModel[70] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 121
		bodyModel[71] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 122
		bodyModel[72] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 123
		bodyModel[73] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 124
		bodyModel[74] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 125
		bodyModel[75] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 126
		bodyModel[76] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 77

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 4
		bodyModel[0].setRotationPoint(-8F, 6F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 5
		bodyModel[1].setRotationPoint(6F, 6F, -8F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(7F, 7F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[3].setRotationPoint(-8F, 5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[4].setRotationPoint(-6F, 6F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[5].setRotationPoint(5F, 5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[6].setRotationPoint(-7.5F, 4F, -7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[7].setRotationPoint(-10F, 5.5F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[8].setRotationPoint(8F, 5.5F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[9].setRotationPoint(-7.5F, 4.5F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[10].setRotationPoint(-6F, 6.5F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[11].setRotationPoint(4F, 6.5F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		bodyModel[12].setRotationPoint(-4F, 6.5F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[13].setRotationPoint(-1F, 6F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 96
		bodyModel[14].setRotationPoint(-3F, 4.75F, -6.5F);

		bodyModel[15].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[15].setRotationPoint(-7F, 7F, 6F);

		bodyModel[16].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[16].setRotationPoint(-7F, 7F, -6F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[17].setRotationPoint(7F, 7F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 47
		bodyModel[18].setRotationPoint(-5F, 7.5F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[19].setRotationPoint(-6F, 7F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 63
		bodyModel[20].setRotationPoint(4.5F, 8.51F, -7.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 64
		bodyModel[21].setRotationPoint(10.5F, 5.51F, -7.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 69
		bodyModel[22].setRotationPoint(-11.5F, 8.51F, -7.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 70
		bodyModel[23].setRotationPoint(-10.5F, 5.51F, -7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[24].setRotationPoint(-11.5F, 4.5F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[25].setRotationPoint(-11.5F, 5.5F, -3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[26].setRotationPoint(-11.5F, 4.5F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[27].setRotationPoint(-11.5F, 4.5F, 2.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[28].setRotationPoint(10.5F, 4.5F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[29].setRotationPoint(10.5F, 4.5F, 2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[30].setRotationPoint(10.5F, 5.5F, -3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[31].setRotationPoint(10.5F, 4.5F, -3.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[32].setRotationPoint(6F, 6F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[33].setRotationPoint(-8F, 6F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 84
		bodyModel[34].setRotationPoint(-1.5F, 4F, -7.25F);

		bodyModel[35].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 85
		bodyModel[35].setRotationPoint(-3F, 4.5F, -6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 87
		bodyModel[36].setRotationPoint(3F, 6.5F, -7.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 88
		bodyModel[37].setRotationPoint(-10.5F, 4.5F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[38].setRotationPoint(-9.5F, 3.5F, -7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[39].setRotationPoint(7.5F, 3.5F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[40].setRotationPoint(4.5F, 4F, -7.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 92
		bodyModel[41].setRotationPoint(7.5F, 4.5F, -7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[42].setRotationPoint(5F, 7F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 94
		bodyModel[43].setRotationPoint(5F, 6F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[44].setRotationPoint(-7.5F, 4.5F, 6.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 96
		bodyModel[45].setRotationPoint(-10.5F, 4.5F, 6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[46].setRotationPoint(-10F, 5.5F, 6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[47].setRotationPoint(8F, 5.5F, 6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 99
		bodyModel[48].setRotationPoint(7.5F, 4.5F, 6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[49].setRotationPoint(4.5F, 4F, 6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[50].setRotationPoint(7.5F, 3.5F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[51].setRotationPoint(-9.5F, 3.5F, 6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[52].setRotationPoint(-7.5F, 4F, 6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		bodyModel[53].setRotationPoint(-4F, 6.5F, 6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[54].setRotationPoint(-1F, 6F, 6.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 106
		bodyModel[55].setRotationPoint(3F, 6.5F, 6.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[56].setRotationPoint(5F, 5F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 108
		bodyModel[57].setRotationPoint(5F, 6F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[58].setRotationPoint(5F, 7F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		bodyModel[59].setRotationPoint(-5F, 7.5F, 7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		bodyModel[60].setRotationPoint(-6F, 7F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[61].setRotationPoint(-6F, 6F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[62].setRotationPoint(-8F, 5F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[63].setRotationPoint(-8F, 6F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[64].setRotationPoint(6F, 6F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 116
		bodyModel[65].setRotationPoint(-11.5F, 4.5F, 3.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 117
		bodyModel[66].setRotationPoint(10.5F, 4.5F, 3.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 118
		bodyModel[67].setRotationPoint(4.5F, 8.51F, 6.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 119
		bodyModel[68].setRotationPoint(10.5F, 5.51F, 6.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 120
		bodyModel[69].setRotationPoint(-10.5F, 5.51F, 6.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 121
		bodyModel[70].setRotationPoint(-11.5F, 8.51F, 6.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 122
		bodyModel[71].setRotationPoint(-9F, 5.5F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 123
		bodyModel[72].setRotationPoint(3F, 5.5F, -5F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[73].setRotationPoint(-2F, 4.5F, -2F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[74].setRotationPoint(-1.5F, 4F, 6.25F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 126
		bodyModel[75].setRotationPoint(-3F, 4.5F, 6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 76
		bodyModel[76].setRotationPoint(4F, 6.5F, 6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(-6F, 6.5F, 6.5F);
	}
}