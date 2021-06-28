#!/bin/bash
# Required Functions
country_code() { #this function is for country codes
	echo -e "Please choose the best football team \n from following country?"
	echo "-------------------------------"
	echo "| Code       |  Country       |"
	echo "-------------------------------"
	echo "| BRZ        |  Brazil        |"
	echo "-------------------------------"
	echo "| ARG        |  Argentina     |"
	echo "-------------------------------"
	echo "| NEP        |  Nepal         |"
	echo "-------------------------------"
	echo "| CHI        |  China         |"
	echo "-------------------------------"
	echo "| ENG        |  England       |"
	echo "-------------------------------"
}
players_code(){ #this function is for player codes
	echo  "The list of best player of dear club of tarahara: " #use echo command
	echo "-------------------------------"
	echo "| Code    |  Player           |"
	echo "-------------------------------"
	echo "| LM      |  Lionel Messi     |"
	echo "-------------------------------"
	echo "| NJ      |  Neymar Junior    |"
	echo "-------------------------------"
	echo "| KC      |  Kiran Chemjong   |"
	echo "-------------------------------"
	echo "| ZZ      |  Zheng Zhi        |"
	echo "-------------------------------"
	echo "| HK      |  Harry Kane       |"
	echo "-------------------------------"
	player_choose
}
player_choose(){ #this is function for choosing the player
	echo "###################################################"
	echo "#       PLEASE!! CHOOSE THREE PLAYER              #"
	echo "###################################################"
	read a b c
	if [[ $a = $b || $a = $c || $b = $a || $b = $c || $c = $a || $c = $b  ]]
  	then
    	echo ""
	echo "##########################################################"
	echo "#       ERROR!! PLAYER CODE IS BEING REPEATED            #"	#this error message is for repeating the players code
	echo "##########################################################"
    	player_choose
    else
    	for player in $a $b $c
		do
			if ! [[ $player == LM || $player == NJ || $player == KC || $player == ZZ || $player == HK ]]
			then
				echo "###################################################"
				echo "#       ERROR!! GIVEN CODE IS INVALID             #"	#this error message is for giving invalid player code
				echo "###################################################"
				player_choose
			fi
		done
		num $a $b $c
    fi
}	
FileRead() {
	if [[ -f $1 ]]
	then
		cat $1
	else	
		echo "###################################################"
		echo "#       ERROR!! THE FILE IS NOT AVILABLE          #" #if player profile is not found this message pop up
		echo "###################################################"
		players_code
	fi
}

num() {
	if [[ $# != 3 ]]; then
		echo "###################################################"
		echo "#       ERROR!! PLEASE GIVE ONLY THREE CODES      #"	# three message pop if user give more than three players code
		echo "###################################################"
		player_choose
	else
		PS3="PLEASE CHOOSE THREE PLAYERS AMONG FOLLOWING BY TYPING NUMBER:"
		select player in $a $b $c
		do
			case $player in
				"LM") FileRead LM #this will read file named LM
				break
				;;
				"NJ") FileRead NJ #this will read file named NJ
				break
				;;
				"KC") FileRead KC #this will read file named KC
				break
				;;
				"ZZ") FileRead ZZ #this will read file named ZZ
				break
				;;
				"HK") FileRead HK #this will read file named HK
				break
				;;
				*) echo "###############################################################"
				   echo "#       ERROR!! PLEASE CHOOSE AMONG 1, 2, 3 NUMBERS ONLY      #"
				   echo "###############################################################"
			esac
		done
		echo ""
		echo ""
		echo "##########################################"
		echo "#       PRESS y/Y TO CONTINUE            #"
		echo "##########################################"
		read y
		if [[ $y = y || $y = Y ]]; #making condition to exit or continue pragram by typing either y/Y to continue or any key to exit
		then
			country_select
		else
			echo "######## ##     ##    ###    ##    ## ##    ## ##    ##  #######  ##     ##"
            echo "   ##    ##     ##   ## ##   ###   ## ##   ##   ##  ##  ##     ## ##     ##"
   			echo "   ##    ##     ##  ##   ##  ####  ## ##  ##     ####   ##     ## ##     ##"
   			echo "   ##    ######### ##     ## ## ## ## #####       ##    ##     ## ##     ##"
   			echo "   ##    ##     ## ######### ##  #### ##  ##      ##    ##     ## ##     ##"
   			echo "   ##    ##     ## ##     ## ##   ### ##   ##     ##    ##     ## ##     ##" 
   			echo "   ##    ##     ## ##     ## ##    ## ##    ##    ##     #######   ####### "
			exit
		fi
	fi
}
country_select(){ #this function is to select country
	country_code
	best_country=BRZ
	read country
	until [[ $country = $best_country ]]; do
		if [[ $country = ARG || $country = NEP || $country = CHI || $country = ENG ]]; then
			echo "$country is not the best football team."
			read country
		else
			echo "###################################################"
			echo "#       ERROR!! YOU HAVE TYPED INVALID CODE       #"
			echo "###################################################"
			read country
		fi
	done
	echo "Brazil is the country which have won the world cup for five times"
	players_code
}
while [[ True ]]; do #passing two arguments
	if [[ $# -le 1 ]]; then 
		echo "###################################################"
		echo "#       ERROR!! Please give both Name and ID      #"
		echo "###################################################"
		exit
	elif [[ $# -gt 2 ]]; then
		echo "###################################################"
		echo "#       ERROR!! Please give Name and ID only      #"
		echo "###################################################"
		exit
	fi
	secret_key=12345 #secret key for entering in program
	echo "###################################################"
	echo "#     Please give the secret key for entrance     #"
	echo "###################################################"
	read -s key
	count=4
	while [[ $key != $secret_key ]]; do
		if [[ $count -ge 1 ]]; then
			echo "###################################################"
			echo "#     ERROR!! YOU HAVE ONLY $count CHANCE LEFT    #"
			echo "###################################################"
			((count--)) #use of -- to decrease chance of giving secret key by 1
			read -s key #-s is used to hide secret key characters
		else
			echo "###########################################################################"
			echo "#       ERROR!! YOU HEVE ENTER WRONG SECRET KEY MORE THAN FOUR TIMES      #"
			echo "###########################################################################"
			exit
		fi
	done
	echo "##      ## ######## ##        ######   #######  ##     ## ########"
	echo "##  ##  ## ##       ##       ##       ##     ## ###   ### ##      "
	echo "##  ##  ## ##       ##       ##       ##     ## #### #### ##      " 
	echo "##  ##  ## ######   ##       ##       ##     ## ## ### ## ######  "
	echo "##  ##  ## ##       ##       ##       ##     ## ##     ## ##      "
	echo "##  ##  ## ##       ##       ##       ##     ## ##     ## ##      " 
 	echo " ###  ###  ######## ########  ######   #######  ##     ## ########"
	echo "_______________+++++++++Hello! YOUR ID IS $2 AND YOUR NAME IS $1+++++++++_________________"
	now="$(date)" #this show current time and date 
	printf "current time and date is %s--->\n""$now"
	echo ""
	country_select
done
echo "-------------"

