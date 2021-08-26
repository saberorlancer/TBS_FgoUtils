<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2021/8/22
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!-- 引入样式 -->
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="1.png"></script>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
</head>
<body>
    <div id="app" class="ttk" style="background-image:url('/3.jpg');background-attachment: fixed">
        <el-card class="box-card">
        <el-form ref="form" :model="ttk" label-width="80px" method="get" action="test">
            <el-form-title>Battle 1/3</el-form-title>
            <el-form-item label="Servant 1号">
                <el-select v-model="ttk.tang_one.one_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.one_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.one_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.one_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.one_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.one_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Servant 2号">
                <el-select v-model="ttk.tang_one.two_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.two_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.two_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.two_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.two_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.two_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Servant 3号">
                <el-select v-model="ttk.tang_one.three_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.three_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.three_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.three_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.three_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.three_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="换人替补">
                <el-select v-model="ttk.tang_one.other_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.other_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.other_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.other_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.other_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.other_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
                <el-form-item label="Master技能">
                    <el-select v-model="ttk.tang_one.master_skill_one" style="width: 30%"         >
                        <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                    <el-select v-model="ttk.tang_one.master_skill_two" style="width: 30%"         >
                        <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                    <el-select v-model="ttk.tang_one.master_skill_three" style="width: 30%"         >
                        <el-option v-for = "item in options31" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                    <el-select v-model="ttk.tang_one.masterskill_one_who" style="width: 30%"         >
                        <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                    <el-select v-model="ttk.tang_one.masterskill_two_who" style="width: 30%"         >
                        <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                    <el-select v-model="ttk.tang_one.masterskill_three_who" style="width: 30%"         >
                        <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                    </el-select>
                </el-form-item>
            <el-form-item label="指令卡">
                <el-select v-model="ttk.tang_one.one" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.two" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_one.three" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-divider></el-divider>
            <el-form-title>Battle 2/3</el-form-title>
            <el-form-item label="Servant 1号">
                <el-select v-model="ttk.tang_two.one_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.one_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.one_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.one_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.one_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.one_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Servant 2号">
                <el-select v-model="ttk.tang_two.two_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.two_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.two_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.two_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.two_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.two_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Servant 3号">
                <el-select v-model="ttk.tang_two.three_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.three_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.three_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.three_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.three_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.three_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="换人替补">
                <el-select v-model="ttk.tang_two.other_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.other_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.other_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.other_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.other_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.other_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Master技能">
                <el-select v-model="ttk.tang_two.master_skill_one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.master_skill_two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.master_skill_three" style="width: 30%"         >
                    <el-option v-for = "item in options31" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.masterskill_one_who" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.masterskill_two_who" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.masterskill_three_who" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="指令卡">
                <el-select v-model="ttk.tang_two.one" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.two" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_two.three" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-divider></el-divider>
            <el-form-title>Battle 3/3</el-form-title>
            <el-form-item label="Servant 1号">
                <el-select v-model="ttk.tang_three.one_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.one_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.one_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.one_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.one_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.one_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Servant 2号">
                <el-select v-model="ttk.tang_three.two_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.two_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.two_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.two_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.two_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.two_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Servant 3号">
                <el-select v-model="ttk.tang_three.three_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.three_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.three_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.three_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.three_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.three_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="换人替补">
                <el-select v-model="ttk.tang_three.other_skill.one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.other_skill.two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.other_skill.three" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.other_skill.one_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.other_skill.two_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.other_skill.three_choose" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="Master技能">
                <el-select v-model="ttk.tang_three.master_skill_one" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.master_skill_two" style="width: 30%"         >
                    <el-option v-for = "item in options" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.master_skill_three" style="width: 30%"         >
                    <el-option v-for = "item in options31" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.masterskill_one_who" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.masterskill_two_who" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.masterskill_three_who" style="width: 30%"         >
                    <el-option v-for = "item in options2" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="指令卡">
                <el-select v-model="ttk.tang_three.one" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.two" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
                <el-select v-model="ttk.tang_three.three" style="width: 30%"         >
                    <el-option v-for = "item in options3" :key="item.value" :label="item.label" :value="item.value"></el-option>
                </el-select>
            </el-form-item>
            <el-divider></el-divider>
            <el-form-item>
                <el-button type="primary" @click="onSubmit">Start</el-button>
            </el-form-item>
        </el-form>
        </el-card>
    </div>
</body>
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                ttk: {
                    tang_one:{
                        one_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        two_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        three_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        other_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        master_skill_one:0,
                        master_skill_two:0,
                        master_skill_three:0,
                        masterskill_one_who:3,
                        masterskill_two_who:3,
                        masterskill_three_who:3,
                        one:4,
                        two:5,
                        three:6


                    },
                    tang_two: {
                        one_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        two_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        three_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        other_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        master_skill_one:0,
                        master_skill_two:0,
                        master_skill_three:0,
                        masterskill_one_who:3,
                        masterskill_two_who:3,
                        masterskill_three_who:3,
                        one:4,
                        two:5,
                        three:6


                    },
                    tang_three: {
                        one_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        two_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        three_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        other_skill:{
                            one:0,
                            two:0,
                            three:0,
                            one_choose:3,
                            two_choose:3,
                            three_choose:3
                        },
                        master_skill_one:0,
                        master_skill_two:0,
                        master_skill_three:0,
                        masterskill_one_who:3,
                        masterskill_two_who:3,
                        masterskill_three_who:3,
                        one:4,
                        two:5,
                        three:6


                    }
                },
                bbc:0
                ,
                options: [{
                    value: 0,
                    label: '不使用'
                }, {
                    value: 1,
                    label: '使用普通技能'
                }, {
                    value: 2,
                    label: '使用指向性技能'
                }],
                options31: [{
                    value: 0,
                    label: '不使用'
                }, {
                    value: 1,
                    label: '使用普通技能'
                }, {
                    value: 2,
                    label: '使用指向性技能'
                },{
                    value: 3,
                    label: '换人'
                }],
                options2: [{
                    value: 1,
                    label: '1号位'
                }, {
                    value: 2,
                    label: '2号位'
                }, {
                    value: 3,
                    label: '3号位'
                }],
                options3: [{
                    value: 1,
                    label: '宝具1'
                }, {
                    value: 2,
                    label: '宝具2'
                }, {
                    value: 3,
                    label: '宝具3'
                }, {
                    value: 4,
                    label: '指令卡1'
                }, {
                    value: 5,
                    label: '指令卡2'
                }, {
                    value: 6,
                    label: '指令卡3'
                }, {
                    value: 7,
                    label: '指令卡4'
                }, {
                    value: 8,
                    label: '指令卡5'
                }]
            }
        },
        methods: {
            onSubmit() {
                let j = this.ttk;
                console.log(j)
                axios.post('/fate/save',
                    j
                )
                    .then(function (response) {
                        console.log(response);
                    })
            }

        }
    })

</script>
<style>
    .box-card {
        width: 680px;
        margin:auto;
        filter:alpha(Opacity=85);
        -moz-opacity:0.85;
        opacity: 0.85;
    }
    .ttk {
        text-align: center;
    }
</style>
</html>
