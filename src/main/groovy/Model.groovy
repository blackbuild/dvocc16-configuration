import model.Config

Config.create {

    projects {
        project("DemoApp") {
            lead "Klaus Kleber"

            artifact {
                groupId "bla.blub"
                artifactId name
            }
            servers {
                server("DEV") {
                    hostname "bla.blub.com"
                }
                server("INT") {
                    hostname "bli.blub.com"
                }
                server("PROD") {
                    hostname "prod.blub.com"
                }
            }
            servers.each { it.value.basedir = "/data"}
        }
        project("DemoApp2") {
            lead "Gundula Gause"
            artifact {
                groupId "bli.blub"
                artifactId name
            }
            servers {
                server("DEV") {
                    hostname "bla.jo.com"
                }
                server("INT") {
                    hostname "bli.jo.com"
                }
                server("PROD") {
                    hostname "prod.jo.com"
                }
            }
            servers.each { it.value.basedir = "/data"}
        }
    }


}


