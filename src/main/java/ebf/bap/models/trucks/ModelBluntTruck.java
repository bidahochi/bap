//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.05.2020 - 00:13:12
// Last changed on: 13.05.2020 - 00:13:12

package ebf.bap.models.trucks; //Path where the model is located

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBluntTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBluntTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[74];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 96
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 47 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 85
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 95
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 98
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 99
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 100
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 102
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 104
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 105
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 106
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 110
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 111
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 122
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 123
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 124
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 79
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 80
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 81
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 82
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 83
		bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 84
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 85
		bodyModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 255
		bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 256
		bodyModel[28] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 88
		bodyModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 90
		bodyModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 93
		bodyModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 94
		bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 96
		bodyModel[36] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 97
		bodyModel[37] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 98
		bodyModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 99
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 100 wheel
		bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 101 wheel
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 102 wheel
		bodyModel[42] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 103
		bodyModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 104
		bodyModel[44] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 105
		bodyModel[45] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 106
		bodyModel[46] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 107
		bodyModel[47] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 110
		bodyModel[50] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 111
		bodyModel[51] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 112
		bodyModel[52] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 113
		bodyModel[53] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 114
		bodyModel[54] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 115
		bodyModel[55] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 116
		bodyModel[56] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 117
		bodyModel[57] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 118
		bodyModel[58] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 119
		bodyModel[59] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 120
		bodyModel[60] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 121
		bodyModel[61] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 122
		bodyModel[62] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 124
		bodyModel[64] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 125
		bodyModel[65] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 126
		bodyModel[66] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 127
		bodyModel[67] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 129
		bodyModel[69] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 130
		bodyModel[70] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 131
		bodyModel[71] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 133
		bodyModel[73] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 134

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-7F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(5F, 6F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 4, 13, 0F); // Box 96
		bodyModel[2].setRotationPoint(-3F, 4.75F, -6.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		bodyModel[3].setRotationPoint(-6F, 7F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 85
		bodyModel[4].setRotationPoint(-2.5F, 4F, -7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[5].setRotationPoint(-3F, 5F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[6].setRotationPoint(7F, 6F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 99
		bodyModel[7].setRotationPoint(-1.5F, 8F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[8].setRotationPoint(2.5F, 5F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[9].setRotationPoint(-10F, 4F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		bodyModel[10].setRotationPoint(9F, 5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[11].setRotationPoint(1.5F, 6F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F); // Box 106
		bodyModel[12].setRotationPoint(6.5F, 6F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[13].setRotationPoint(9F, 7.5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[14].setRotationPoint(3F, 5F, -8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 122
		bodyModel[15].setRotationPoint(-8F, 5.5F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 123
		bodyModel[16].setRotationPoint(3F, 5.5F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[17].setRotationPoint(-2F, 4.5F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[18].setRotationPoint(-7F, 6F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[19].setRotationPoint(5F, 6F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 80
		bodyModel[20].setRotationPoint(4F, 5.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 81
		bodyModel[21].setRotationPoint(-5F, 5.5F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 82
		bodyModel[22].setRotationPoint(-4F, 5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 83
		bodyModel[23].setRotationPoint(6F, 8F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[24].setRotationPoint(-7.5F, 5F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 85
		bodyModel[25].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[26].setRotationPoint(-1.5F, 4.5F, -8.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[27].setRotationPoint(-1.5F, 3.5F, -8.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 88
		bodyModel[28].setRotationPoint(-2.5F, 4.5F, -7.51F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 89
		bodyModel[29].setRotationPoint(0.5F, 4.5F, -7.51F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		bodyModel[30].setRotationPoint(1.5F, 8F, -7.51F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F); // Box 91
		bodyModel[31].setRotationPoint(-9F, 8F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[32].setRotationPoint(-10F, 7.5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 93
		bodyModel[33].setRotationPoint(-10F, 5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[34].setRotationPoint(-6.5F, 8F, -7.51F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 96
		bodyModel[35].setRotationPoint(-7.5F, 6F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[36].setRotationPoint(-9F, 6F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[37].setRotationPoint(8F, 4F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[38].setRotationPoint(-1F, 5F, -7.5F);

		bodyModel[39].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 100
		bodyModel[39].setRotationPoint(6F, 7F, -6F);

		bodyModel[40].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 101
		bodyModel[40].setRotationPoint(6F, 7F, 6F);

		bodyModel[41].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 102
		bodyModel[41].setRotationPoint(-6F, 7F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[42].setRotationPoint(-3F, 5F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[43].setRotationPoint(-1F, 5F, 6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 105
		bodyModel[44].setRotationPoint(-4F, 5F, 7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[45].setRotationPoint(3F, 5F, 7.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 107
		bodyModel[46].setRotationPoint(-1.5F, 8F, 6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 108
		bodyModel[47].setRotationPoint(-4.5F, 6F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[48].setRotationPoint(1.5F, 6F, 6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[49].setRotationPoint(-7.5F, 5F, 6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[50].setRotationPoint(2.5F, 5F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F); // Box 112
		bodyModel[51].setRotationPoint(6.5F, 6F, 7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 113
		bodyModel[52].setRotationPoint(-7.5F, 6F, 7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 114
		bodyModel[53].setRotationPoint(4F, 5.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 115
		bodyModel[54].setRotationPoint(-5F, 5.5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[55].setRotationPoint(5F, 6F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 117
		bodyModel[56].setRotationPoint(-7F, 6F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 118
		bodyModel[57].setRotationPoint(-9F, 8F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 119
		bodyModel[58].setRotationPoint(6F, 8F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[59].setRotationPoint(9F, 7.5F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[60].setRotationPoint(-10F, 7.5F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 122
		bodyModel[61].setRotationPoint(9F, 5F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[62].setRotationPoint(7F, 6F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[63].setRotationPoint(8F, 4F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
		bodyModel[64].setRotationPoint(-10F, 5F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 126
		bodyModel[65].setRotationPoint(-9F, 6F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[66].setRotationPoint(-10F, 4F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[67].setRotationPoint(1.5F, 8F, 7.51F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[68].setRotationPoint(-6.5F, 8F, 7.51F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 130
		bodyModel[69].setRotationPoint(-2.5F, 4.5F, 7.51F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 131
		bodyModel[70].setRotationPoint(0.5F, 4.5F, 7.51F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[71].setRotationPoint(-2.5F, 4F, 7.52F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 133
		bodyModel[72].setRotationPoint(-1.5F, 4.5F, 6.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[73].setRotationPoint(-1.5F, 3.5F, 6.25F);
	}
}