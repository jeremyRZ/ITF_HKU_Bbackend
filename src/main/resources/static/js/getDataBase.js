var mysql = require('mysql');

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    port: '3306',
    database: 'itf_hku'
});

connection.connect();
let resultArray = []
var sql = 'SELECT * FROM inspection';
//查
connection.query(sql, function (err, results) {
    if (err) {
        console.log('[SELECT ERROR] - ', err.message);
        return;
    }

    console.log('--------------------------SELECT----------------------------');
    for (var i = 0; i < results.length; i++) {
        results = JSON.stringify(results);//把results对象转为字符串，去掉RowDataPacket
        results = JSON.parse(results);//把results字符串转为json对象
        let resultJSON = results[i]['inspValues']
        let resultList = resultJSON.split("|")
        console.log(resultList)
        resultList.pop()
        // console.log(resultList)
        resultArray.push(resultList)
    }
    ;
    // console.log(resultArray)
    // // console.log(results);//[RowDataPacket {count:'1',type:'RangeError'},RowDataPacket{count:'3',type:'ReferenceError'}]
    // console.log('------------------------------------------------------------\n\n');
});

connection.end();
var arr = resultArray;
console.log(arr)
// 定义变量,存储要写入的内容
var str = '';

// 外层循环,生成tr标签,有一维单元,就循环生成几个tr标签
// 从第一个索引 0 开始,最终数值是索引下标的最大值 --- 数组.length-1
// 生成所有索引下标的数值
// 根据数组的结构,定义循环次数,起始数值一定是0,结束数值是索引下标的最大值
for (var i = 0; i <= arr.length - 1; i++) {
    // console.log(arr[i]);

    // 外层循环生成tr标签,循环几次,就生成几个tr标签
    // 因为tr标签中还要有td内容,要将两个tr标签,分开,写成拼接的形式
    str += '<tr>';
    // 定义tr标签的内容,也就是td单元格标签
    // 第一个单元格是单独生成的,不参与内层循环,是 当前 外层循环 索引下标+1
    str += `<td>${i + 1}</td>`;

    // 其他单元格,是内层循环生成的,循环的对象是二维数组
    // arr[i] 拿到的就是 每次循环,当前行,对应的二维数组
    // 循环的对象是 arr[i] , 生成 arr[i] 的所有的 索引下标
    // 通过索引下标,获取对应的数据
    // 起始数值是0 终止数值是 arr[i]的最大索引下标,arr[i]的length-1  arr[i].length-1
    for (var j = 0; j <= arr[i].length - 1; j++) {
        // 二维数组有几个单元,就循环几次,生成几个td单元个
        // 可以生成对应的单元格
        // 每一个单元的内容,就是当前二维数组单元的数据内容
        // 获取二维数组, 数组变量[一维索引][二维索引] 一维索引是i 二维索引是j
        // arr[i][j]
        str += `<td>${arr[i][j]}</td>`;
    }

    str += '</tr>';
}


// 将定义好的内容,写入到tbody标签中
// tb.innerHTML = str;
