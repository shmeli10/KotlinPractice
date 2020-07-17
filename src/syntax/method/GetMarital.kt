package syntax.method

import data.type.enums.MaritalStatusEnum

fun getMaritalStatus(args: Array<String>): MaritalStatusEnum? =
        if (args.size > 2) {
            when (args[2]) {
                "Married" -> MaritalStatusEnum.Married
                "NotMarried" -> MaritalStatusEnum.NotMarried
                else -> MaritalStatusEnum.Unknown
            }
        } else null
