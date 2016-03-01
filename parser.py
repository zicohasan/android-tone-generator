import fileinput

tc = ""
ts = ""
ti = ""

print "    Tone[] tones = new Tone[] {"

for line in fileinput.input():
    line = line.strip()
    if line.startswith("/*") or line.startswith("*"):
      plus = "*/" not in line
      line = line.strip("/*")
      line = line.strip("*/")
      line = line.strip("*")
      line = line.strip()
      if plus:
        line = "\"" + line + "\\n\" + \n"
      else:
        line = "\"" + line + "\\n\""
      tc = tc + line
    if line.startswith("public"):
      line = line.strip(";")
      line = line.strip()
      ll = line.split()
      ts = ll[4]
      ti = ll[6]
      print "            new Tone(" + ti +", \"" + ts + "\", " + tc + "),"

      tc = ""
      ts = ""
      ti = ""

print "    };"
