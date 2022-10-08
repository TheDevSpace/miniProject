INSERT INTO public.professor (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (1, '2021-04-24 12:22:06.716000', null, '2021-04-24 12:22:06.753000', 0, 'Joe Biden', 'Data Analytics');
INSERT INTO public.professor (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (2, '2021-04-24 12:23:22.181000', null, '2021-04-24 12:23:22.187000', 0, 'Arhtur', 'Web Development');
INSERT INTO public.professor (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (3, '2021-04-24 12:24:54.631000', null, '2021-04-24 12:24:54.632000', 0, 'Ben', 'Cloud systems and apps');
INSERT INTO public.professor (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (4, '2021-04-24 12:25:51.644000', null, '2021-04-24 12:25:51.646000', 0, 'Julia', 'International business');
INSERT INTO public.professor (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (5, '2021-04-24 12:34:49.375000', null, '2021-04-24 12:34:49.377000', 0, 'aaa', '111');

INSERT INTO public.contact (id, created_at, deleted_at, updated_at, version, address, phone_number, student_id_id)
VALUES (1, '2021-04-27 16:15:47.000000', null, '2021-04-27 16:15:49.000000', 0, 'Abay 48', '222', null);
INSERT INTO public.contact (id, created_at, deleted_at, updated_at, version, address, phone_number, student_id_id)
VALUES (2, '2021-04-24 12:00:32.222000', null, '2021-04-24 12:00:32.249000', 0, 'AlFarabi 32', '333', null);
INSERT INTO public.contact (id, created_at, deleted_at, updated_at, version, address, phone_number, student_id_id)
VALUES (3, '2021-04-24 12:00:32.222000', null, '2021-04-24 12:00:32.249000', 0, 'Tole bi 88', '222', null);
INSERT INTO public.contact (id, created_at, deleted_at, updated_at, version, address, phone_number, student_id_id)
VALUES (4, '2021-04-24 12:49:33.000000', null, '2021-04-24 12:49:36.000000', 0, 'Auezov 1', '777', null);

INSERT INTO public.major (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (1, '2021-04-27 16:18:22.000000', null, '2021-04-27 16:18:24.000000', 0, 'Computer scinse', 2);
INSERT INTO public.major (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (2, '2021-04-24 12:14:10.930000', null, '2021-04-24 12:14:10.931000', 0, 'Management', 3);
INSERT INTO public.major (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (3, '2021-04-24 12:15:03.082000', null, '2021-04-24 12:15:03.083000', 0, 'Cyber security', 4);
INSERT INTO public.major (id, created_at, deleted_at, updated_at, version, name, subject)
VALUES (4, '2021-04-24 12:15:59.512000', null, '2021-04-24 12:15:59.513000', 0, 'Data Science', 1);


INSERT INTO public.project (id, created_at, deleted_at, updated_at, version, due_date, task, major_id_id)
VALUES (1, '2021-04-27 16:20:43.000000', null, '2021-04-27 16:20:45.000000', 0, '2021-05-30 16:20:53.000000', 'University managment system', null);
INSERT INTO public.project (id, created_at, deleted_at, updated_at, version, due_date, task, major_id_id)
VALUES (2, '2021-04-24 12:39:35.287000', null, '2021-04-24 12:39:35.317000', 0, '2021-05-05 12:39:49.000000', 'International business strategy', null);
INSERT INTO public.project (id, created_at, deleted_at, updated_at, version, due_date, task, major_id_id)
VALUES (3, '2021-04-24 12:40:34.977000', null, '2021-04-24 12:40:34.978000', 0, '2021-04-30 12:43:11.000000', 'System', null);
INSERT INTO public.project (id, created_at, deleted_at, updated_at, version, due_date, task, major_id_id)
VALUES (4, '2021-04-24 12:43:05.685000', null, '2021-04-24 12:43:05.686000', 0, '2021-04-30 12:44:24.000000', 'Cloud', null);

INSERT INTO public.student (id, created_at, deleted_at, updated_at, version, name, contact_id_id, major_id_id, professor_id_id)
VALUES (1, '2021-04-27 16:24:06.000000', null, '2021-04-27 16:24:08.000000', 0, 'Sergey', 1, 1, 1);
INSERT INTO public.student (id, created_at, deleted_at, updated_at, version, name, contact_id_id, major_id_id, professor_id_id)
VALUES (2, '2021-04-24 12:47:15.007000', null, '2021-04-24 12:47:15.008000', 0, 'Ivan', 2, 2, 2);
INSERT INTO public.student (id, created_at, deleted_at, updated_at, version, name, contact_id_id, major_id_id, professor_id_id)
VALUES (3, '2021-04-24 12:47:21.935000', null, '2021-04-24 12:47:21.936000', 0, 'Anton', 3, 3, 3);
INSERT INTO public.student (id, created_at, deleted_at, updated_at, version, name, contact_id_id, major_id_id, professor_id_id)
VALUES (4, '2021-04-24 12:47:35.972000', null, '2021-04-24 12:47:35.974000', 0, 'Vladimir', 4, 4, 4);

INSERT INTO public.student_project_list (student_id_id, project_list_id) VALUES (1, 1);
INSERT INTO public.student_project_list (student_id_id, project_list_id) VALUES (2, 2);
INSERT INTO public.student_project_list (student_id_id, project_list_id) VALUES (3, 3);