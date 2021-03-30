keywordsFile = open("C:\\Users\\slayz.JUANELV\\Documents\\Projects\\knowledge-cybersecurity-webservice\\python script\\keywords.csv", "r")
papersFile = open("C:\\Users\\slayz.JUANELV\\Documents\\Projects\\knowledge-cybersecurity-webservice\\python script\\papers.csv", "r")
outputFile = open("C:\\Users\\slayz.JUANELV\\Documents\\Projects\\knowledge-cybersecurity-webservice\\python script\\keywords_paper.csv", "w")
#print(keywordsFile.read())

keywords = {}
index = 1

def generateRow(currentPaperId, currentKeyword):
    currentKeyword = currentKeyword.strip().upper()
    if keywords.get(currentKeyword) != None:
        resultLine = currentPaperId + "|&|" + str(keywords.get(currentKeyword)) + "\n"
        outputFile.write(resultLine)
    else:
        print("Keyword not found:" + currentKeyword)

for line in keywordsFile:
    currentKeyword = line.strip().upper()
    #print(keywords.get(currentKeyword))
    if keywords.get(currentKeyword) == None:
        keywords[currentKeyword] = index
        index += 1

for lineIdx, line in enumerate(papersFile):
    if(lineIdx) == 0:
        continue
    #currentLine = line.strip()
    currentKeywords = ""
    try:
      delimiterIdx = line.index("|&|")
    except ValueError as e:
      print ('error type: ', type (e))
    currentPaperId = line[ 0 : delimiterIdx ]
    currentKeywords = line[ line.index("|&|") + 3 : ]
    if currentKeywords[len(currentKeywords)-1] == '\n':
        currentKeywords = line[ line.index("|&|") + 3 : -1 ]        
    paperIdFound = False
    keywordFound = False
    startIndex = 0
    endIndex = 0

    for idx in range(len(currentKeywords)):
        #almacenar hasta encontrar ; o hasta que sea el ultimo caracter
        #verificar si se debe crear una entrada en la tabla
        if currentKeywords[idx] == ';' or idx == (len(currentKeywords) - 1):
            endIndex = idx
            if idx == (len(currentKeywords) - 1):                
                generateRow(currentPaperId, currentKeywords[startIndex:])
            else:
                generateRow(currentPaperId, currentKeywords[startIndex:endIndex])
            startIndex = idx + 1

        
