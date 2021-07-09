#file = "/III---II/Scripting Languages/Lab Programs/Program-3.rb"
puts "Enter the file name"
file = gets.chomp

#file name
fbname = File.basename file
puts "File Name : "+fbname

#base name
bname = File.basename file,".rb"
puts "Base Name : "+bname

#file extension 
fextn = File.extname file
puts "File Extension : "+fextn

#path name
pathname = File.dirname file
puts "Path Name : "+pathname