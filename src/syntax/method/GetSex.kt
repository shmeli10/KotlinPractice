package syntax.method

import syntax.data_type.enums.SexEnum

fun guessSex(args: Array<String>): SexEnum? =
        if (args.size > 3) {
                when (args[3]) {
                        "Male" -> SexEnum.Male
                        "Female" -> SexEnum.Female
                        else -> SexEnum.NonBinary
                }
        } else null