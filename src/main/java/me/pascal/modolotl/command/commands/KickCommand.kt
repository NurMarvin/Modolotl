package me.pascal.modolotl.command.commands

import me.pascal.modolotl.command.Command
import me.pascal.modolotl.command.CommandPermission
import net.dv8tion.jda.api.entities.Message

class KickCommand : Command("kick", CommandPermission.MOD){
    override fun handle(message: Message) {
        //TODO
    }
}