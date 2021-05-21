//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.05.2020 - 18:37:44
// Last changed on: 15.05.2020 - 18:37:44

package ebf.bap.models.trucks; //Path where the model is located

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Modelcaboosetruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelcaboosetruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[73];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 16 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 36 axlecap
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 36 axlecap
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 36 axlecap
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 36 axlecap
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 44 wheel
		bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 45 wheel
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 46 wheel
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 28
		bodyModel[35] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 26
		bodyModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 26
		bodyModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 26
		bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 26
		bodyModel[39] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 91
		bodyModel[40] = new ModelRendererTurbo(this, 8, 23, textureX, textureY); // Box 91
		bodyModel[41] = new ModelRendererTurbo(this, 15, 23, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 22, 23, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 91
		bodyModel[44] = new ModelRendererTurbo(this, 94, 23, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 99, 23, textureX, textureY); // Box 17
		bodyModel[46] = new ModelRendererTurbo(this, 89, 23, textureX, textureY); // Box 17
		bodyModel[47] = new ModelRendererTurbo(this, 119, 23, textureX, textureY); // Box 17
		bodyModel[48] = new ModelRendererTurbo(this, 52, 23, textureX, textureY); // Box 91
		bodyModel[49] = new ModelRendererTurbo(this, 114, 23, textureX, textureY); // Box 17
		bodyModel[50] = new ModelRendererTurbo(this, 47, 23, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 75, 23, textureX, textureY); // Box 91
		bodyModel[52] = new ModelRendererTurbo(this, 82, 23, textureX, textureY); // Box 17 cull
		bodyModel[53] = new ModelRendererTurbo(this, 70, 23, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 91
		bodyModel[55] = new ModelRendererTurbo(this, 44, 23, textureX, textureY); // Box 91
		bodyModel[56] = new ModelRendererTurbo(this, 59, 23, textureX, textureY); // Box 91
		bodyModel[57] = new ModelRendererTurbo(this, 59, 25, textureX, textureY); // Box 91
		bodyModel[58] = new ModelRendererTurbo(this, 127, 23, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 189, 23, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 194, 23, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 184, 23, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 214, 23, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 147, 23, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 209, 23, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 142, 23, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 170, 23, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 177, 23, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 165, 23, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 136, 23, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 139, 23, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 154, 23, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 154, 25, textureX, textureY); // Box 73

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-2F, 5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-8F, 5F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(-7F, 5F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 14
		bodyModel[4].setRotationPoint(-7F, 6F, -8F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 16 wheel
		bodyModel[5].setRotationPoint(-6F, 7F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 22
		bodyModel[6].setRotationPoint(5F, 6F, -8F);

		bodyModel[7].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 axlecap
		bodyModel[7].setRotationPoint(-6F, 7F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[8].setRotationPoint(-5F, 6F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[9].setRotationPoint(-2F, 8F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 27
		bodyModel[10].setRotationPoint(2F, 6F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[11].setRotationPoint(-1F, 7F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[12].setRotationPoint(-5F, 7F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 30
		bodyModel[13].setRotationPoint(4F, 7F, -7.5F);

		bodyModel[14].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 axlecap
		bodyModel[14].setRotationPoint(6F, 7F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 32
		bodyModel[15].setRotationPoint(7F, 5F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 33
		bodyModel[16].setRotationPoint(-7F, 5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[17].setRotationPoint(-8F, 5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(-5F, 6F, 7F);

		bodyModel[19].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 axlecap
		bodyModel[19].setRotationPoint(-6F, 7F, 7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 38
		bodyModel[20].setRotationPoint(2F, 6F, 7F);

		bodyModel[21].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 36 axlecap
		bodyModel[21].setRotationPoint(6F, 7F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[22].setRotationPoint(7F, 5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(4F, 7F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[24].setRotationPoint(-5F, 7F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 43
		bodyModel[25].setRotationPoint(-1F, 6F, 6.5F);

		bodyModel[26].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 44 wheel
		bodyModel[26].setRotationPoint(6F, 7F, -6F);

		bodyModel[27].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 45 wheel
		bodyModel[27].setRotationPoint(6F, 7F, 6F);

		bodyModel[28].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[28].setRotationPoint(-6F, 7F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F); // Box 28
		bodyModel[29].setRotationPoint(-1F, 7F, 6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 43
		bodyModel[30].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[31].setRotationPoint(-1F, 7F, 4.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-1F, 6F, 4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 43
		bodyModel[33].setRotationPoint(-1F, 6F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -1.5F, 0F, -6F, -1.5F); // Box 28
		bodyModel[34].setRotationPoint(-1F, 7F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[35].setRotationPoint(-2F, 6F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[36].setRotationPoint(1F, 6F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[37].setRotationPoint(-2F, 6F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[38].setRotationPoint(1F, 6F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[39].setRotationPoint(-7F, 6F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[40].setRotationPoint(5F, 6F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-7F, 6F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(5F, 6F, -9F);

		bodyModel[43].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 91
		bodyModel[43].setRotationPoint(6F, 7F, 8F);
		bodyModel[43].rotateAngleZ = 0.78539816F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, -0.5F, 0F, -3.5F, -0.5F); // Box 17
		bodyModel[44].setRotationPoint(8.25F, 5F, 7.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[45].setRotationPoint(3F, 4.75F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.17F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.17F, -0.75F, 0F); // Box 17
		bodyModel[46].setRotationPoint(8F, 6.5F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[47].setRotationPoint(3F, 6F, 7F);

		bodyModel[48].addShapeBox(-0.75F, -0.75F, 0F, 2, 2, 1, 0F,0.125F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F); // Box 91
		bodyModel[48].setRotationPoint(7.75F, 4.5F, 8F);
		bodyModel[48].rotateAngleZ = 0.78539816F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[49].setRotationPoint(7.5F, 4.25F, 7F);

		bodyModel[50].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // Box 91
		bodyModel[50].setRotationPoint(7.75F, 4.5F, 8.5F);
		bodyModel[50].rotateAngleZ = 0.78539816F;

		bodyModel[51].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 91
		bodyModel[51].setRotationPoint(3.75F, 4F, 6.5F);
		bodyModel[51].rotateAngleZ = 0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, 0F, -0.58F, -0.25F, 0F, -0.58F, -0.25F, -0.01F, 0F, -0.25F, -0.01F); // Box 17 cull
		bodyModel[52].setRotationPoint(3.04F, 4F, 7F);

		bodyModel[53].addShapeBox(-0.25F, -0.25F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[53].setRotationPoint(3.75F, 4F, 8F);
		bodyModel[53].rotateAngleZ = 0.78539816F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, -0.5F, 0F, -0.37F, -0.5F); // Box 91
		bodyModel[54].setRotationPoint(7.22F, 4.5F, 8.5F);
		bodyModel[54].rotateAngleZ = -0.84212136F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.355F, 0F, 0F, -0.355F, 0F, 0F, -0.355F, -0.5F, 0F, -0.355F, -0.5F); // Box 91
		bodyModel[55].setRotationPoint(8.28F, 4.5F, 8.5F);
		bodyModel[55].rotateAngleZ = -0.33335789F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 91
		bodyModel[56].setRotationPoint(3.75F, 3.65F, 8F);
		bodyModel[56].rotateAngleZ = 0.09599311F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.235F, 0F, 0F, 0.235F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.235F, 0F, 0F, 0.235F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 91
		bodyModel[57].setRotationPoint(3.75F, 4.35F, 8F);
		bodyModel[57].rotateAngleZ = -0.33423055F;

		bodyModel[58].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(6F, 7F, -10F);
		bodyModel[58].rotateAngleZ = 0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 60
		bodyModel[59].setRotationPoint(8.25F, 5F, -8.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 61
		bodyModel[60].setRotationPoint(3F, 4.75F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.17F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.17F, -0.75F, 0F); // Box 62
		bodyModel[61].setRotationPoint(8F, 6.5F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 63
		bodyModel[62].setRotationPoint(3F, 6F, -8F);

		bodyModel[63].addShapeBox(-0.75F, -0.75F, 0F, 2, 2, 1, 0F,0.125F, 0.125F, -0.5F, -0.375F, 0.125F, -0.5F, -0.375F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, 0.125F, -0.375F, 0F); // Box 64
		bodyModel[63].setRotationPoint(7.75F, 4.5F, -9F);
		bodyModel[63].rotateAngleZ = 0.78539816F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[64].setRotationPoint(7.5F, 4.25F, -8F);

		bodyModel[65].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 66
		bodyModel[65].setRotationPoint(7.75F, 4.5F, -9.5F);
		bodyModel[65].rotateAngleZ = 0.78539816F;

		bodyModel[66].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[66].setRotationPoint(3.75F, 4F, -8.5F);
		bodyModel[66].rotateAngleZ = 0.78539816F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.01F, -0.58F, 0F, -0.01F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.01F, -0.58F, -0.25F, -0.01F, -0.58F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 68
		bodyModel[67].setRotationPoint(3.04F, 4F, -8F);

		bodyModel[68].addShapeBox(-0.25F, -0.25F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[68].setRotationPoint(3.75F, 4F, -9F);
		bodyModel[68].rotateAngleZ = 0.78539816F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.37F, -0.5F, 0F, -0.37F, -0.5F, 0F, -0.37F, 0F, 0F, -0.37F, 0F); // Box 70
		bodyModel[69].setRotationPoint(7.22F, 4.5F, -9.5F);
		bodyModel[69].rotateAngleZ = -0.84212136F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.355F, -0.5F, 0F, -0.355F, -0.5F, 0F, -0.355F, 0F, 0F, -0.355F, 0F); // Box 71
		bodyModel[70].setRotationPoint(8.28F, 4.5F, -9.5F);
		bodyModel[70].rotateAngleZ = -0.33335789F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0.02F, 0F, -0.5F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.02F, 0F, -0.5F, 0.02F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[71].setRotationPoint(3.75F, 3.65F, -9F);
		bodyModel[71].rotateAngleZ = 0.09599311F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0.235F, 0F, -0.5F, 0.235F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.235F, 0F, -0.5F, 0.235F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(3.75F, 4.35F, -9F);
		bodyModel[72].rotateAngleZ = -0.33423055F;
	}
}