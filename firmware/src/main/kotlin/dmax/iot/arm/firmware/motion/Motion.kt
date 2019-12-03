package dmax.iot.arm.firmware.motion

import dmax.iot.arm.firmware.hardware.Hardware
import dmax.iot.arm.firmware.mechanics.Joint

class Motion(private val hardware: Hardware) {

    fun rotate(joint: Joint) = with(hardware) {
        when (joint) {
            is Joint.Base -> servo0
            is Joint.Elbow -> servo1
            is Joint.Wrist -> servo2
        }.rotate(joint.angle)
    }
}