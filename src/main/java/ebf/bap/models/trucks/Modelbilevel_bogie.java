//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.02.2019 - 13:30:05
// Last changed on: 01.02.2019 - 13:30:05

package ebf.bap.models.trucks; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Modelbilevel_bogie extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Modelbilevel_bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[63];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 178
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 185
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 186
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 187
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 188
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 192
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 30 wheel
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 46 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 47 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48 wheel
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 59
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 92
		bodyModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 46
		bodyModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 47
		bodyModel[28] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
		bodyModel[54] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 81
		bodyModel[58] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 82
		bodyModel[59] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 83
		bodyModel[60] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 84
		bodyModel[61] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 85
		bodyModel[62] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 86

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 178
		bodyModel[0].setRotationPoint(-8F, 6.5F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[1].setRotationPoint(-9.5F, 5F, -8.25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 186
		bodyModel[2].setRotationPoint(-9.5F, 8F, -8.25F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 187
		bodyModel[3].setRotationPoint(-9.5F, 6F, -8.25F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 188
		bodyModel[4].setRotationPoint(-6.5F, 6F, -8.25F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 192
		bodyModel[5].setRotationPoint(-1F, 3.5F, -1F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[6].setRotationPoint(7.5F, 7F, 6F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 wheel
		bodyModel[7].setRotationPoint(-7.5F, 7F, 6F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[8].setRotationPoint(-7.5F, 7F, -6F);

		bodyModel[9].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[9].setRotationPoint(7.5F, 7F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[10].setRotationPoint(-11F, 5.5F, -5.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[11].setRotationPoint(-11F, 4F, -5.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[12].setRotationPoint(-6F, 7.5F, -5.75F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 33
		bodyModel[13].setRotationPoint(-6F, 5.5F, -5.75F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 34
		bodyModel[14].setRotationPoint(-4F, 7.5F, -5.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[15].setRotationPoint(4F, 7.5F, -5.75F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 36
		bodyModel[16].setRotationPoint(4F, 5.5F, -5.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[17].setRotationPoint(4F, 4F, -5.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[18].setRotationPoint(9F, 5.5F, -5.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 39
		bodyModel[19].setRotationPoint(-4F, 7.5F, 4.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[20].setRotationPoint(-6F, 7.5F, 4.75F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 41
		bodyModel[21].setRotationPoint(-6F, 5.5F, 4.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[22].setRotationPoint(-11F, 4F, 4.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 43
		bodyModel[23].setRotationPoint(-11F, 5.5F, 4.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[24].setRotationPoint(4F, 7.5F, 4.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 45
		bodyModel[25].setRotationPoint(4F, 5.5F, 4.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[26].setRotationPoint(4F, 4F, 4.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[27].setRotationPoint(9F, 5.5F, 4.75F);

		bodyModel[28].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // Box 48
		bodyModel[28].setRotationPoint(-3F, 4.5F, -8F);

		bodyModel[29].addBox(-1.5F, 0F, -1.5F, 3, 1, 3, 0F); // Box 49
		bodyModel[29].setRotationPoint(0F, 3.5F, -6F);
		bodyModel[29].rotateAngleY = -0.78539816F;

		bodyModel[30].addBox(-1.5F, 0F, -1.5F, 3, 1, 3, 0F); // Box 50
		bodyModel[30].setRotationPoint(0F, 3.5F, 6F);
		bodyModel[30].rotateAngleY = -0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[31].setRotationPoint(-3F, 5.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[32].setRotationPoint(-3F, 7.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 54
		bodyModel[33].setRotationPoint(-3F, 7.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		bodyModel[34].setRotationPoint(-3F, 5.5F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 56
		bodyModel[35].setRotationPoint(-3F, 5.5F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 57
		bodyModel[36].setRotationPoint(-3F, 7.5F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 58
		bodyModel[37].setRotationPoint(8.5F, 6F, 7.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[38].setRotationPoint(5.5F, 8F, 7.25F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 60
		bodyModel[39].setRotationPoint(5.5F, 6F, 7.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[40].setRotationPoint(5.5F, 5F, 7.25F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 63
		bodyModel[41].setRotationPoint(7F, 6.5F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 66
		bodyModel[42].setRotationPoint(-4F, 4.5F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 67
		bodyModel[43].setRotationPoint(-5F, 4.5F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(-5F, 6.5F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 69
		bodyModel[45].setRotationPoint(-3F, 5.5F, 4F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 70
		bodyModel[46].setRotationPoint(-8.5F, 6F, -7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 71
		bodyModel[47].setRotationPoint(6.5F, 6F, -7.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 72
		bodyModel[48].setRotationPoint(-4F, 3.5F, -2F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 73
		bodyModel[49].setRotationPoint(3F, 3.5F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 74
		bodyModel[50].setRotationPoint(3F, 4.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[51].setRotationPoint(4F, 6.5F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 76
		bodyModel[52].setRotationPoint(4F, 4.5F, -7F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 77
		bodyModel[53].setRotationPoint(-5.5F, 5.5F, -8F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 78
		bodyModel[54].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 79
		bodyModel[55].setRotationPoint(-0.5F, 7.5F, -8F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 80
		bodyModel[56].setRotationPoint(-1.5F, 5.5F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 81
		bodyModel[57].setRotationPoint(-4.5F, 7.5F, 7F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 82
		bodyModel[58].setRotationPoint(-0.5F, 5.5F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 83
		bodyModel[59].setRotationPoint(2.5F, 6F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 84
		bodyModel[60].setRotationPoint(4.5F, 5.5F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 85
		bodyModel[61].setRotationPoint(-4F, 5.5F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 86
		bodyModel[62].setRotationPoint(3F, 5.5F, 4F);
	}
}