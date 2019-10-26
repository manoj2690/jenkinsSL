def call(Map args){
	echo '>>>>>>>>>>>>>> args: $args'
	def out = sh script: '$args?.command', returnStdout: true
}