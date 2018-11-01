import pymysql.cursors

nameList = []
for line in open("E:/appinfo.txt", "r"):
    line = line.strip('\n')
    nameList.append(line)

connect = pymysql.Connect(
    host='172.16.101.130',
    port=3306,
    user='eHRAdmin',
    passwd='shangde_wings',
    db='ehr',
    charset='utf8'
)

cursor = connect.cursor()

for name in nameList:
    sql = "SELECT nmanage_id,app_order FROM t_work_appmarket_app_info where status=%d AND app_name='%s'"
    data = (0, name)
    cursor.execute(sql % data)
    for row in cursor.fetchall():
        print("nmanageId:%s,apporder:%s" % row)


cursor.close()
connect.close()
