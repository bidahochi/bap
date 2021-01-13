License:
1. By contributing to the project you agree that Trains in Motion will have full and permanent inclusive rights to use, modify, remove, distribute, and advertise, any and all content provided, without your knowledge, consent, compensation, or credit.<br/>
2. You, as the content contributor, also retain full inclusive rights to the content provided to use, modify, distribute, and advertise as you see fit outside of Trains in Motion, commercially or otherwise.<br/>
3. Trains in Motion, it's staff, and it's contributors take no responsibility for the contributor's use of the content outside Trains in Motion.<br/>
4. By contributing content you agree that you have the necessary rights and, or ownership to do so under the terms defined by the EULA.<br/>
For the full license, please see: <a href="https://gitlab.com/EternalBlueFlame/trains-in-motion/-/blob/master/LICENSE.md">https://gitlab.com/EternalBlueFlame/trains-in-motion/-/blob/master/License.md

<h1>Trains in Motion:</h1>
<table>
<tr>
<td>
<h2>Art:</h2>
<ul>
<li> Models and textures must match the Mod's Art-style, including 2D, low-quality 3D, Normal 3D, and High-quality 3D.</li>
<li> Format is limited to <b>.java</b> models only; you can use tools such as FMT, BDCraft Cubik, SMP Toolbox, Technie, FMC or even writing it manually. FMT is free and the preferred editor due to varying shape support.<br/>FMT is available for free here:<ahref="https://github.com/Fexcraft/FMT-Standalone/releases">https://github.com/Fexcraft/FMT-Standalone/releases</a></li>
<li> Textures must be in <b>.png</b> format.</li>
<li> Audio must be in <b>.ogg</b> format and no more than 192kb/s.</li>
</ul>
</td>
<td>
<h2>Code Guidelines:</h2>
<ul>
<li> Code will be reviewed for optimizations and structure, if the issues are too large they will need to be fixed.</li>
<li> Code requires Intellij 2018, available <a href ="https://www.jetbrains.com/idea/download/other.html">here</a>, and will not work with 2019 or newer<br/>NOTE: 2018 can be installed alongside 2019 without any conflictions.<br/>NOTE:Eclipse should work, but is unsupported because I don't know how to use it. </li>
<li> Code requires JDK 8, however code must be compliant with JDK 7 at this time.</li>
<li> Regarding new features/behavior changes, please submit a new Suggestion to the issue tracker, or ask me on discord, before you write any code.</li>
<li> Workspace setup may use the idea option in the setup.bat, or by entering the following command manually, without quotes.<br/>NOTE: Powershell is not supported, use CMD. <br/>NOTE: do not run as admin/sudo.</li>
<li> Windows: "gradlew setupDecompWorkspace --refresh-dependencies idea"<br/>Linux/mac: "./gradlewLinux setupDecompWorkspace --refresh-dependencies idea"</li>
</ul>
<h2> Compiling:</h2>
<ul>
<li> Compiling requires java 1.8. Oracle JDK preferred, but OpenJDK should work as well.</li>
<li> Compiling also requires this java version as your system default, in windows this is done by going to Enviornment Variables in Advanced System Settings, and adding or changing "JAVA_HOME" to the install path of jdk 8.</li>
<li> Windows: "gradlew setupDecompWorkspace --refresh-dependencies build" Linux/mac: "./gradlewLinux setupDecompWorkspace --refresh-dependencies build"</li>
<li> The compiler may ask for a deobfuscator, by default it is located in:<br/>Windows: C:/Users/USERNAME/.gradle/caches/minecraft/net/minecraftforge/forge/1.7.10-10.13.4.1558-1.7.10/unpacked/conf/<br/>Linux:~/.gradle/caches/minecraft/net/minecraftforge/forge/1.7.10-10.13.4.1558-1.7.10/unpacked/conf/</li>
<li> the resulting .jar file will appear in the folder /build/libs</li>
</ul>
</td>
</tr>
</table>
<h1>TiM^2:</h1>
<ul>
<li> Models and textures must match the Mod's Art-style</li>
<li> Format is limited to <b>.java</b> models only; you can use tools such as FMT, BDCraft Cubik, SMP Toolbox, Technie, FMC or even writing it manually. FMT is free and the preferred editor due to varying shape support.<br/>FMT is available for free here:<ahref="https://github.com/Fexcraft/FMT-Standalone/releases">https://github.com/Fexcraft/FMT-Standalone/releases</a></li>
<li> Model scale is <b>0.75 meters, or, 12 microblocks, wide for the wheel base</b>, In other words they must fit on minecart rails. It is reccomended the body should be 1.25+ meters, or, 20+ microblocks, wide.</li>
<li> Technie models are required to be 512x512 resolution for textures. Models from other editors have a max resolution of 4096x4096 as defined in the editor.</li>
<li> Textures must be in <b>.png</b> format.</li>
<li> Audio must be in <b>.ogg</b> format and no more than 192kb/s.</li>
</ul>
</td>
<td>
<h2>Code Guidelines:</h2>
<ul><li>See above Code Guidelines for Trains in Motion.</li></ul>
<h2> Compiling:</h2>
<ul><li>See above Compiling for Trains in Motion.</li></ul>
</td>
</tr>
</table>
